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

package co.elastic.clients.elasticsearch.cluster.reroute;

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
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.reroute.CommandAllocatePrimaryAction

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/cluster/reroute/types.ts#L80-L86">API
 *      specification</a>
 */
@JsonpDeserializable
public class CommandAllocatePrimaryAction implements JsonpSerializable {
	private final String index;

	private final int shard;

	private final String node;

	private final boolean acceptDataLoss;

	// ---------------------------------------------------------------------------------------------

	private CommandAllocatePrimaryAction(Builder builder) {

		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.shard = ApiTypeHelper.requireNonNull(builder.shard, this, "shard");
		this.node = ApiTypeHelper.requireNonNull(builder.node, this, "node");
		this.acceptDataLoss = ApiTypeHelper.requireNonNull(builder.acceptDataLoss, this, "acceptDataLoss");

	}

	public static CommandAllocatePrimaryAction of(Function<Builder, ObjectBuilder<CommandAllocatePrimaryAction>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * Required - API name: {@code shard}
	 */
	public final int shard() {
		return this.shard;
	}

	/**
	 * Required - API name: {@code node}
	 */
	public final String node() {
		return this.node;
	}

	/**
	 * Required - If a node which has a copy of the data rejoins the cluster later
	 * on, that data will be deleted. To ensure that these implications are
	 * well-understood, this command requires the flag accept_data_loss to be
	 * explicitly set to true
	 * <p>
	 * API name: {@code accept_data_loss}
	 */
	public final boolean acceptDataLoss() {
		return this.acceptDataLoss;
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

		generator.writeKey("index");
		generator.write(this.index);

		generator.writeKey("shard");
		generator.write(this.shard);

		generator.writeKey("node");
		generator.write(this.node);

		generator.writeKey("accept_data_loss");
		generator.write(this.acceptDataLoss);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CommandAllocatePrimaryAction}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<CommandAllocatePrimaryAction> {
		private String index;

		private Integer shard;

		private String node;

		private Boolean acceptDataLoss;

		/**
		 * Required - API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - API name: {@code shard}
		 */
		public final Builder shard(int value) {
			this.shard = value;
			return this;
		}

		/**
		 * Required - API name: {@code node}
		 */
		public final Builder node(String value) {
			this.node = value;
			return this;
		}

		/**
		 * Required - If a node which has a copy of the data rejoins the cluster later
		 * on, that data will be deleted. To ensure that these implications are
		 * well-understood, this command requires the flag accept_data_loss to be
		 * explicitly set to true
		 * <p>
		 * API name: {@code accept_data_loss}
		 */
		public final Builder acceptDataLoss(boolean value) {
			this.acceptDataLoss = value;
			return this;
		}

		/**
		 * Builds a {@link CommandAllocatePrimaryAction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CommandAllocatePrimaryAction build() {
			_checkSingleUse();

			return new CommandAllocatePrimaryAction(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CommandAllocatePrimaryAction}
	 */
	public static final JsonpDeserializer<CommandAllocatePrimaryAction> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CommandAllocatePrimaryAction::setupCommandAllocatePrimaryActionDeserializer);

	protected static void setupCommandAllocatePrimaryActionDeserializer(
			ObjectDeserializer<CommandAllocatePrimaryAction.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::shard, JsonpDeserializer.integerDeserializer(), "shard");
		op.add(Builder::node, JsonpDeserializer.stringDeserializer(), "node");
		op.add(Builder::acceptDataLoss, JsonpDeserializer.booleanDeserializer(), "accept_data_loss");

	}

}
