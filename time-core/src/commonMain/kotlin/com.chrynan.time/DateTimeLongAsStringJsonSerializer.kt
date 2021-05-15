@file:Suppress("unused")

package com.chrynan.time

import kotlinx.serialization.json.*

object DateTimeLongAsStringJsonSerializer : JsonTransformingSerializer<DateTimeString>(DateTimeString.serializer()) {

    override fun transformDeserialize(element: JsonElement): JsonElement {
        if (element is JsonNull) return element

        val primitive = element as JsonPrimitive

        val stringValue = primitive.contentOrNull
        val longValue = stringValue?.toLong()

        return when {
            longValue != null -> {
                val value = longValue.toDateTimeLongFromMillisecondsSinceEpoch().toDateTimeString().value
                JsonPrimitive(value)
            }
            stringValue != null -> JsonPrimitive(stringValue)
            else -> element
        }
    }

    override fun transformSerialize(element: JsonElement): JsonElement {
        if (element is JsonNull) return element

        val primitive = element as JsonPrimitive

        val stringValue = primitive.contentOrNull
        val longValue = stringValue?.toLong()

        return when {
            longValue != null -> {
                val value = longValue.toDateTimeLongFromMillisecondsSinceEpoch().toDateTimeString().value
                JsonPrimitive(value)
            }
            stringValue != null -> JsonPrimitive(stringValue)
            else -> element
        }
    }
}
