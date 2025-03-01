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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.CompareCondition

/**
 *
 * @see <a href="../doc-files/api-spec.html#watcher._types.CompareCondition">API
 *      specification</a>
 */
@JsonpDeserializable
public class CompareCondition implements ConditionVariant, JsonpSerializable {
	@Nullable
	private final String comparison;

	@Nullable
	private final String path;

	@Nullable
	private final JsonData value;

	// ---------------------------------------------------------------------------------------------

	private CompareCondition(Builder builder) {

		this.comparison = builder.comparison;
		this.path = builder.path;
		this.value = builder.value;

	}

	public static CompareCondition of(Function<Builder, ObjectBuilder<CompareCondition>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Condition variant kind.
	 */
	@Override
	public Condition.Kind _conditionKind() {
		return Condition.Kind.Compare;
	}

	/**
	 * API name: {@code comparison}
	 */
	@Nullable
	public final String comparison() {
		return this.comparison;
	}

	/**
	 * API name: {@code path}
	 */
	@Nullable
	public final String path() {
		return this.path;
	}

	/**
	 * API name: {@code value}
	 */
	@Nullable
	public final JsonData value() {
		return this.value;
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

		if (this.comparison != null) {
			generator.writeKey("comparison");
			generator.write(this.comparison);

		}
		if (this.path != null) {
			generator.writeKey("path");
			generator.write(this.path);

		}
		if (this.value != null) {
			generator.writeKey("value");
			this.value.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CompareCondition}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<CompareCondition> {
		@Nullable
		private String comparison;

		@Nullable
		private String path;

		@Nullable
		private JsonData value;

		/**
		 * API name: {@code comparison}
		 */
		public final Builder comparison(@Nullable String value) {
			this.comparison = value;
			return this;
		}

		/**
		 * API name: {@code path}
		 */
		public final Builder path(@Nullable String value) {
			this.path = value;
			return this;
		}

		/**
		 * API name: {@code value}
		 */
		public final Builder value(@Nullable JsonData value) {
			this.value = value;
			return this;
		}

		/**
		 * Builds a {@link CompareCondition}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CompareCondition build() {
			_checkSingleUse();

			return new CompareCondition(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CompareCondition}
	 */
	public static final JsonpDeserializer<CompareCondition> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CompareCondition::setupCompareConditionDeserializer);

	protected static void setupCompareConditionDeserializer(ObjectDeserializer<CompareCondition.Builder> op) {

		op.add(Builder::comparison, JsonpDeserializer.stringDeserializer(), "comparison");
		op.add(Builder::path, JsonpDeserializer.stringDeserializer(), "path");
		op.add(Builder::value, JsonData._DESERIALIZER, "value");

	}

}
