@file:Suppress("UNCHECKED_CAST", "RemoveExplicitTypeArguments")

package nl.jolanrensen.scalaTuplesInKotlin

import scala.Tuple1
import scala.Tuple2
import scala.Tuple3
import scala.Tuple4
import scala.Tuple5
import scala.Tuple6
import scala.Tuple7
import scala.Tuple8
import scala.Tuple9
import scala.Tuple10
import scala.Tuple11
import scala.Tuple12
import scala.Tuple13
import scala.Tuple14
import scala.Tuple15
import scala.Tuple16
import scala.Tuple17
import scala.Tuple18
import scala.Tuple19
import scala.Tuple20
import scala.Tuple21
import scala.Tuple22
import scala.jdk.javaapi.CollectionConverters


operator fun <T> Tuple1<T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Tuple2<T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Tuple3<T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Tuple4<T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Tuple5<T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Tuple6<T, T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Tuple7<T, T, T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Tuple8<T, T, T, T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Tuple9<T, T, T, T, T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Tuple10<T, T, T, T, T, T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Tuple11<T, T, T, T, T, T, T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Tuple12<T, T, T, T, T, T, T, T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Tuple13<T, T, T, T, T, T, T, T, T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Tuple14<T, T, T, T, T, T, T, T, T, T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Tuple15<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Tuple16<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Tuple17<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Tuple18<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Tuple19<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Tuple20<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Tuple21<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Tuple22<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })

fun <T> Tuple1<T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Tuple2<T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Tuple3<T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Tuple4<T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Tuple5<T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Tuple6<T, T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Tuple7<T, T, T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Tuple8<T, T, T, T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Tuple9<T, T, T, T, T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Tuple10<T, T, T, T, T, T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Tuple11<T, T, T, T, T, T, T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Tuple12<T, T, T, T, T, T, T, T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Tuple13<T, T, T, T, T, T, T, T, T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Tuple14<T, T, T, T, T, T, T, T, T, T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Tuple15<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Tuple16<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Tuple17<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Tuple18<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Tuple19<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Tuple20<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Tuple21<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Tuple22<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }

operator fun <T> Tuple1<T>.get(index: Int): T = productElement(index) as T
operator fun <T> Tuple2<T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Tuple3<T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Tuple4<T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Tuple5<T, T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Tuple6<T, T, T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Tuple7<T, T, T, T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Tuple8<T, T, T, T, T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Tuple9<T, T, T, T, T, T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Tuple10<T, T, T, T, T, T, T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Tuple11<T, T, T, T, T, T, T, T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Tuple12<T, T, T, T, T, T, T, T, T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Tuple13<T, T, T, T, T, T, T, T, T, T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Tuple14<T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Tuple15<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Tuple16<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Tuple17<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Tuple18<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Tuple19<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Tuple20<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Tuple21<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Tuple22<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(index: Int): T = productElement(index) as T

operator fun <T> Tuple1<T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Tuple2<T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Tuple3<T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Tuple4<T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Tuple5<T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Tuple6<T, T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Tuple7<T, T, T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Tuple8<T, T, T, T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Tuple9<T, T, T, T, T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Tuple10<T, T, T, T, T, T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Tuple11<T, T, T, T, T, T, T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Tuple12<T, T, T, T, T, T, T, T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Tuple13<T, T, T, T, T, T, T, T, T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Tuple14<T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Tuple15<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Tuple16<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Tuple17<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Tuple18<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Tuple19<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Tuple20<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Tuple21<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Tuple22<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
