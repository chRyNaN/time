package com.chrynan.time

import kotlinx.serialization.Serializable

/**
 * A wrapper class for a [String] value that indicates that this [String] value is in ISO-8601 format.
 *
 * For more information refer to the following:
 * https://en.wikipedia.org/wiki/ISO_8601
 *
 * Note that this should probably be an inline class but the kotlinx.serialization library doesn't currently support
 * inline classes.
 */
@Serializable(with = DateTimeStringSerializer::class)
data class DateTimeString(val value: String) {

    override fun toString(): String = value
}
