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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Void;
import java.util.Objects;
import java.util.function.Function;

// typedef: _types.aggregations.UnmappedTermsAggregate

/**
 * Result of a <code>terms</code> aggregation when the field is unmapped.
 * <code>buckets</code> is always empty.
 * 
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/_types/aggregations/Aggregate.ts#L407-L413">API
 *      specification</a>
 */
@JsonpDeserializable
public class UnmappedTermsAggregate extends TermsAggregateBase<Void> implements AggregateVariant {
	// ---------------------------------------------------------------------------------------------

	private UnmappedTermsAggregate(Builder builder) {
		super(builder);

	}

	public static UnmappedTermsAggregate of(Function<Builder, ObjectBuilder<UnmappedTermsAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregate variant kind.
	 */
	@Override
	public Aggregate.Kind _aggregateKind() {
		return Aggregate.Kind.Umterms;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UnmappedTermsAggregate}.
	 */

	public static class Builder extends TermsAggregateBase.AbstractBuilder<Void, Builder>
			implements
				ObjectBuilder<UnmappedTermsAggregate> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UnmappedTermsAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UnmappedTermsAggregate build() {
			_checkSingleUse();
			super.tBucketSerializer(null);

			return new UnmappedTermsAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UnmappedTermsAggregate}
	 */
	public static final JsonpDeserializer<UnmappedTermsAggregate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UnmappedTermsAggregate::setupUnmappedTermsAggregateDeserializer);

	protected static void setupUnmappedTermsAggregateDeserializer(
			ObjectDeserializer<UnmappedTermsAggregate.Builder> op) {
		TermsAggregateBase.setupTermsAggregateBaseDeserializer(op, JsonpDeserializer.voidDeserializer());

	}

}
