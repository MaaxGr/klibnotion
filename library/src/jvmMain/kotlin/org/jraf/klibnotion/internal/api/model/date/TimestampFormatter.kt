/*
 * This source is part of the
 *      _____  ___   ____
 *  __ / / _ \/ _ | / __/___  _______ _
 * / // / , _/ __ |/ _/_/ _ \/ __/ _ `/
 * \___/_/|_/_/ |_/_/ (_)___/_/  \_, /
 *                              /___/
 * repository.
 *
 * Copyright (C) 2021-present Benoit 'BoD' Lubek (BoD@JRAF.org)
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
 */

package org.jraf.klibnotion.internal.api.model.date

import org.jraf.klibnotion.model.date.Timestamp
import java.text.SimpleDateFormat
import java.util.TimeZone

internal actual class TimestampFormatter actual constructor(format: String) {

    private val formatFormatter = SimpleDateFormat(format)

    private val parseFormatter = SimpleDateFormat(format).apply {
        // Set the default timezone to GMT for the case where it's not present in the date to parse
        // which is the case when it's a date without a time.
        timeZone = TimeZone.getTimeZone("GMT")
    }

    actual fun parse(formattedDate: String): Timestamp {
        return parseFormatter.parse(formattedDate)
    }

    actual fun format(timestampToFormat: Timestamp): String {
        return formatFormatter.format(timestampToFormat)
    }
}