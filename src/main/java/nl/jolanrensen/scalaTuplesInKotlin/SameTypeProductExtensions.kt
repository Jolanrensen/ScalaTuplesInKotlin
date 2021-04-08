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
import scala.collection.JavaConverters

/**
 * This file provides quality of life extensions for Products/Tuples where each of its types is the same.
 * This includes converting to [Iterable] or getting an [Iterator] of a Product/Tuple,
 * as well as taking a single value or slice from a Tuple/Product.
 *
 *
 * by Jolan Rensen, 07-05-2021
 */

operator fun <T, T1: T> Product1<T1>.iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T })
operator fun <T, T1: T, T2: T> Product2<T1, T2>.iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T })
operator fun <T, T1: T, T2: T, T3: T> Product3<T1, T2, T3>.iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T })
operator fun <T, T1: T, T2: T, T3: T, T4: T> Product4<T1, T2, T3, T4>.iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T })
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T> Product5<T1, T2, T3, T4, T5>.iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T })
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T> Product6<T1, T2, T3, T4, T5, T6>.iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T })
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T> Product7<T1, T2, T3, T4, T5, T6, T7>.iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T })
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T> Product8<T1, T2, T3, T4, T5, T6, T7, T8>.iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T })
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T> Product9<T1, T2, T3, T4, T5, T6, T7, T8, T9>.iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T })
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T> Product10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>.iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T })
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T> Product11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>.iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T })
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T> Product12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>.iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T })
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T> Product13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>.iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T })
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T> Product14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>.iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T })
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T> Product15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>.iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T })
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T, T16: T> Product16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>.iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T })
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T, T16: T, T17: T> Product17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>.iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T })
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T, T16: T, T17: T, T18: T> Product18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>.iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T })
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T, T16: T, T17: T, T18: T, T19: T> Product19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>.iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T })
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T, T16: T, T17: T, T18: T, T19: T, T20: T> Product20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>.iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T })
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T, T16: T, T17: T, T18: T, T19: T, T20: T, T21: T> Product21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>.iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T })
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T, T16: T, T17: T, T18: T, T19: T, T20: T, T21: T, T22: T> Product22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>.iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T })

fun <T, T1: T> Product1<T1>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T }) }
fun <T, T1: T, T2: T> Product2<T1, T2>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T }) }
fun <T, T1: T, T2: T, T3: T> Product3<T1, T2, T3>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T }) }
fun <T, T1: T, T2: T, T3: T, T4: T> Product4<T1, T2, T3, T4>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T }) }
fun <T, T1: T, T2: T, T3: T, T4: T, T5: T> Product5<T1, T2, T3, T4, T5>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T }) }
fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T> Product6<T1, T2, T3, T4, T5, T6>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T }) }
fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T> Product7<T1, T2, T3, T4, T5, T6, T7>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T }) }
fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T> Product8<T1, T2, T3, T4, T5, T6, T7, T8>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T }) }
fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T> Product9<T1, T2, T3, T4, T5, T6, T7, T8, T9>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T }) }
fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T> Product10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T }) }
fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T> Product11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T }) }
fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T> Product12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T }) }
fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T> Product13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T }) }
fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T> Product14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T }) }
fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T> Product15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T }) }
fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T, T16: T> Product16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T }) }
fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T, T16: T, T17: T> Product17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T }) }
fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T, T16: T, T17: T, T18: T> Product18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T }) }
fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T, T16: T, T17: T, T18: T, T19: T> Product19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T }) }
fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T, T16: T, T17: T, T18: T, T19: T, T20: T> Product20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T }) }
fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T, T16: T, T17: T, T18: T, T19: T, T20: T, T21: T> Product21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T }) }
fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T, T16: T, T17: T, T18: T, T19: T, T20: T, T21: T, T22: T> Product22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> =  JavaConverters.asJavaIterator<T>(productIterator().map<T> { it as T }) }

operator fun <T, T1: T> Product1<T1>.get(index: Int): T = productElement(index) as T
operator fun <T, T1: T, T2: T> Product2<T1, T2>.get(index: Int): T = productElement(index) as T
operator fun <T, T1: T, T2: T, T3: T> Product3<T1, T2, T3>.get(index: Int): T = productElement(index) as T
operator fun <T, T1: T, T2: T, T3: T, T4: T> Product4<T1, T2, T3, T4>.get(index: Int): T = productElement(index) as T
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T> Product5<T1, T2, T3, T4, T5>.get(index: Int): T = productElement(index) as T
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T> Product6<T1, T2, T3, T4, T5, T6>.get(index: Int): T = productElement(index) as T
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T> Product7<T1, T2, T3, T4, T5, T6, T7>.get(index: Int): T = productElement(index) as T
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T> Product8<T1, T2, T3, T4, T5, T6, T7, T8>.get(index: Int): T = productElement(index) as T
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T> Product9<T1, T2, T3, T4, T5, T6, T7, T8, T9>.get(index: Int): T = productElement(index) as T
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T> Product10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>.get(index: Int): T = productElement(index) as T
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T> Product11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>.get(index: Int): T = productElement(index) as T
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T> Product12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>.get(index: Int): T = productElement(index) as T
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T> Product13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>.get(index: Int): T = productElement(index) as T
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T> Product14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>.get(index: Int): T = productElement(index) as T
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T> Product15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>.get(index: Int): T = productElement(index) as T
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T, T16: T> Product16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>.get(index: Int): T = productElement(index) as T
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T, T16: T, T17: T> Product17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>.get(index: Int): T = productElement(index) as T
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T, T16: T, T17: T, T18: T> Product18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>.get(index: Int): T = productElement(index) as T
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T, T16: T, T17: T, T18: T, T19: T> Product19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>.get(index: Int): T = productElement(index) as T
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T, T16: T, T17: T, T18: T, T19: T, T20: T> Product20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>.get(index: Int): T = productElement(index) as T
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T, T16: T, T17: T, T18: T, T19: T, T20: T, T21: T> Product21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>.get(index: Int): T = productElement(index) as T
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T, T16: T, T17: T, T18: T, T19: T, T20: T, T21: T, T22: T> Product22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>.get(index: Int): T = productElement(index) as T

operator fun <T, T1: T> Product1<T1>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T, T1: T, T2: T> Product2<T1, T2>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T, T1: T, T2: T, T3: T> Product3<T1, T2, T3>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T, T1: T, T2: T, T3: T, T4: T> Product4<T1, T2, T3, T4>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T> Product5<T1, T2, T3, T4, T5>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T> Product6<T1, T2, T3, T4, T5, T6>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T> Product7<T1, T2, T3, T4, T5, T6, T7>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T> Product8<T1, T2, T3, T4, T5, T6, T7, T8>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T> Product9<T1, T2, T3, T4, T5, T6, T7, T8, T9>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T> Product10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T> Product11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T> Product12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T> Product13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T> Product14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T> Product15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T, T16: T> Product16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T, T16: T, T17: T> Product17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T, T16: T, T17: T, T18: T> Product18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T, T16: T, T17: T, T18: T, T19: T> Product19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T, T16: T, T17: T, T18: T, T19: T, T20: T> Product20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T, T16: T, T17: T, T18: T, T19: T, T20: T, T21: T> Product21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }
operator fun <T, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T, T16: T, T17: T, T18: T, T19: T, T20: T, T21: T, T22: T> Product22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>.get(indexRange: IntRange): List<T> = indexRange.map { productElement(it) as T }

