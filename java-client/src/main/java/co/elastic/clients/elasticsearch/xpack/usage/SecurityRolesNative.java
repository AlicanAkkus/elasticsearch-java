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

package co.elastic.clients.elasticsearch.xpack.usage;

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
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;

// typedef: xpack.usage.SecurityRolesNative

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/xpack/usage/types.ts#L257-L261">API
 *      specification</a>
 */
@JsonpDeserializable
public class SecurityRolesNative implements JsonpSerializable {
	private final boolean dls;

	private final boolean fls;

	private final long size;

	// ---------------------------------------------------------------------------------------------

	private SecurityRolesNative(Builder builder) {

		this.dls = ApiTypeHelper.requireNonNull(builder.dls, this, "dls");
		this.fls = ApiTypeHelper.requireNonNull(builder.fls, this, "fls");
		this.size = ApiTypeHelper.requireNonNull(builder.size, this, "size");

	}

	public static SecurityRolesNative of(Function<Builder, ObjectBuilder<SecurityRolesNative>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code dls}
	 */
	public final boolean dls() {
		return this.dls;
	}

	/**
	 * Required - API name: {@code fls}
	 */
	public final boolean fls() {
		return this.fls;
	}

	/**
	 * Required - API name: {@code size}
	 */
	public final long size() {
		return this.size;
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

		generator.writeKey("dls");
		generator.write(this.dls);

		generator.writeKey("fls");
		generator.write(this.fls);

		generator.writeKey("size");
		generator.write(this.size);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SecurityRolesNative}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<SecurityRolesNative> {
		private Boolean dls;

		private Boolean fls;

		private Long size;

		/**
		 * Required - API name: {@code dls}
		 */
		public final Builder dls(boolean value) {
			this.dls = value;
			return this;
		}

		/**
		 * Required - API name: {@code fls}
		 */
		public final Builder fls(boolean value) {
			this.fls = value;
			return this;
		}

		/**
		 * Required - API name: {@code size}
		 */
		public final Builder size(long value) {
			this.size = value;
			return this;
		}

		/**
		 * Builds a {@link SecurityRolesNative}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SecurityRolesNative build() {
			_checkSingleUse();

			return new SecurityRolesNative(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SecurityRolesNative}
	 */
	public static final JsonpDeserializer<SecurityRolesNative> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SecurityRolesNative::setupSecurityRolesNativeDeserializer);

	protected static void setupSecurityRolesNativeDeserializer(ObjectDeserializer<SecurityRolesNative.Builder> op) {

		op.add(Builder::dls, JsonpDeserializer.booleanDeserializer(), "dls");
		op.add(Builder::fls, JsonpDeserializer.booleanDeserializer(), "fls");
		op.add(Builder::size, JsonpDeserializer.longDeserializer(), "size");

	}

}
