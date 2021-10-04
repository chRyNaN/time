package com.chrynan.time

@UnstableTimeApi
interface Locale {

    val language: String

    val country: String?

    val variant: String?

    companion object
}

@UnstableTimeApi
internal class DefaultLocale(
    override val language: String,
    override val country: String? = null,
    override val variant: String? = null
) : Locale

@Suppress("FunctionName")
@UnstableTimeApi
expect fun Locale(
    language: String,
    country: String? = null,
    variant: String? = null
): Locale

/**
 * Retrieves the default [Locale] value.
 *
 * Note that not all platform targets will have a way to retrieve the default locale. In particular, the Javascript and
 * iOS targets will throw an exception when this is called.
 */
@UnstableTimeApi
expect fun Locale.Companion.getDefault(): Locale
