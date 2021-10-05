package com.chrynan.time

import kotlin.time.ExperimentalTime

/**
 * This annotation marks a very early preview of a time based component or utility. This is similar to the
 * [ExperimentalTime] annotation but is used to denote an even more experimental and unstable API. Using components or
 * utilities marked with this annotation should be done cautiously, as the API is very likely to change or be removed
 * in the future.
 */
@RequiresOptIn(level = RequiresOptIn.Level.ERROR)
@MustBeDocumented
@Retention(AnnotationRetention.BINARY)
@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.ANNOTATION_CLASS,
    AnnotationTarget.PROPERTY,
    AnnotationTarget.FIELD,
    AnnotationTarget.LOCAL_VARIABLE,
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.CONSTRUCTOR,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER,
    AnnotationTarget.TYPEALIAS
)
annotation class UnstableTimeApi
