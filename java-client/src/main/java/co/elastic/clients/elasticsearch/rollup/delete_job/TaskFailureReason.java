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

package co.elastic.clients.elasticsearch.rollup.delete_job;

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

// typedef: rollup.delete_job.TaskFailureReason

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/rollup/delete_job/types.ts#L29-L32">API
 *      specification</a>
 */
@JsonpDeserializable
public class TaskFailureReason implements JsonpSerializable {
	private final String type;

	private final String reason;

	// ---------------------------------------------------------------------------------------------

	private TaskFailureReason(Builder builder) {

		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.reason = ApiTypeHelper.requireNonNull(builder.reason, this, "reason");

	}

	public static TaskFailureReason of(Function<Builder, ObjectBuilder<TaskFailureReason>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final String type() {
		return this.type;
	}

	/**
	 * Required - API name: {@code reason}
	 */
	public final String reason() {
		return this.reason;
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

		generator.writeKey("type");
		generator.write(this.type);

		generator.writeKey("reason");
		generator.write(this.reason);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TaskFailureReason}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TaskFailureReason> {
		private String type;

		private String reason;

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * Required - API name: {@code reason}
		 */
		public final Builder reason(String value) {
			this.reason = value;
			return this;
		}

		/**
		 * Builds a {@link TaskFailureReason}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TaskFailureReason build() {
			_checkSingleUse();

			return new TaskFailureReason(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TaskFailureReason}
	 */
	public static final JsonpDeserializer<TaskFailureReason> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TaskFailureReason::setupTaskFailureReasonDeserializer);

	protected static void setupTaskFailureReasonDeserializer(ObjectDeserializer<TaskFailureReason.Builder> op) {

		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::reason, JsonpDeserializer.stringDeserializer(), "reason");

	}

}
