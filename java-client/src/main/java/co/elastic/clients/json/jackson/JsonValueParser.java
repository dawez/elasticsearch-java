/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.json.jackson;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import jakarta.json.JsonArray;
import jakarta.json.JsonArrayBuilder;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.spi.JsonProvider;
import jakarta.json.stream.JsonParsingException;

import java.io.IOException;

/**
 * Reads a Jsonp value/object/array from a Jackson parser. The parser's current token should be the start of the
 * object (e.g. START_OBJECT, VALUE_NUMBER, etc).
 */
class JsonValueParser {
    private final JsonProvider provider = JsonProvider.provider();

    public JsonObject parseObject(JsonParser parser) throws IOException {

        JsonObjectBuilder ob = provider.createObjectBuilder();

        JsonToken token;
        while((token = parser.nextToken()) != JsonToken.END_OBJECT) {
            if (token != JsonToken.FIELD_NAME) {
                throw new JsonParsingException("Expected a property name", new JacksonJsonpLocation(parser));
            }
            String name = parser.getCurrentName();
            parser.nextToken();
            ob.add(name, parseValue(parser));
        }
        return ob.build();
    }

    public JsonArray parseArray(JsonParser parser) throws IOException {
        JsonArrayBuilder ab = provider.createArrayBuilder();

        while(parser.nextToken() != JsonToken.END_ARRAY) {
            ab.add(parseValue(parser));
        }
        return ab.build();
    }

    public JsonValue parseValue(JsonParser parser) throws IOException {
        switch (parser.currentToken()) {
            case START_OBJECT:
                return parseObject(parser);

            case START_ARRAY:
                return parseArray(parser);

            case VALUE_TRUE:
                return JsonValue.TRUE;

            case VALUE_FALSE:
                return JsonValue.FALSE;

            case VALUE_NULL:
                return JsonValue.NULL;

            case VALUE_STRING:
                return provider.createValue(parser.getText());

            case VALUE_NUMBER_FLOAT:
            case VALUE_NUMBER_INT:
                switch(parser.getNumberType()) {
                    case INT:
                        return provider.createValue(parser.getIntValue());
                    case LONG:
                        return provider.createValue(parser.getLongValue());
                    case FLOAT:
                    case DOUBLE:
                        return provider.createValue(parser.getDoubleValue());
                    case BIG_DECIMAL:
                        return provider.createValue(parser.getDecimalValue());
                    case BIG_INTEGER:
                        return provider.createValue(parser.getBigIntegerValue());
                }

            default:
                throw new JsonParsingException("Unexpected token '" + parser.currentToken() + "'", new JacksonJsonpLocation(parser));

        }
    }
}
