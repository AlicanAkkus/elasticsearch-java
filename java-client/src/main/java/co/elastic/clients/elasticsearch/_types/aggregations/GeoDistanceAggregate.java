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
import java.util.Objects;
import java.util.function.Function;

// typedef: _types.aggregations.GeoDistanceAggregate

/**
 * Result of a <code>geo_distance</code> aggregation. The unit for
 * <code>from</code> and <code>to</code> is meters by default.
 * 
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/_types/aggregations/Aggregate.ts#L516-L520">API
 *      specification</a>
 */
@JsonpDeserializable
public class GeoDistanceAggregate extends RangeAggregate implements AggregateVariant {
	// ---------------------------------------------------------------------------------------------

	private GeoDistanceAggregate(Builder builder) {
		super(builder);

	}

	public static GeoDistanceAggregate of(Function<Builder, ObjectBuilder<GeoDistanceAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregate variant kind.
	 */
	@Override
	public Aggregate.Kind _aggregateKind() {
		return Aggregate.Kind.GeoDistance;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoDistanceAggregate}.
	 */

	public static class Builder extends RangeAggregate.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GeoDistanceAggregate> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GeoDistanceAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoDistanceAggregate build() {
			_checkSingleUse();

			return new GeoDistanceAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoDistanceAggregate}
	 */
	public static final JsonpDeserializer<GeoDistanceAggregate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GeoDistanceAggregate::setupGeoDistanceAggregateDeserializer);

	protected static void setupGeoDistanceAggregateDeserializer(ObjectDeserializer<GeoDistanceAggregate.Builder> op) {
		RangeAggregate.setupRangeAggregateDeserializer(op);

	}

}
