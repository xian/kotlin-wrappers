package js.iterable

import js.core.JsArray
import js.core.ReadonlyArray

fun <T> JsIterator<T>.asSequence(): Sequence<T> =
    iterator().asSequence()

fun <T> JsIterator<T>.toArray(): ReadonlyArray<T> =
    JsArray.from(this)

fun <T> JsIterator<T>.toList(): List<T> =
    toArray().toList()

fun <T> JsIterator<T>.toSet(): Set<T> =
    toArray().toSet()
