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

package co.elastic.clients.elasticsearch._types;

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
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;

// typedef: _types.DocStats

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/_types/Stats.ts#L63-L66">API
 *      specification</a>
 */
@JsonpDeserializable
public class DocStats implements JsonpSerializable {
	private final long count;

	private final long deleted;

	// ---------------------------------------------------------------------------------------------

	private DocStats(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.deleted = ApiTypeHelper.requireNonNull(builder.deleted, this, "deleted");

	}

	public static DocStats of(Function<Builder, ObjectBuilder<DocStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code deleted}
	 */
	public final long deleted() {
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

		generator.writeKey("count");
		generator.write(this.count);

		generator.writeKey("deleted");
		generator.write(this.deleted);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DocStats}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DocStats> {
		private Long count;

		private Long deleted;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code deleted}
		 */
		public final Builder deleted(long value) {
			this.deleted = value;
			return this;
		}

		/**
		 * Builds a {@link DocStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DocStats build() {
			_checkSingleUse();

			return new DocStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DocStats}
	 */
	public static final JsonpDeserializer<DocStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DocStats::setupDocStatsDeserializer);

	protected static void setupDocStatsDeserializer(ObjectDeserializer<DocStats.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::deleted, JsonpDeserializer.longDeserializer(), "deleted");

	}

}
