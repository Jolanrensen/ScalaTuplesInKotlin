package nl.jolanrensen.scalaTuplesInKotlin

import scala.Tuple2
import scala.Tuple3

/**
 * This file adds conversions between Scala's [Tuple2] and Kotlin's [Pair] and [Tuple3] and [Triple] respectively.
 *
 * by Jolan Rensen, 18-02-2021
 */

/**
 * Returns a new [Tuple3] based on the arguments in the current [Triple].
 */
fun <T1, T2, T3> Triple<T1, T2, T3>.toTuple(): Tuple3<T1, T2, T3> = Tuple3<T1, T2, T3>(first, second, third)

/**
 * Returns a new [Triple] based on the arguments in the current [Tuple3].
 */
fun <T1, T2, T3> Tuple3<T1, T2, T3>.toTriple(): Triple<T1, T2, T3> = Triple<T1, T2, T3>(_1(), _2(), _3())


/**
 * Returns a new [Tuple2] based on the arguments in the current [Pair].
 */
fun <T1, T2> Pair<T1, T2>.toTuple(): Tuple2<T1, T2> = Tuple2<T1, T2>(first, second)

/**
 * Returns a new [Pair] based on the arguments in the current [Tuple2].
 */
fun <T1, T2> Tuple2<T1, T2>.toPair(): Pair<T1, T2> = Pair<T1, T2>(_1(), _2())
