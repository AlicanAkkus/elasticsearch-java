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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.validate_detector.Request

/**
 * Validates an anomaly detection detector.
 * 
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/ml/validate_detector/MlValidateDetectorRequest.ts#L23-L32">API
 *      specification</a>
 */
@JsonpDeserializable
public class ValidateDetectorRequest extends RequestBase implements JsonpSerializable {
	private final Detector detector;

	// ---------------------------------------------------------------------------------------------

	private ValidateDetectorRequest(Builder builder) {

		this.detector = ApiTypeHelper.requireNonNull(builder.detector, this, "detector");

	}

	public static ValidateDetectorRequest of(Function<Builder, ObjectBuilder<ValidateDetectorRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Request body.
	 * <p>
	 * API name: {@code _value_body}
	 */
	public final Detector detector() {
		return this.detector;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		this.detector.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ValidateDetectorRequest}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ValidateDetectorRequest> {
		private Detector detector;

		/**
		 * Required - Request body.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public final Builder detector(Detector value) {
			this.detector = value;
			return this;
		}

		/**
		 * Required - Request body.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public final Builder detector(Function<Detector.Builder, ObjectBuilder<Detector>> fn) {
			return this.detector(fn.apply(new Detector.Builder()).build());
		}

		/**
		 * Builds a {@link ValidateDetectorRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ValidateDetectorRequest build() {
			_checkSingleUse();

			return new ValidateDetectorRequest(this);
		}
	}

	public static final JsonpDeserializer<ValidateDetectorRequest> _DESERIALIZER = createValidateDetectorRequestDeserializer();
	protected static JsonpDeserializer<ValidateDetectorRequest> createValidateDetectorRequestDeserializer() {

		JsonpDeserializer<Detector> valueDeserializer = Detector._DESERIALIZER;

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(),
				(parser, mapper) -> new Builder().detector(valueDeserializer.deserialize(parser, mapper)).build());
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.validate_detector}".
	 */
	public static final Endpoint<ValidateDetectorRequest, ValidateDetectorResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.validate_detector",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_ml/anomaly_detectors/_validate/detector";

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, ValidateDetectorResponse._DESERIALIZER);
}
