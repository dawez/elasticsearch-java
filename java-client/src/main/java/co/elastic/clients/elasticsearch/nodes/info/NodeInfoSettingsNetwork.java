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

package co.elastic.clients.elasticsearch.nodes.info;

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

// typedef: nodes.info.NodeInfoSettingsNetwork

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#nodes.info.NodeInfoSettingsNetwork">API
 *      specification</a>
 */
@JsonpDeserializable
public class NodeInfoSettingsNetwork implements JsonpSerializable {
	private final String host;

	// ---------------------------------------------------------------------------------------------

	private NodeInfoSettingsNetwork(Builder builder) {

		this.host = ApiTypeHelper.requireNonNull(builder.host, this, "host");

	}

	public static NodeInfoSettingsNetwork of(Function<Builder, ObjectBuilder<NodeInfoSettingsNetwork>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code host}
	 */
	public final String host() {
		return this.host;
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

		generator.writeKey("host");
		generator.write(this.host);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoSettingsNetwork}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<NodeInfoSettingsNetwork> {
		private String host;

		/**
		 * Required - API name: {@code host}
		 */
		public final Builder host(String value) {
			this.host = value;
			return this;
		}

		/**
		 * Builds a {@link NodeInfoSettingsNetwork}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoSettingsNetwork build() {
			_checkSingleUse();

			return new NodeInfoSettingsNetwork(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoSettingsNetwork}
	 */
	public static final JsonpDeserializer<NodeInfoSettingsNetwork> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NodeInfoSettingsNetwork::setupNodeInfoSettingsNetworkDeserializer);

	protected static void setupNodeInfoSettingsNetworkDeserializer(
			ObjectDeserializer<NodeInfoSettingsNetwork.Builder> op) {

		op.add(Builder::host, JsonpDeserializer.stringDeserializer(), "host");

	}

}
