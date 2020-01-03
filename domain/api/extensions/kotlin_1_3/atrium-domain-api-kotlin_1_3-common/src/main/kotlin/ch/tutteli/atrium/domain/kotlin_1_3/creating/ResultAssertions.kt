package ch.tutteli.atrium.domain.kotlin_1_3.creating

import ch.tutteli.atrium.core.polyfills.loadSingleService
import ch.tutteli.atrium.creating.Expect
import ch.tutteli.atrium.domain.creating.changers.ExtractedFeaturePostStep

/**
 * The access point to an implementation of [ResultAssertions].
 *
 * It loads the implementation lazily via [loadSingleService].
 */
val resultAssertions by lazy { loadSingleService(ResultAssertions::class) }

/**
 * Defines the minimum set of assertion functions and builders applicable to [Result],
 * which an implementation of the domain of Atrium has to provide.
 */
interface ResultAssertions {
    fun <E, T : Result<E>> isSuccess(assertionContainer: Expect<T>): ExtractedFeaturePostStep<T, E>
}
