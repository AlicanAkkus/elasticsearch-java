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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeAnalysisContainer

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/ml/_types/DataframeAnalytics.ts#L83-L100">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataframeAnalysis implements TaggedUnion<DataframeAnalysis.Kind, Object>, JsonpSerializable {

	/**
	 * {@link DataframeAnalysis} variant kinds.
	 */
	/**
	 * {@link DataframeAnalysis} variant kinds.
	 */

	public enum Kind implements JsonEnum {
		Classification("classification"),

		OutlierDetection("outlier_detection"),

		Regression("regression"),

		;

		private final String jsonValue;

		Kind(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

	}

	private final Kind _kind;
	private final Object _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	public DataframeAnalysis(DataframeAnalysisVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._dataframeAnalysisKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private DataframeAnalysis(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static DataframeAnalysis of(Function<Builder, ObjectBuilder<DataframeAnalysis>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code classification}?
	 */
	public boolean isClassification() {
		return _kind == Kind.Classification;
	}

	/**
	 * Get the {@code classification} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code classification} kind.
	 */
	public DataframeAnalysisClassification classification() {
		return TaggedUnionUtils.get(this, Kind.Classification);
	}

	/**
	 * Is this variant instance of kind {@code outlier_detection}?
	 */
	public boolean isOutlierDetection() {
		return _kind == Kind.OutlierDetection;
	}

	/**
	 * Get the {@code outlier_detection} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code outlier_detection}
	 *             kind.
	 */
	public DataframeAnalysisOutlierDetection outlierDetection() {
		return TaggedUnionUtils.get(this, Kind.OutlierDetection);
	}

	/**
	 * Is this variant instance of kind {@code regression}?
	 */
	public boolean isRegression() {
		return _kind == Kind.Regression;
	}

	/**
	 * Get the {@code regression} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code regression} kind.
	 */
	public DataframeAnalysisRegression regression() {
		return TaggedUnionUtils.get(this, Kind.Regression);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeStartObject();

		generator.writeKey(_kind.jsonValue());
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

		generator.writeEnd();

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DataframeAnalysis> {
		private Kind _kind;
		private Object _value;

		public ObjectBuilder<DataframeAnalysis> classification(DataframeAnalysisClassification v) {
			this._kind = Kind.Classification;
			this._value = v;
			return this;
		}

		public ObjectBuilder<DataframeAnalysis> classification(
				Function<DataframeAnalysisClassification.Builder, ObjectBuilder<DataframeAnalysisClassification>> fn) {
			return this.classification(fn.apply(new DataframeAnalysisClassification.Builder()).build());
		}

		public ObjectBuilder<DataframeAnalysis> outlierDetection(DataframeAnalysisOutlierDetection v) {
			this._kind = Kind.OutlierDetection;
			this._value = v;
			return this;
		}

		public ObjectBuilder<DataframeAnalysis> outlierDetection(
				Function<DataframeAnalysisOutlierDetection.Builder, ObjectBuilder<DataframeAnalysisOutlierDetection>> fn) {
			return this.outlierDetection(fn.apply(new DataframeAnalysisOutlierDetection.Builder()).build());
		}

		public ObjectBuilder<DataframeAnalysis> regression(DataframeAnalysisRegression v) {
			this._kind = Kind.Regression;
			this._value = v;
			return this;
		}

		public ObjectBuilder<DataframeAnalysis> regression(
				Function<DataframeAnalysisRegression.Builder, ObjectBuilder<DataframeAnalysisRegression>> fn) {
			return this.regression(fn.apply(new DataframeAnalysisRegression.Builder()).build());
		}

		public DataframeAnalysis build() {
			_checkSingleUse();
			return new DataframeAnalysis(this);
		}

	}

	protected static void setupDataframeAnalysisDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::classification, DataframeAnalysisClassification._DESERIALIZER, "classification");
		op.add(Builder::outlierDetection, DataframeAnalysisOutlierDetection._DESERIALIZER, "outlier_detection");
		op.add(Builder::regression, DataframeAnalysisRegression._DESERIALIZER, "regression");

	}

	public static final JsonpDeserializer<DataframeAnalysis> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataframeAnalysis::setupDataframeAnalysisDeserializer, Builder::build);
}
