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

package co.elastic.clients.elasticsearch.indices.analyze;

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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.analyze.TokenDetail

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/indices/analyze/types.ts#L63-L66">API
 *      specification</a>
 */
@JsonpDeserializable
public class TokenDetail implements JsonpSerializable {
	private final String name;

	private final List<ExplainAnalyzeToken> tokens;

	// ---------------------------------------------------------------------------------------------

	private TokenDetail(Builder builder) {

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.tokens = ApiTypeHelper.unmodifiableRequired(builder.tokens, this, "tokens");

	}

	public static TokenDetail of(Function<Builder, ObjectBuilder<TokenDetail>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - API name: {@code tokens}
	 */
	public final List<ExplainAnalyzeToken> tokens() {
		return this.tokens;
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

		if (ApiTypeHelper.isDefined(this.tokens)) {
			generator.writeKey("tokens");
			generator.writeStartArray();
			for (ExplainAnalyzeToken item0 : this.tokens) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TokenDetail}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TokenDetail> {
		private String name;

		private List<ExplainAnalyzeToken> tokens;

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - API name: {@code tokens}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>tokens</code>.
		 */
		public final Builder tokens(List<ExplainAnalyzeToken> list) {
			this.tokens = _listAddAll(this.tokens, list);
			return this;
		}

		/**
		 * Required - API name: {@code tokens}
		 * <p>
		 * Adds one or more values to <code>tokens</code>.
		 */
		public final Builder tokens(ExplainAnalyzeToken value, ExplainAnalyzeToken... values) {
			this.tokens = _listAdd(this.tokens, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code tokens}
		 * <p>
		 * Adds a value to <code>tokens</code> using a builder lambda.
		 */
		public final Builder tokens(Function<ExplainAnalyzeToken.Builder, ObjectBuilder<ExplainAnalyzeToken>> fn) {
			return tokens(fn.apply(new ExplainAnalyzeToken.Builder()).build());
		}

		/**
		 * Builds a {@link TokenDetail}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TokenDetail build() {
			_checkSingleUse();

			return new TokenDetail(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TokenDetail}
	 */
	public static final JsonpDeserializer<TokenDetail> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TokenDetail::setupTokenDetailDeserializer);

	protected static void setupTokenDetailDeserializer(ObjectDeserializer<TokenDetail.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::tokens, JsonpDeserializer.arrayDeserializer(ExplainAnalyzeToken._DESERIALIZER), "tokens");

	}

}
