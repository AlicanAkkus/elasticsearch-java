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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
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
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher.get_watch.Request

/**
 * Retrieves a watch by its ID.
 * 
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/watcher/get_watch/GetWatchRequest.ts#L23-L32">API
 *      specification</a>
 */

public class GetWatchRequest extends RequestBase {
	private final String id;

	// ---------------------------------------------------------------------------------------------

	private GetWatchRequest(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");

	}

	public static GetWatchRequest of(Function<Builder, ObjectBuilder<GetWatchRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Watch ID
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetWatchRequest}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetWatchRequest> {
		private String id;

		/**
		 * Required - Watch ID
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Builds a {@link GetWatchRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetWatchRequest build() {
			_checkSingleUse();

			return new GetWatchRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code watcher.get_watch}".
	 */
	public static final Endpoint<GetWatchRequest, GetWatchResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/watcher.get_watch",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;

				int propsSet = 0;

				propsSet |= _id;

				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_watcher");
					buf.append("/watch");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, GetWatchResponse._DESERIALIZER);
}
