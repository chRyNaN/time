package com.chrynan.time

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * A [KSerializer] for [DateTimeString]. This handles serializing to and from a ISO-8601 String value and a
 * [DateTimeString].
 *
 * @see [DateTimeString]
 */
object DateTimeStringSerializer : KSerializer<DateTimeString> {

    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor(serialName = "DateTimeString", kind = PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): DateTimeString {
        val value = decoder.decodeString()

        val dateTimeString = DateTimeString(value)

        // Validate it's format is correct
        dateTimeString.toInstant()

        return dateTimeString
    }

    override fun serialize(encoder: Encoder, value: DateTimeString) {
        encoder.encodeString(value.value)
    }
}
