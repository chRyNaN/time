package com.chrynan.time

import kotlinx.serialization.Serializable

/**
 * A wrapper class for a [Long] value that represents milliseconds since the UTC Epoch.
 *
 * Note that this should probably be an inline class but the kotlinx.serialization library doesn't currently support
 * inline classes.
 */
@Serializable(with = DateTimeLongSerializer::class)
data class DateTimeLong(val value: Long) {

    override fun toString(): String = value.toString()
}
