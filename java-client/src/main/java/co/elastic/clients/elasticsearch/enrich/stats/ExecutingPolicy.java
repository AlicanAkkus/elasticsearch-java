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

package co.elastic.clients.elasticsearch.enrich.stats;

import co.elastic.clients.elasticsearch.tasks.Info;
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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: enrich.stats.ExecutingPolicy

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/enrich/stats/types.ts#L24-L27">API
 *      specification</a>
 */
@JsonpDeserializable
public class ExecutingPolicy implements JsonpSerializable {
	private final String name;

	private final Info task;

	// ---------------------------------------------------------------------------------------------

	private ExecutingPolicy(Builder builder) {

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.task = ApiTypeHelper.requireNonNull(builder.task, this, "task");

	}

	public static ExecutingPolicy of(Function<Builder, ObjectBuilder<ExecutingPolicy>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - API name: {@code task}
	 */
	public final Info task() {
		return this.task;
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

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("task");
		this.task.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExecutingPolicy}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ExecutingPolicy> {
		private String name;

		private Info task;

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - API name: {@code task}
		 */
		public final Builder task(Info value) {
			this.task = value;
			return this;
		}

		/**
		 * Required - API name: {@code task}
		 */
		public final Builder task(Function<Info.Builder, ObjectBuilder<Info>> fn) {
			return this.task(fn.apply(new Info.Builder()).build());
		}

		/**
		 * Builds a {@link ExecutingPolicy}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExecutingPolicy build() {
			_checkSingleUse();

			return new ExecutingPolicy(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExecutingPolicy}
	 */
	public static final JsonpDeserializer<ExecutingPolicy> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ExecutingPolicy::setupExecutingPolicyDeserializer);

	protected static void setupExecutingPolicyDeserializer(ObjectDeserializer<ExecutingPolicy.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::task, Info._DESERIALIZER, "task");

	}

}
