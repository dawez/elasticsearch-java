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

package co.elastic.clients.elasticsearch.ilm;

import co.elastic.clients.elasticsearch.ilm.get_lifecycle.Lifecycle;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.endpoints.DictionaryResponse;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;

// typedef: ilm.get_lifecycle.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#ilm.get_lifecycle.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetLifecycleResponse extends DictionaryResponse<String, Lifecycle> {
	// ---------------------------------------------------------------------------------------------

	private GetLifecycleResponse(Builder builder) {
		super(builder);

	}

	public static GetLifecycleResponse of(Function<Builder, ObjectBuilder<GetLifecycleResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetLifecycleResponse}.
	 */

	public static class Builder extends DictionaryResponse.AbstractBuilder<String, Lifecycle, Builder>
			implements
				ObjectBuilder<GetLifecycleResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetLifecycleResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetLifecycleResponse build() {
			_checkSingleUse();
			super.tKeySerializer(null);
			super.tValueSerializer(null);

			return new GetLifecycleResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetLifecycleResponse}
	 */
	public static final JsonpDeserializer<GetLifecycleResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetLifecycleResponse::setupGetLifecycleResponseDeserializer);

	protected static void setupGetLifecycleResponseDeserializer(ObjectDeserializer<GetLifecycleResponse.Builder> op) {
		DictionaryResponse.setupDictionaryResponseDeserializer(op, JsonpDeserializer.stringDeserializer(),
				Lifecycle._DESERIALIZER);

	}

}
