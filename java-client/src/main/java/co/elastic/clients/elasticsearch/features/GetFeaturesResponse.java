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

package co.elastic.clients.elasticsearch.features;

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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: features.get_features.Response

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/features/get_features/GetFeaturesResponse.ts#L22-L26">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetFeaturesResponse implements JsonpSerializable {
	private final List<Feature> features;

	// ---------------------------------------------------------------------------------------------

	private GetFeaturesResponse(Builder builder) {

		this.features = ApiTypeHelper.unmodifiableRequired(builder.features, this, "features");

	}

	public static GetFeaturesResponse of(Function<Builder, ObjectBuilder<GetFeaturesResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code features}
	 */
	public final List<Feature> features() {
		return this.features;
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

		if (ApiTypeHelper.isDefined(this.features)) {
			generator.writeKey("features");
			generator.writeStartArray();
			for (Feature item0 : this.features) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetFeaturesResponse}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetFeaturesResponse> {
		private List<Feature> features;

		/**
		 * Required - API name: {@code features}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>features</code>.
		 */
		public final Builder features(List<Feature> list) {
			this.features = _listAddAll(this.features, list);
			return this;
		}

		/**
		 * Required - API name: {@code features}
		 * <p>
		 * Adds one or more values to <code>features</code>.
		 */
		public final Builder features(Feature value, Feature... values) {
			this.features = _listAdd(this.features, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code features}
		 * <p>
		 * Adds a value to <code>features</code> using a builder lambda.
		 */
		public final Builder features(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return features(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * Builds a {@link GetFeaturesResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetFeaturesResponse build() {
			_checkSingleUse();

			return new GetFeaturesResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetFeaturesResponse}
	 */
	public static final JsonpDeserializer<GetFeaturesResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetFeaturesResponse::setupGetFeaturesResponseDeserializer);

	protected static void setupGetFeaturesResponseDeserializer(ObjectDeserializer<GetFeaturesResponse.Builder> op) {

		op.add(Builder::features, JsonpDeserializer.arrayDeserializer(Feature._DESERIALIZER), "features");

	}

}
