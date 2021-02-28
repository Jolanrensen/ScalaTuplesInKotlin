@file:Suppress("UNCHECKED_CAST", "RemoveExplicitTypeArguments")

package nl.jolanrensen.scalaTuplesInKotlin

import scala.Product1
import scala.Product2
import scala.Product3
import scala.Product4
import scala.Product5
import scala.Product6
import scala.Product7
import scala.Product8
import scala.Product9
import scala.Product10
import scala.Product11
import scala.Product12
import scala.Product13
import scala.Product14
import scala.Product15
import scala.Product16
import scala.Product17
import scala.Product18
import scala.Product19
import scala.Product20
import scala.Product21
import scala.Product22
import scala.jdk.javaapi.CollectionConverters

operator fun <T> Product1<T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Product2<T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Product3<T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Product4<T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Product5<T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Product6<T, T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Product7<T, T, T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Product8<T, T, T, T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Product9<T, T, T, T, T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Product10<T, T, T, T, T, T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Product11<T, T, T, T, T, T, T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Product12<T, T, T, T, T, T, T, T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Product13<T, T, T, T, T, T, T, T, T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Product14<T, T, T, T, T, T, T, T, T, T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Product15<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Product16<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Product17<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Product18<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Product19<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Product20<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Product21<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })
operator fun <T> Product22<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T })

fun <T> Product1<T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Product2<T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Product3<T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Product4<T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Product5<T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Product6<T, T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Product7<T, T, T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Product8<T, T, T, T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Product9<T, T, T, T, T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Product10<T, T, T, T, T, T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Product11<T, T, T, T, T, T, T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Product12<T, T, T, T, T, T, T, T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Product13<T, T, T, T, T, T, T, T, T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Product14<T, T, T, T, T, T, T, T, T, T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Product15<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Product16<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Product17<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Product18<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Product19<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Product20<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Product21<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }
fun <T> Product22<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = CollectionConverters.asJava<T>(productIterator().map<T> { it as T }) }

operator fun <T> Product1<T>.get(index: Int): T = productElement(index) as T
operator fun <T> Product2<T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Product3<T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Product4<T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Product5<T, T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Product6<T, T, T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Product7<T, T, T, T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Product8<T, T, T, T, T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Product9<T, T, T, T, T, T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Product10<T, T, T, T, T, T, T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Product11<T, T, T, T, T, T, T, T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Product12<T, T, T, T, T, T, T, T, T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Product13<T, T, T, T, T, T, T, T, T, T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Product14<T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Product15<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Product16<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Product17<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Product18<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Product19<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Product20<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Product21<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(index: Int): T = productElement(index) as T
operator fun <T> Product22<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(index: Int): T = productElement(index) as T

operator fun <T> Product1<T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Product2<T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Product3<T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Product4<T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Product5<T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Product6<T, T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Product7<T, T, T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Product8<T, T, T, T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Product9<T, T, T, T, T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Product10<T, T, T, T, T, T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Product11<T, T, T, T, T, T, T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Product12<T, T, T, T, T, T, T, T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Product13<T, T, T, T, T, T, T, T, T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Product14<T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Product15<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Product16<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Product17<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Product18<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Product19<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Product20<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Product21<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T> Product22<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
