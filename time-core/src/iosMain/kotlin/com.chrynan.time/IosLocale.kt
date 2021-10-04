@file:Suppress("unused")

package com.chrynan.time

import platform.Foundation.*

@UnstableTimeApi
@Suppress("FunctionName")
actual fun Locale(
    language: String,
    country: String?,
    variant: String?
): Locale {
    val identifier = if (!country.isNullOrBlank() && !variant.isNullOrBlank()) {
        "$language-$country-$variant"
    } else if (!country.isNullOrBlank()) {
        "$language-$country"
    } else {
        language
    }

    val nsLocale = NSLocale(identifier)

    return IosLocale(nsLocale = nsLocale)
}

@UnstableTimeApi
internal class IosLocale(
    private val nsLocale: NSLocale
) : Locale {

    override val language: String
        get() = nsLocale.languageCode

    override val country: String?
        get() {
            val country = nsLocale.countryCode

            return country?.ifBlank { null }
        }

    override val variant: String?
        get() {
            val variant = nsLocale.variantCode

            return variant?.ifBlank { null }
        }

    override val script: String?
        get() {
            val script = nsLocale.scriptCode

            return script?.ifBlank { null }
        }
}

@UnstableTimeApi
actual fun Locale.Companion.getDefault(): Locale =
    IosLocale(nsLocale = NSLocale.currentLocale)
