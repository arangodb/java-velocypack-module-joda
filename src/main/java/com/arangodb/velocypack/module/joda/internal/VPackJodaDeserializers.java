/*
 * DISCLAIMER
 *
 * Copyright 2016 ArangoDB GmbH, Cologne, Germany
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Copyright holder is ArangoDB GmbH, Cologne, Germany
 */

package com.arangodb.velocypack.module.joda.internal;

import org.joda.time.DateTime;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;

import com.arangodb.velocypack.VPackDeserializationContext;
import com.arangodb.velocypack.VPackDeserializer;
import com.arangodb.velocypack.VPackSlice;
import com.arangodb.velocypack.exception.VPackException;
import com.arangodb.velocypack.internal.VPackDeserializers;

/**
 * @author Mark Vollmary
 *
 */
public class VPackJodaDeserializers {

	public static final VPackDeserializer<Instant> INSTANT = new VPackDeserializer<Instant>() {
		@Override
		public Instant deserialize(
			final VPackSlice parent,
			final VPackSlice vpack,
			final VPackDeserializationContext context) throws VPackException {
			return new Instant(VPackDeserializers.DATE.deserialize(parent, vpack, context).getTime());
		}
	};

	public static final VPackDeserializer<DateTime> DATE_TIME = new VPackDeserializer<DateTime>() {
		@Override
		public DateTime deserialize(
			final VPackSlice parent,
			final VPackSlice vpack,
			final VPackDeserializationContext context) throws VPackException {
			return new DateTime(VPackDeserializers.DATE.deserialize(parent, vpack, context).getTime());
		}
	};

	public static final VPackDeserializer<LocalDate> LOCAL_DATE = new VPackDeserializer<LocalDate>() {
		@Override
		public LocalDate deserialize(
			final VPackSlice parent,
			final VPackSlice vpack,
			final VPackDeserializationContext context) throws VPackException {
			return new LocalDate(VPackDeserializers.DATE.deserialize(parent, vpack, context).getTime());
		}
	};

	public static final VPackDeserializer<LocalDateTime> LOCAL_DATE_TIME = new VPackDeserializer<LocalDateTime>() {
		@Override
		public LocalDateTime deserialize(
			final VPackSlice parent,
			final VPackSlice vpack,
			final VPackDeserializationContext context) throws VPackException {
			return new LocalDateTime(VPackDeserializers.DATE.deserialize(parent, vpack, context).getTime());
		}
	};

}
