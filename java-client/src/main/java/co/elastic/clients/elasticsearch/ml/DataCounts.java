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
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataCounts

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/ml/_types/Job.ts#L124-L143">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataCounts implements JsonpSerializable {
	private final long bucketCount;

	private final long earliestRecordTimestamp;

	private final long emptyBucketCount;

	private final long inputBytes;

	private final long inputFieldCount;

	private final long inputRecordCount;

	private final long invalidDateCount;

	private final String jobId;

	private final long lastDataTime;

	private final long latestEmptyBucketTimestamp;

	private final long latestRecordTimestamp;

	private final long latestSparseBucketTimestamp;

	private final long latestBucketTimestamp;

	private final long missingFieldCount;

	private final long outOfOrderTimestampCount;

	private final long processedFieldCount;

	private final long processedRecordCount;

	private final long sparseBucketCount;

	// ---------------------------------------------------------------------------------------------

	private DataCounts(Builder builder) {

		this.bucketCount = ApiTypeHelper.requireNonNull(builder.bucketCount, this, "bucketCount");
		this.earliestRecordTimestamp = ApiTypeHelper.requireNonNull(builder.earliestRecordTimestamp, this,
				"earliestRecordTimestamp");
		this.emptyBucketCount = ApiTypeHelper.requireNonNull(builder.emptyBucketCount, this, "emptyBucketCount");
		this.inputBytes = ApiTypeHelper.requireNonNull(builder.inputBytes, this, "inputBytes");
		this.inputFieldCount = ApiTypeHelper.requireNonNull(builder.inputFieldCount, this, "inputFieldCount");
		this.inputRecordCount = ApiTypeHelper.requireNonNull(builder.inputRecordCount, this, "inputRecordCount");
		this.invalidDateCount = ApiTypeHelper.requireNonNull(builder.invalidDateCount, this, "invalidDateCount");
		this.jobId = ApiTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.lastDataTime = ApiTypeHelper.requireNonNull(builder.lastDataTime, this, "lastDataTime");
		this.latestEmptyBucketTimestamp = ApiTypeHelper.requireNonNull(builder.latestEmptyBucketTimestamp, this,
				"latestEmptyBucketTimestamp");
		this.latestRecordTimestamp = ApiTypeHelper.requireNonNull(builder.latestRecordTimestamp, this,
				"latestRecordTimestamp");
		this.latestSparseBucketTimestamp = ApiTypeHelper.requireNonNull(builder.latestSparseBucketTimestamp, this,
				"latestSparseBucketTimestamp");
		this.latestBucketTimestamp = ApiTypeHelper.requireNonNull(builder.latestBucketTimestamp, this,
				"latestBucketTimestamp");
		this.missingFieldCount = ApiTypeHelper.requireNonNull(builder.missingFieldCount, this, "missingFieldCount");
		this.outOfOrderTimestampCount = ApiTypeHelper.requireNonNull(builder.outOfOrderTimestampCount, this,
				"outOfOrderTimestampCount");
		this.processedFieldCount = ApiTypeHelper.requireNonNull(builder.processedFieldCount, this,
				"processedFieldCount");
		this.processedRecordCount = ApiTypeHelper.requireNonNull(builder.processedRecordCount, this,
				"processedRecordCount");
		this.sparseBucketCount = ApiTypeHelper.requireNonNull(builder.sparseBucketCount, this, "sparseBucketCount");

	}

	public static DataCounts of(Function<Builder, ObjectBuilder<DataCounts>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code bucket_count}
	 */
	public final long bucketCount() {
		return this.bucketCount;
	}

	/**
	 * Required - API name: {@code earliest_record_timestamp}
	 */
	public final long earliestRecordTimestamp() {
		return this.earliestRecordTimestamp;
	}

	/**
	 * Required - API name: {@code empty_bucket_count}
	 */
	public final long emptyBucketCount() {
		return this.emptyBucketCount;
	}

	/**
	 * Required - API name: {@code input_bytes}
	 */
	public final long inputBytes() {
		return this.inputBytes;
	}

	/**
	 * Required - API name: {@code input_field_count}
	 */
	public final long inputFieldCount() {
		return this.inputFieldCount;
	}

	/**
	 * Required - API name: {@code input_record_count}
	 */
	public final long inputRecordCount() {
		return this.inputRecordCount;
	}

	/**
	 * Required - API name: {@code invalid_date_count}
	 */
	public final long invalidDateCount() {
		return this.invalidDateCount;
	}

	/**
	 * Required - API name: {@code job_id}
	 */
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * Required - API name: {@code last_data_time}
	 */
	public final long lastDataTime() {
		return this.lastDataTime;
	}

	/**
	 * Required - API name: {@code latest_empty_bucket_timestamp}
	 */
	public final long latestEmptyBucketTimestamp() {
		return this.latestEmptyBucketTimestamp;
	}

	/**
	 * Required - API name: {@code latest_record_timestamp}
	 */
	public final long latestRecordTimestamp() {
		return this.latestRecordTimestamp;
	}

	/**
	 * Required - API name: {@code latest_sparse_bucket_timestamp}
	 */
	public final long latestSparseBucketTimestamp() {
		return this.latestSparseBucketTimestamp;
	}

	/**
	 * Required - API name: {@code latest_bucket_timestamp}
	 */
	public final long latestBucketTimestamp() {
		return this.latestBucketTimestamp;
	}

	/**
	 * Required - API name: {@code missing_field_count}
	 */
	public final long missingFieldCount() {
		return this.missingFieldCount;
	}

	/**
	 * Required - API name: {@code out_of_order_timestamp_count}
	 */
	public final long outOfOrderTimestampCount() {
		return this.outOfOrderTimestampCount;
	}

	/**
	 * Required - API name: {@code processed_field_count}
	 */
	public final long processedFieldCount() {
		return this.processedFieldCount;
	}

	/**
	 * Required - API name: {@code processed_record_count}
	 */
	public final long processedRecordCount() {
		return this.processedRecordCount;
	}

	/**
	 * Required - API name: {@code sparse_bucket_count}
	 */
	public final long sparseBucketCount() {
		return this.sparseBucketCount;
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

		generator.writeKey("bucket_count");
		generator.write(this.bucketCount);

		generator.writeKey("earliest_record_timestamp");
		generator.write(this.earliestRecordTimestamp);

		generator.writeKey("empty_bucket_count");
		generator.write(this.emptyBucketCount);

		generator.writeKey("input_bytes");
		generator.write(this.inputBytes);

		generator.writeKey("input_field_count");
		generator.write(this.inputFieldCount);

		generator.writeKey("input_record_count");
		generator.write(this.inputRecordCount);

		generator.writeKey("invalid_date_count");
		generator.write(this.invalidDateCount);

		generator.writeKey("job_id");
		generator.write(this.jobId);

		generator.writeKey("last_data_time");
		generator.write(this.lastDataTime);

		generator.writeKey("latest_empty_bucket_timestamp");
		generator.write(this.latestEmptyBucketTimestamp);

		generator.writeKey("latest_record_timestamp");
		generator.write(this.latestRecordTimestamp);

		generator.writeKey("latest_sparse_bucket_timestamp");
		generator.write(this.latestSparseBucketTimestamp);

		generator.writeKey("latest_bucket_timestamp");
		generator.write(this.latestBucketTimestamp);

		generator.writeKey("missing_field_count");
		generator.write(this.missingFieldCount);

		generator.writeKey("out_of_order_timestamp_count");
		generator.write(this.outOfOrderTimestampCount);

		generator.writeKey("processed_field_count");
		generator.write(this.processedFieldCount);

		generator.writeKey("processed_record_count");
		generator.write(this.processedRecordCount);

		generator.writeKey("sparse_bucket_count");
		generator.write(this.sparseBucketCount);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataCounts}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DataCounts> {
		private Long bucketCount;

		private Long earliestRecordTimestamp;

		private Long emptyBucketCount;

		private Long inputBytes;

		private Long inputFieldCount;

		private Long inputRecordCount;

		private Long invalidDateCount;

		private String jobId;

		private Long lastDataTime;

		private Long latestEmptyBucketTimestamp;

		private Long latestRecordTimestamp;

		private Long latestSparseBucketTimestamp;

		private Long latestBucketTimestamp;

		private Long missingFieldCount;

		private Long outOfOrderTimestampCount;

		private Long processedFieldCount;

		private Long processedRecordCount;

		private Long sparseBucketCount;

		/**
		 * Required - API name: {@code bucket_count}
		 */
		public final Builder bucketCount(long value) {
			this.bucketCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code earliest_record_timestamp}
		 */
		public final Builder earliestRecordTimestamp(long value) {
			this.earliestRecordTimestamp = value;
			return this;
		}

		/**
		 * Required - API name: {@code empty_bucket_count}
		 */
		public final Builder emptyBucketCount(long value) {
			this.emptyBucketCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code input_bytes}
		 */
		public final Builder inputBytes(long value) {
			this.inputBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code input_field_count}
		 */
		public final Builder inputFieldCount(long value) {
			this.inputFieldCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code input_record_count}
		 */
		public final Builder inputRecordCount(long value) {
			this.inputRecordCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code invalid_date_count}
		 */
		public final Builder invalidDateCount(long value) {
			this.invalidDateCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code job_id}
		 */
		public final Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * Required - API name: {@code last_data_time}
		 */
		public final Builder lastDataTime(long value) {
			this.lastDataTime = value;
			return this;
		}

		/**
		 * Required - API name: {@code latest_empty_bucket_timestamp}
		 */
		public final Builder latestEmptyBucketTimestamp(long value) {
			this.latestEmptyBucketTimestamp = value;
			return this;
		}

		/**
		 * Required - API name: {@code latest_record_timestamp}
		 */
		public final Builder latestRecordTimestamp(long value) {
			this.latestRecordTimestamp = value;
			return this;
		}

		/**
		 * Required - API name: {@code latest_sparse_bucket_timestamp}
		 */
		public final Builder latestSparseBucketTimestamp(long value) {
			this.latestSparseBucketTimestamp = value;
			return this;
		}

		/**
		 * Required - API name: {@code latest_bucket_timestamp}
		 */
		public final Builder latestBucketTimestamp(long value) {
			this.latestBucketTimestamp = value;
			return this;
		}

		/**
		 * Required - API name: {@code missing_field_count}
		 */
		public final Builder missingFieldCount(long value) {
			this.missingFieldCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code out_of_order_timestamp_count}
		 */
		public final Builder outOfOrderTimestampCount(long value) {
			this.outOfOrderTimestampCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code processed_field_count}
		 */
		public final Builder processedFieldCount(long value) {
			this.processedFieldCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code processed_record_count}
		 */
		public final Builder processedRecordCount(long value) {
			this.processedRecordCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code sparse_bucket_count}
		 */
		public final Builder sparseBucketCount(long value) {
			this.sparseBucketCount = value;
			return this;
		}

		/**
		 * Builds a {@link DataCounts}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataCounts build() {
			_checkSingleUse();

			return new DataCounts(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataCounts}
	 */
	public static final JsonpDeserializer<DataCounts> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DataCounts::setupDataCountsDeserializer);

	protected static void setupDataCountsDeserializer(ObjectDeserializer<DataCounts.Builder> op) {

		op.add(Builder::bucketCount, JsonpDeserializer.longDeserializer(), "bucket_count");
		op.add(Builder::earliestRecordTimestamp, JsonpDeserializer.longDeserializer(), "earliest_record_timestamp");
		op.add(Builder::emptyBucketCount, JsonpDeserializer.longDeserializer(), "empty_bucket_count");
		op.add(Builder::inputBytes, JsonpDeserializer.longDeserializer(), "input_bytes");
		op.add(Builder::inputFieldCount, JsonpDeserializer.longDeserializer(), "input_field_count");
		op.add(Builder::inputRecordCount, JsonpDeserializer.longDeserializer(), "input_record_count");
		op.add(Builder::invalidDateCount, JsonpDeserializer.longDeserializer(), "invalid_date_count");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::lastDataTime, JsonpDeserializer.longDeserializer(), "last_data_time");
		op.add(Builder::latestEmptyBucketTimestamp, JsonpDeserializer.longDeserializer(),
				"latest_empty_bucket_timestamp");
		op.add(Builder::latestRecordTimestamp, JsonpDeserializer.longDeserializer(), "latest_record_timestamp");
		op.add(Builder::latestSparseBucketTimestamp, JsonpDeserializer.longDeserializer(),
				"latest_sparse_bucket_timestamp");
		op.add(Builder::latestBucketTimestamp, JsonpDeserializer.longDeserializer(), "latest_bucket_timestamp");
		op.add(Builder::missingFieldCount, JsonpDeserializer.longDeserializer(), "missing_field_count");
		op.add(Builder::outOfOrderTimestampCount, JsonpDeserializer.longDeserializer(), "out_of_order_timestamp_count");
		op.add(Builder::processedFieldCount, JsonpDeserializer.longDeserializer(), "processed_field_count");
		op.add(Builder::processedRecordCount, JsonpDeserializer.longDeserializer(), "processed_record_count");
		op.add(Builder::sparseBucketCount, JsonpDeserializer.longDeserializer(), "sparse_bucket_count");

	}

}
