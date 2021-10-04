@file:Suppress("unused")

package com.chrynan.time

@Suppress("FunctionName")
actual fun Locale(
    language: String,
    country: String?,
    variant: String?
): Locale =
    DefaultLocale(language = language, country = country, variant = variant)

actual fun Locale.Companion.getDefault(): Locale =
    throw UnsupportedOperationException("Javascript does not have a way to obtain the default locale as of yet.")
