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

package co.elastic.clients.elasticsearch.slm;

import co.elastic.clients.elasticsearch._types.AcknowledgedResponseBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;

// typedef: slm.stop.Response

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/slm/stop/StopSnapshotLifecycleManagementResponse.ts#L22-L22">API
 *      specification</a>
 */
@JsonpDeserializable
public class StopSlmResponse extends AcknowledgedResponseBase {
	// ---------------------------------------------------------------------------------------------

	private StopSlmResponse(Builder builder) {
		super(builder);

	}

	public static StopSlmResponse of(Function<Builder, ObjectBuilder<StopSlmResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StopSlmResponse}.
	 */

	public static class Builder extends AcknowledgedResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<StopSlmResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link StopSlmResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StopSlmResponse build() {
			_checkSingleUse();

			return new StopSlmResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StopSlmResponse}
	 */
	public static final JsonpDeserializer<StopSlmResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			StopSlmResponse::setupStopSlmResponseDeserializer);

	protected static void setupStopSlmResponseDeserializer(ObjectDeserializer<StopSlmResponse.Builder> op) {
		AcknowledgedResponseBase.setupAcknowledgedResponseBaseDeserializer(op);

	}

}
