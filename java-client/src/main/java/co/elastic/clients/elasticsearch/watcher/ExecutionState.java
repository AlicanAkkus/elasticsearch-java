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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.ExecutionState

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/watcher/_types/Action.ts#L92-L95">API
 *      specification</a>
 */
@JsonpDeserializable
public class ExecutionState implements JsonpSerializable {
	private final boolean successful;

	private final String timestamp;

	// ---------------------------------------------------------------------------------------------

	private ExecutionState(Builder builder) {

		this.successful = ApiTypeHelper.requireNonNull(builder.successful, this, "successful");
		this.timestamp = ApiTypeHelper.requireNonNull(builder.timestamp, this, "timestamp");

	}

	public static ExecutionState of(Function<Builder, ObjectBuilder<ExecutionState>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code successful}
	 */
	public final boolean successful() {
		return this.successful;
	}

	/**
	 * Required - API name: {@code timestamp}
	 */
	public final String timestamp() {
		return this.timestamp;
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

		generator.writeKey("successful");
		generator.write(this.successful);

		generator.writeKey("timestamp");
		generator.write(this.timestamp);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExecutionState}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ExecutionState> {
		private Boolean successful;

		private String timestamp;

		/**
		 * Required - API name: {@code successful}
		 */
		public final Builder successful(boolean value) {
			this.successful = value;
			return this;
		}

		/**
		 * Required - API name: {@code timestamp}
		 */
		public final Builder timestamp(String value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * Builds a {@link ExecutionState}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExecutionState build() {
			_checkSingleUse();

			return new ExecutionState(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExecutionState}
	 */
	public static final JsonpDeserializer<ExecutionState> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ExecutionState::setupExecutionStateDeserializer);

	protected static void setupExecutionStateDeserializer(ObjectDeserializer<ExecutionState.Builder> op) {

		op.add(Builder::successful, JsonpDeserializer.booleanDeserializer(), "successful");
		op.add(Builder::timestamp, JsonpDeserializer.stringDeserializer(), "timestamp");

	}

}
