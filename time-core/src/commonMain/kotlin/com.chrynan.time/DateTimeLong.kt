package com.chrynan.time

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

/**
 * A wrapper class for a [Long] value that represents milliseconds since the UTC Epoch.
 *
 * Note that this should probably be an inline class but the kotlinx.serialization library doesn't currently support
 * inline classes.
 */
@Serializable
@JvmInline
value class DateTimeLong(val value: Long) {

    override fun toString(): String = value.toString()

    companion object
}
