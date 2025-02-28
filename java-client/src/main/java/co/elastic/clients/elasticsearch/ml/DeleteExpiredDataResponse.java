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

// typedef: ml.delete_expired_data.Response

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/ml/delete_expired_data/MlDeleteExpiredDataResponse.ts#L20-L22">API
 *      specification</a>
 */
@JsonpDeserializable
public class DeleteExpiredDataResponse implements JsonpSerializable {
	private final boolean deleted;

	// ---------------------------------------------------------------------------------------------

	private DeleteExpiredDataResponse(Builder builder) {

		this.deleted = ApiTypeHelper.requireNonNull(builder.deleted, this, "deleted");

	}

	public static DeleteExpiredDataResponse of(Function<Builder, ObjectBuilder<DeleteExpiredDataResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code deleted}
	 */
	public final boolean deleted() {
		return this.deleted;
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

		generator.writeKey("deleted");
		generator.write(this.deleted);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteExpiredDataResponse}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DeleteExpiredDataResponse> {
		private Boolean deleted;

		/**
		 * Required - API name: {@code deleted}
		 */
		public final Builder deleted(boolean value) {
			this.deleted = value;
			return this;
		}

		/**
		 * Builds a {@link DeleteExpiredDataResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteExpiredDataResponse build() {
			_checkSingleUse();

			return new DeleteExpiredDataResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DeleteExpiredDataResponse}
	 */
	public static final JsonpDeserializer<DeleteExpiredDataResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DeleteExpiredDataResponse::setupDeleteExpiredDataResponseDeserializer);

	protected static void setupDeleteExpiredDataResponseDeserializer(
			ObjectDeserializer<DeleteExpiredDataResponse.Builder> op) {

		op.add(Builder::deleted, JsonpDeserializer.booleanDeserializer(), "deleted");

	}

}
