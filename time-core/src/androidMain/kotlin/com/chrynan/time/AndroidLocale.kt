@file:Suppress("unused")

package com.chrynan.time

@Suppress("FunctionName")
actual fun Locale(
    language: String,
    country: String?,
    variant: String?
): Locale {
    val locale = java.util.Locale(language, country ?: "", variant ?: "")

    return AndroidLocale(locale = locale)
}

internal class AndroidLocale(
    @Suppress("MemberVisibilityCanBePrivate") val locale: java.util.Locale
) : Locale {

    override val language: String
        get() = locale.language

    override val country: String?
        get() {
            val country = locale.country

            return country.ifBlank { null }
        }

    override val variant: String?
        get() {
            val variant = locale.variant

            return variant.ifBlank { null }
        }
}

fun Locale.toJavaLocale(): java.util.Locale =
    java.util.Locale(language, country ?: "", variant ?: "")

actual fun Locale.Companion.getDefault(): Locale = AndroidLocale(locale = java.util.Locale.getDefault())
