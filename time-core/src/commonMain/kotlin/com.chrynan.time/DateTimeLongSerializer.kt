package com.chrynan.time

import kotlinx.datetime.Instant
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * A [KSerializer] for [DateTimeLong]. This handles serializing to and from a [Long] value, that represents milliseconds
 * since the UTC Epoch, and a [DateTimeLong].
 *
 * @see [DateTimeLong]
 */
object DateTimeLongSerializer : KSerializer<DateTimeLong> {

    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor(serialName = "DateTimeLong", kind = PrimitiveKind.LONG)

    override fun deserialize(decoder: Decoder): DateTimeLong {
        val value = decoder.decodeLong()

        // Validate it's format is correct
        Instant.fromEpochMilliseconds(value)

        return DateTimeLong(value)
    }

    override fun serialize(encoder: Encoder, value: DateTimeLong) {
        encoder.encodeLong(value.value)
    }
}
