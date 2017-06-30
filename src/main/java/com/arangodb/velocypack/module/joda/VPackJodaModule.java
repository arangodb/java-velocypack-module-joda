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

package com.arangodb.velocypack.module.joda;

import org.joda.time.DateTime;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;

import com.arangodb.velocypack.VPackModule;
import com.arangodb.velocypack.VPackSetupContext;
import com.arangodb.velocypack.module.joda.internal.VPackJodaDeserializers;
import com.arangodb.velocypack.module.joda.internal.VPackJodaSerializers;

/**
 * @author Mark Vollmary
 *
 */
public class VPackJodaModule implements VPackModule {

	@Override
	public <C extends VPackSetupContext<C>> void setup(final C context) {
		context.registerDeserializer(Instant.class, VPackJodaDeserializers.INSTANT);
		context.registerDeserializer(DateTime.class, VPackJodaDeserializers.DATE_TIME);
		context.registerDeserializer(LocalDate.class, VPackJodaDeserializers.LOCAL_DATE);
		context.registerDeserializer(LocalDateTime.class, VPackJodaDeserializers.LOCAL_DATE_TIME);

		context.registerSerializer(Instant.class, VPackJodaSerializers.INSTANT);
		context.registerSerializer(DateTime.class, VPackJodaSerializers.DATE_TIME);
		context.registerSerializer(LocalDate.class, VPackJodaSerializers.LOCAL_DATE);
		context.registerSerializer(LocalDateTime.class, VPackJodaSerializers.LOCAL_DATE_TIME);
	}

}
