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

package co.elastic.clients.elasticsearch._types.aggregations;

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

// typedef: _types.aggregations.TopMetricsValue

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.TopMetricsValue">API
 *      specification</a>
 */
@JsonpDeserializable
public class TopMetricsValue implements JsonpSerializable {
	private final String field;

	// ---------------------------------------------------------------------------------------------

	private TopMetricsValue(Builder builder) {

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");

	}

	public static TopMetricsValue of(Function<Builder, ObjectBuilder<TopMetricsValue>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code field}
	 */
	public final String field() {
		return this.field;
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

		generator.writeKey("field");
		generator.write(this.field);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TopMetricsValue}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TopMetricsValue> {
		private String field;

		/**
		 * Required - API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Builds a {@link TopMetricsValue}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TopMetricsValue build() {
			_checkSingleUse();

			return new TopMetricsValue(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TopMetricsValue}
	 */
	public static final JsonpDeserializer<TopMetricsValue> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TopMetricsValue::setupTopMetricsValueDeserializer);

	protected static void setupTopMetricsValueDeserializer(ObjectDeserializer<TopMetricsValue.Builder> op) {

		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");

	}

}
