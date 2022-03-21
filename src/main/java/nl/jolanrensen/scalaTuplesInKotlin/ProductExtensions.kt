package nl.jolanrensen.scalaTuplesInKotlin

import scala.Product
import scala.collection.JavaConverters
import kotlin.jvm.Throws

/**
 * Extra extensions for Scala [Product]s such as Tuples.
 *
 * For example:
 *
 * ```kotlin
 * 1 in tupleOf(1, 2, 3) == true
 *
 * for (x in tupleOf("a", "b", "c")) { ... }
 *
 * val a: List<Any?> = tupleOf(1, "a", 3L).asIterable().toList()
 *
 * tupleOf(1, 2, 3).size == 3
 *
 * tupleOf(1, 2, 3)[0] == 1
 *
 * tupleOf(1, 1, 2)[1..2] == tupleOf(1, 2, 2)[0..1]
 * ```
 *
 *
 * Jolan Rensen, 26-02-2021
 */

operator fun Product.contains(item: Any?): Boolean = productIterator().contains(item)

operator fun Product.iterator(): Iterator<Any?> = JavaConverters.asJavaIterator(productIterator())

fun Product.asIterable(): Iterable<Any?> = object : Iterable<Any?> {
    override fun iterator(): Iterator<Any?> = JavaConverters.asJavaIterator(productIterator())
}

val Product.size: Int
    get() = productArity()

@Throws(IndexOutOfBoundsException::class)
operator fun Product.get(index: Int): Any? = productElement(index)
fun Product.getOrNull(index: Int): Any? = if (index in 0 until size) productElement(index) else null

@Throws(IndexOutOfBoundsException::class, ClassCastException::class)
fun <T> Product.getAs(index: Int): T = productElement(index) as T
fun <T> Product.getAsOrNull(index: Int): T? = getOrNull(index) as? T

@Throws(IndexOutOfBoundsException::class)
operator fun Product.get(indexRange: IntRange): List<Any?> = indexRange.map(::get)
fun Product.getOrNull(indexRange: IntRange): List<Any?> = indexRange.map(::getOrNull)

@Throws(IndexOutOfBoundsException::class, ClassCastException::class)
fun <T> Product.getAs(indexRange: IntRange): List<T> = indexRange.map(::getAs)
fun <T> Product.getAsOrNull(indexRange: IntRange): List<T?> = indexRange.map(::getAsOrNull)