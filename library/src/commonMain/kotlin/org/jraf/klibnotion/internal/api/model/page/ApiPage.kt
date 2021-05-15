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

package org.jraf.klibnotion.internal.api.model.page

import kotlinx.serialization.Serializable
import org.jraf.klibnotion.internal.api.model.base.ApiReference
import org.jraf.klibnotion.internal.api.model.property.value.ApiPropertyValue

/**
 * See [https://www.notion.so/Page-object-2a08cb77f9c14c25bece5c3408fe7762].
 */
@Serializable
internal data class ApiPage(
    val id: String,
    val parent: ApiReference,
    val properties: Map<String, ApiPropertyValue>,
    val archived: Boolean,
)
