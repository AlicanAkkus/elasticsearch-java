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

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.elasticsearch.security.put_privileges.Actions;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.endpoints.DictionaryResponse;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

// typedef: security.get_privileges.Response

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/security/get_privileges/SecurityGetPrivilegesResponse.ts#L24-L27">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetPrivilegesResponse extends DictionaryResponse<String, Map<String, Actions>> {
	// ---------------------------------------------------------------------------------------------

	private GetPrivilegesResponse(Builder builder) {
		super(builder);

	}

	public static GetPrivilegesResponse of(Function<Builder, ObjectBuilder<GetPrivilegesResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetPrivilegesResponse}.
	 */

	public static class Builder extends DictionaryResponse.AbstractBuilder<String, Map<String, Actions>, Builder>
			implements
				ObjectBuilder<GetPrivilegesResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetPrivilegesResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetPrivilegesResponse build() {
			_checkSingleUse();
			super.tKeySerializer(null);
			super.tValueSerializer(null);

			return new GetPrivilegesResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetPrivilegesResponse}
	 */
	public static final JsonpDeserializer<GetPrivilegesResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetPrivilegesResponse::setupGetPrivilegesResponseDeserializer);

	protected static void setupGetPrivilegesResponseDeserializer(ObjectDeserializer<GetPrivilegesResponse.Builder> op) {
		DictionaryResponse.setupDictionaryResponseDeserializer(op, JsonpDeserializer.stringDeserializer(),
				JsonpDeserializer.stringMapDeserializer(Actions._DESERIALIZER));

	}

}
