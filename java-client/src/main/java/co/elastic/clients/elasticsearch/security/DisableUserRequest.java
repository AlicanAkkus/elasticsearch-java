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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.Refresh;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.disable_user.Request

/**
 * Disables users in the native realm.
 * 
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/security/disable_user/SecurityDisableUserRequest.ts#L23-L35">API
 *      specification</a>
 */

public class DisableUserRequest extends RequestBase {
	@Nullable
	private final Refresh refresh;

	private final String username;

	// ---------------------------------------------------------------------------------------------

	private DisableUserRequest(Builder builder) {

		this.refresh = builder.refresh;
		this.username = ApiTypeHelper.requireNonNull(builder.username, this, "username");

	}

	public static DisableUserRequest of(Function<Builder, ObjectBuilder<DisableUserRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If <code>true</code> (the default) then refresh the affected shards to make
	 * this operation visible to search, if <code>wait_for</code> then wait for a
	 * refresh to make this operation visible to search, if <code>false</code> then
	 * do nothing with refreshes.
	 * <p>
	 * API name: {@code refresh}
	 */
	@Nullable
	public final Refresh refresh() {
		return this.refresh;
	}

	/**
	 * Required - The username of the user to disable
	 * <p>
	 * API name: {@code username}
	 */
	public final String username() {
		return this.username;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DisableUserRequest}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DisableUserRequest> {
		@Nullable
		private Refresh refresh;

		private String username;

		/**
		 * If <code>true</code> (the default) then refresh the affected shards to make
		 * this operation visible to search, if <code>wait_for</code> then wait for a
		 * refresh to make this operation visible to search, if <code>false</code> then
		 * do nothing with refreshes.
		 * <p>
		 * API name: {@code refresh}
		 */
		public final Builder refresh(@Nullable Refresh value) {
			this.refresh = value;
			return this;
		}

		/**
		 * Required - The username of the user to disable
		 * <p>
		 * API name: {@code username}
		 */
		public final Builder username(String value) {
			this.username = value;
			return this;
		}

		/**
		 * Builds a {@link DisableUserRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DisableUserRequest build() {
			_checkSingleUse();

			return new DisableUserRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.disable_user}".
	 */
	public static final Endpoint<DisableUserRequest, DisableUserResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.disable_user",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _username = 1 << 0;

				int propsSet = 0;

				propsSet |= _username;

				if (propsSet == (_username)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/user");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.username, buf);
					buf.append("/_disable");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.refresh != null) {
					params.put("refresh", request.refresh.jsonValue());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, DisableUserResponse._DESERIALIZER);
}
