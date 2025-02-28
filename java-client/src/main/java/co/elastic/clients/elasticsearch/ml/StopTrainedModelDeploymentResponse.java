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
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;

// typedef: ml.stop_trained_model_deployment.Response

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/ml/stop_trained_model_deployment/MlStopTrainedModelDeploymentResponse.ts#L20-L22">API
 *      specification</a>
 */
@JsonpDeserializable
public class StopTrainedModelDeploymentResponse implements JsonpSerializable {
	private final boolean stopped;

	// ---------------------------------------------------------------------------------------------

	private StopTrainedModelDeploymentResponse(Builder builder) {

		this.stopped = ApiTypeHelper.requireNonNull(builder.stopped, this, "stopped");

	}

	public static StopTrainedModelDeploymentResponse of(
			Function<Builder, ObjectBuilder<StopTrainedModelDeploymentResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code stopped}
	 */
	public final boolean stopped() {
		return this.stopped;
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

		generator.writeKey("stopped");
		generator.write(this.stopped);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StopTrainedModelDeploymentResponse}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<StopTrainedModelDeploymentResponse> {
		private Boolean stopped;

		/**
		 * Required - API name: {@code stopped}
		 */
		public final Builder stopped(boolean value) {
			this.stopped = value;
			return this;
		}

		/**
		 * Builds a {@link StopTrainedModelDeploymentResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StopTrainedModelDeploymentResponse build() {
			_checkSingleUse();

			return new StopTrainedModelDeploymentResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StopTrainedModelDeploymentResponse}
	 */
	public static final JsonpDeserializer<StopTrainedModelDeploymentResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					StopTrainedModelDeploymentResponse::setupStopTrainedModelDeploymentResponseDeserializer);

	protected static void setupStopTrainedModelDeploymentResponseDeserializer(
			ObjectDeserializer<StopTrainedModelDeploymentResponse.Builder> op) {

		op.add(Builder::stopped, JsonpDeserializer.booleanDeserializer(), "stopped");

	}

}
