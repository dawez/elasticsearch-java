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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.cat.help;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cat.help.HelpRecord

/**
 *
 * @see <a href="../../doc-files/api-spec.html#cat.help.HelpRecord">API
 *      specification</a>
 */
@JsonpDeserializable
public class HelpRecord implements JsonpSerializable {
	private final String endpoint;

	// ---------------------------------------------------------------------------------------------

	private HelpRecord(Builder builder) {

		this.endpoint = ApiTypeHelper.requireNonNull(builder.endpoint, this, "endpoint");

	}

	public static HelpRecord of(Function<Builder, ObjectBuilder<HelpRecord>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code endpoint}
	 */
	public final String endpoint() {
		return this.endpoint;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("endpoint");
		generator.write(this.endpoint);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HelpRecord}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<HelpRecord> {
		private String endpoint;

		/**
		 * Required - API name: {@code endpoint}
		 */
		public final Builder endpoint(String value) {
			this.endpoint = value;
			return this;
		}

		/**
		 * Builds a {@link HelpRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HelpRecord build() {
			_checkSingleUse();

			return new HelpRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HelpRecord}
	 */
	public static final JsonpDeserializer<HelpRecord> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			HelpRecord::setupHelpRecordDeserializer);

	protected static void setupHelpRecordDeserializer(ObjectDeserializer<HelpRecord.Builder> op) {

		op.add(Builder::endpoint, JsonpDeserializer.stringDeserializer(), "endpoint");

	}

}
