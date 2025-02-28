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

// typedef: watcher.deactivate_watch.Request

/**
 * Deactivates a currently active watch.
 * 
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/watcher/deactivate_watch/DeactivateWatchRequest.ts#L23-L32">API
 *      specification</a>
 */

public class DeactivateWatchRequest extends RequestBase {
	private final String watchId;

	// ---------------------------------------------------------------------------------------------

	private DeactivateWatchRequest(Builder builder) {

		this.watchId = ApiTypeHelper.requireNonNull(builder.watchId, this, "watchId");

	}

	public static DeactivateWatchRequest of(Function<Builder, ObjectBuilder<DeactivateWatchRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Watch ID
	 * <p>
	 * API name: {@code watch_id}
	 */
	public final String watchId() {
		return this.watchId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeactivateWatchRequest}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DeactivateWatchRequest> {
		private String watchId;

		/**
		 * Required - Watch ID
		 * <p>
		 * API name: {@code watch_id}
		 */
		public final Builder watchId(String value) {
			this.watchId = value;
			return this;
		}

		/**
		 * Builds a {@link DeactivateWatchRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeactivateWatchRequest build() {
			_checkSingleUse();

			return new DeactivateWatchRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code watcher.deactivate_watch}".
	 */
	public static final Endpoint<DeactivateWatchRequest, DeactivateWatchResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/watcher.deactivate_watch",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _watchId = 1 << 0;

				int propsSet = 0;

				propsSet |= _watchId;

				if (propsSet == (_watchId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_watcher");
					buf.append("/watch");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.watchId, buf);
					buf.append("/_deactivate");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, DeactivateWatchResponse._DESERIALIZER);
}
