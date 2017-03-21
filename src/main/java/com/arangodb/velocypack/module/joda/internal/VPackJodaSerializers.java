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

import com.arangodb.velocypack.VPackBuilder;
import com.arangodb.velocypack.VPackSerializationContext;
import com.arangodb.velocypack.VPackSerializer;
import com.arangodb.velocypack.exception.VPackException;
import com.arangodb.velocypack.internal.VPackSerializers;

/**
 * @author Mark - mark at arangodb.com
 *
 */
public class VPackJodaSerializers {

	public static final VPackSerializer<Instant> INSTANT = new VPackSerializer<Instant>() {
		@Override
		public void serialize(
			final VPackBuilder builder,
			final String attribute,
			final Instant value,
			final VPackSerializationContext context) throws VPackException {
			VPackSerializers.DATE.serialize(builder, attribute, value.toDate(), context);
		}
	};

	public static final VPackSerializer<DateTime> DATE_TIME = new VPackSerializer<DateTime>() {
		@Override
		public void serialize(
			final VPackBuilder builder,
			final String attribute,
			final DateTime value,
			final VPackSerializationContext context) throws VPackException {
			VPackSerializers.DATE.serialize(builder, attribute, value.toDate(), context);
		}
	};

	public static final VPackSerializer<LocalDate> LOCAL_DATE = new VPackSerializer<LocalDate>() {
		@Override
		public void serialize(
			final VPackBuilder builder,
			final String attribute,
			final LocalDate value,
			final VPackSerializationContext context) throws VPackException {
			VPackSerializers.DATE.serialize(builder, attribute, value.toDate(), context);
		}
	};

	public static final VPackSerializer<LocalDateTime> LOCAL_DATE_TIME = new VPackSerializer<LocalDateTime>() {
		@Override
		public void serialize(
			final VPackBuilder builder,
			final String attribute,
			final LocalDateTime value,
			final VPackSerializationContext context) throws VPackException {
			VPackSerializers.DATE.serialize(builder, attribute, value.toDate(), context);
		}
	};

}
