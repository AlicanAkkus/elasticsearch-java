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

// typedef: watcher._types.TriggerEventContainer

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/watcher/_types/Trigger.ts#L32-L37">API
 *      specification</a>
 */
@JsonpDeserializable
public class TriggerEvent implements TaggedUnion<TriggerEvent.Kind, Object>, JsonpSerializable {

	/**
	 * {@link TriggerEvent} variant kinds.
	 */
	/**
	 * {@link TriggerEvent} variant kinds.
	 */

	public enum Kind implements JsonEnum {
		Schedule("schedule"),

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

	public TriggerEvent(TriggerEventVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._triggerEventKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private TriggerEvent(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static TriggerEvent of(Function<Builder, ObjectBuilder<TriggerEvent>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code schedule}?
	 */
	public boolean isSchedule() {
		return _kind == Kind.Schedule;
	}

	/**
	 * Get the {@code schedule} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code schedule} kind.
	 */
	public ScheduleTriggerEvent schedule() {
		return TaggedUnionUtils.get(this, Kind.Schedule);
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

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TriggerEvent> {
		private Kind _kind;
		private Object _value;

		public ObjectBuilder<TriggerEvent> schedule(ScheduleTriggerEvent v) {
			this._kind = Kind.Schedule;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TriggerEvent> schedule(
				Function<ScheduleTriggerEvent.Builder, ObjectBuilder<ScheduleTriggerEvent>> fn) {
			return this.schedule(fn.apply(new ScheduleTriggerEvent.Builder()).build());
		}

		public TriggerEvent build() {
			_checkSingleUse();
			return new TriggerEvent(this);
		}

	}

	protected static void setupTriggerEventDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::schedule, ScheduleTriggerEvent._DESERIALIZER, "schedule");

	}

	public static final JsonpDeserializer<TriggerEvent> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TriggerEvent::setupTriggerEventDeserializer, Builder::build);
}
