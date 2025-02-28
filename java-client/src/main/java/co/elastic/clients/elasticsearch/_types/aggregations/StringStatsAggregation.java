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
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.StringStatsAggregation

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/_types/aggregations/metric.ts#L138-L140">API
 *      specification</a>
 */
@JsonpDeserializable
public class StringStatsAggregation extends MetricAggregationBase implements AggregationVariant {
	@Nullable
	private final Boolean showDistribution;

	// ---------------------------------------------------------------------------------------------

	private StringStatsAggregation(Builder builder) {
		super(builder);

		this.showDistribution = builder.showDistribution;

	}

	public static StringStatsAggregation of(Function<Builder, ObjectBuilder<StringStatsAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.StringStats;
	}

	/**
	 * API name: {@code show_distribution}
	 */
	@Nullable
	public final Boolean showDistribution() {
		return this.showDistribution;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.showDistribution != null) {
			generator.writeKey("show_distribution");
			generator.write(this.showDistribution);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StringStatsAggregation}.
	 */

	public static class Builder extends MetricAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<StringStatsAggregation> {
		@Nullable
		private Boolean showDistribution;

		/**
		 * API name: {@code show_distribution}
		 */
		public final Builder showDistribution(@Nullable Boolean value) {
			this.showDistribution = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link StringStatsAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StringStatsAggregation build() {
			_checkSingleUse();

			return new StringStatsAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StringStatsAggregation}
	 */
	public static final JsonpDeserializer<StringStatsAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, StringStatsAggregation::setupStringStatsAggregationDeserializer);

	protected static void setupStringStatsAggregationDeserializer(
			ObjectDeserializer<StringStatsAggregation.Builder> op) {
		MetricAggregationBase.setupMetricAggregationBaseDeserializer(op);
		op.add(Builder::showDistribution, JsonpDeserializer.booleanDeserializer(), "show_distribution");

	}

}
