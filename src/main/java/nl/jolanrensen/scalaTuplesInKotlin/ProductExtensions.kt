package nl.jolanrensen.scalaTuplesInKotlin

import scala.Product
import scala.jdk.javaapi.CollectionConverters

/**
 * Extra extensions for Scala [Product]s such as Tuples.
 *
 * For example:
 *
 * ```kotlin
 * 1 in t(1, 2, 3) == true
 *
 * for (x in t("a", "b", "c")) { ... }
 *
 * val a: List<Any?> = t(1, "a", 3L).asIterable().toList()
 *
 * t(1, 2, 3).size == 3
 *
 * t(1, 2, 3)[0] == 1
 * ```
 *
 *
 * Jolan Rensen, 26-02-2021
 */

operator fun Product.contains(item: Any?): Boolean = productIterator().contains(item)

operator fun Product.iterator(): Iterator<Any?> = CollectionConverters.asJava(productIterator())

fun Product.asIterable(): Iterable<Any?> = object : Iterable<Any?> {
    override fun iterator(): Iterator<Any?> = CollectionConverters.asJava(productIterator())
}

val Product.size: Int
    get() = productArity()

operator fun Product.get(index: Int): Any? = productElement(index)