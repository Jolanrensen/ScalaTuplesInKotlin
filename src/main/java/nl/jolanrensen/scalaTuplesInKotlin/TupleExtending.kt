@file:Suppress("FunctionName", "RemoveExplicitTypeArguments")
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

/**
 * This file provides functions to easily extend Scala Tuples.
 *
 * This means you can easily create a new tuple appended-, or prepended by a new value or tuple.
 *
 * For example (using t() to create a new tuple):
 * ```t(a, b).appendedBy(c) == t(a, b, c)```
 * and
 * ```t(a, b).prependedBy(c) == t(c, a, b)```
 *
 * or in shorthand:
 * ```t(a, b)..c == t(a, b, c)```
 * and
 * ```c..t(a, b) == t(c, a, b)```
 *
 * Note that ```t(a, b)..t(c, d)``` will not work due to it being ambiguous:
 * It could mean both ```t(a, b, t(c, d))``` and ```t(t(a, b), c, d)```.
 * So, for two tuples, you must use [appendedBy] and [prependedBy] explicitly.
 *
 * For concatenating two tuples, see [nl.jolanrensen.scalaTuplesInKotlin.concat].
 *
 * by Jolan Rensen, 26-02-2021
 */

fun <T1, T2> Tuple1<T1>.appendedBy(other: T2): Tuple2<T1, T2> = Tuple2<T1, T2>(this._1(), other)
fun <T1, T2, T3> Tuple2<T1, T2>.appendedBy(other: T3): Tuple3<T1, T2, T3> = Tuple3<T1, T2, T3>(this._1(), this._2(), other)
fun <T1, T2, T3, T4> Tuple3<T1, T2, T3>.appendedBy(other: T4): Tuple4<T1, T2, T3, T4> = Tuple4<T1, T2, T3, T4>(this._1(), this._2(), this._3(), other)
fun <T1, T2, T3, T4, T5> Tuple4<T1, T2, T3, T4>.appendedBy(other: T5): Tuple5<T1, T2, T3, T4, T5> = Tuple5<T1, T2, T3, T4, T5>(this._1(), this._2(), this._3(), this._4(), other)
fun <T1, T2, T3, T4, T5, T6> Tuple5<T1, T2, T3, T4, T5>.appendedBy(other: T6): Tuple6<T1, T2, T3, T4, T5, T6> = Tuple6<T1, T2, T3, T4, T5, T6>(this._1(), this._2(), this._3(), this._4(), this._5(), other)
fun <T1, T2, T3, T4, T5, T6, T7> Tuple6<T1, T2, T3, T4, T5, T6>.appendedBy(other: T7): Tuple7<T1, T2, T3, T4, T5, T6, T7> = Tuple7<T1, T2, T3, T4, T5, T6, T7>(this._1(), this._2(), this._3(), this._4(), this._5(), this._6(), other)
fun <T1, T2, T3, T4, T5, T6, T7, T8> Tuple7<T1, T2, T3, T4, T5, T6, T7>.appendedBy(other: T8): Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> = Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>(this._1(), this._2(), this._3(), this._4(), this._5(), this._6(), this._7(), other)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>.appendedBy(other: T9): Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9> = Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>(this._1(), this._2(), this._3(), this._4(), this._5(), this._6(), this._7(), this._8(), other)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>.appendedBy(other: T10): Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> = Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>(this._1(), this._2(), this._3(), this._4(), this._5(), this._6(), this._7(), this._8(), this._9(), other)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>.appendedBy(other: T11): Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> = Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>(this._1(), this._2(), this._3(), this._4(), this._5(), this._6(), this._7(), this._8(), this._9(), this._10(), other)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>.appendedBy(other: T12): Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> = Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>(this._1(), this._2(), this._3(), this._4(), this._5(), this._6(), this._7(), this._8(), this._9(), this._10(), this._11(), other)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>.appendedBy(other: T13): Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> = Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>(this._1(), this._2(), this._3(), this._4(), this._5(), this._6(), this._7(), this._8(), this._9(), this._10(), this._11(), this._12(), other)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>.appendedBy(other: T14): Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> = Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>(this._1(), this._2(), this._3(), this._4(), this._5(), this._6(), this._7(), this._8(), this._9(), this._10(), this._11(), this._12(), this._13(), other)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>.appendedBy(other: T15): Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> = Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>(this._1(), this._2(), this._3(), this._4(), this._5(), this._6(), this._7(), this._8(), this._9(), this._10(), this._11(), this._12(), this._13(), this._14(), other)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>.appendedBy(other: T16): Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> = Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>(this._1(), this._2(), this._3(), this._4(), this._5(), this._6(), this._7(), this._8(), this._9(), this._10(), this._11(), this._12(), this._13(), this._14(), this._15(), other)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>.appendedBy(other: T17): Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> = Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>(this._1(), this._2(), this._3(), this._4(), this._5(), this._6(), this._7(), this._8(), this._9(), this._10(), this._11(), this._12(), this._13(), this._14(), this._15(), this._16(), other)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>.appendedBy(other: T18): Tuple18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> = Tuple18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>(this._1(), this._2(), this._3(), this._4(), this._5(), this._6(), this._7(), this._8(), this._9(), this._10(), this._11(), this._12(), this._13(), this._14(), this._15(), this._16(), this._17(), other)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> Tuple18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>.appendedBy(other: T19): Tuple19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> = Tuple19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>(this._1(), this._2(), this._3(), this._4(), this._5(), this._6(), this._7(), this._8(), this._9(), this._10(), this._11(), this._12(), this._13(), this._14(), this._15(), this._16(), this._17(), this._18(), other)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> Tuple19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>.appendedBy(other: T20): Tuple20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> = Tuple20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>(this._1(), this._2(), this._3(), this._4(), this._5(), this._6(), this._7(), this._8(), this._9(), this._10(), this._11(), this._12(), this._13(), this._14(), this._15(), this._16(), this._17(), this._18(), this._19(), other)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> Tuple20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>.appendedBy(other: T21): Tuple21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> = Tuple21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>(this._1(), this._2(), this._3(), this._4(), this._5(), this._6(), this._7(), this._8(), this._9(), this._10(), this._11(), this._12(), this._13(), this._14(), this._15(), this._16(), this._17(), this._18(), this._19(), this._20(), other)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> Tuple21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>.appendedBy(other: T22): Tuple22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> = Tuple22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>(this._1(), this._2(), this._3(), this._4(), this._5(), this._6(), this._7(), this._8(), this._9(), this._10(), this._11(), this._12(), this._13(), this._14(), this._15(), this._16(), this._17(), this._18(), this._19(), this._20(), this._21(), other)

fun <T1, T2> Tuple1<T2>.prependedBy(other: T1): Tuple2<T1, T2> = Tuple2<T1, T2>(other, this._1())
fun <T1, T2, T3> Tuple2<T2, T3>.prependedBy(other: T1): Tuple3<T1, T2, T3> = Tuple3<T1, T2, T3>(other, this._1(), this._2())
fun <T1, T2, T3, T4> Tuple3<T2, T3, T4>.prependedBy(other: T1): Tuple4<T1, T2, T3, T4> = Tuple4<T1, T2, T3, T4>(other, this._1(), this._2(), this._3())
fun <T1, T2, T3, T4, T5> Tuple4<T2, T3, T4, T5>.prependedBy(other: T1): Tuple5<T1, T2, T3, T4, T5> = Tuple5<T1, T2, T3, T4, T5>(other, this._1(), this._2(), this._3(), this._4())
fun <T1, T2, T3, T4, T5, T6> Tuple5<T2, T3, T4, T5, T6>.prependedBy(other: T1): Tuple6<T1, T2, T3, T4, T5, T6> = Tuple6<T1, T2, T3, T4, T5, T6>(other, this._1(), this._2(), this._3(), this._4(), this._5())
fun <T1, T2, T3, T4, T5, T6, T7> Tuple6<T2, T3, T4, T5, T6, T7>.prependedBy(other: T1): Tuple7<T1, T2, T3, T4, T5, T6, T7> = Tuple7<T1, T2, T3, T4, T5, T6, T7>(other, this._1(), this._2(), this._3(), this._4(), this._5(), this._6())
fun <T1, T2, T3, T4, T5, T6, T7, T8> Tuple7<T2, T3, T4, T5, T6, T7, T8>.prependedBy(other: T1): Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> = Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>(other, this._1(), this._2(), this._3(), this._4(), this._5(), this._6(), this._7())
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9> Tuple8<T2, T3, T4, T5, T6, T7, T8, T9>.prependedBy(other: T1): Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9> = Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>(other, this._1(), this._2(), this._3(), this._4(), this._5(), this._6(), this._7(), this._8())
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> Tuple9<T2, T3, T4, T5, T6, T7, T8, T9, T10>.prependedBy(other: T1): Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> = Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>(other, this._1(), this._2(), this._3(), this._4(), this._5(), this._6(), this._7(), this._8(), this._9())
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> Tuple10<T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>.prependedBy(other: T1): Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> = Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>(other, this._1(), this._2(), this._3(), this._4(), this._5(), this._6(), this._7(), this._8(), this._9(), this._10())
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> Tuple11<T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>.prependedBy(other: T1): Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> = Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>(other, this._1(), this._2(), this._3(), this._4(), this._5(), this._6(), this._7(), this._8(), this._9(), this._10(), this._11())
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> Tuple12<T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>.prependedBy(other: T1): Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> = Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>(other, this._1(), this._2(), this._3(), this._4(), this._5(), this._6(), this._7(), this._8(), this._9(), this._10(), this._11(), this._12())
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> Tuple13<T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>.prependedBy(other: T1): Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> = Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>(other, this._1(), this._2(), this._3(), this._4(), this._5(), this._6(), this._7(), this._8(), this._9(), this._10(), this._11(), this._12(), this._13())
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> Tuple14<T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>.prependedBy(other: T1): Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> = Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>(other, this._1(), this._2(), this._3(), this._4(), this._5(), this._6(), this._7(), this._8(), this._9(), this._10(), this._11(), this._12(), this._13(), this._14())
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> Tuple15<T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>.prependedBy(other: T1): Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> = Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>(other, this._1(), this._2(), this._3(), this._4(), this._5(), this._6(), this._7(), this._8(), this._9(), this._10(), this._11(), this._12(), this._13(), this._14(), this._15())
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> Tuple16<T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>.prependedBy(other: T1): Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> = Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>(other, this._1(), this._2(), this._3(), this._4(), this._5(), this._6(), this._7(), this._8(), this._9(), this._10(), this._11(), this._12(), this._13(), this._14(), this._15(), this._16())
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> Tuple17<T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>.prependedBy(other: T1): Tuple18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> = Tuple18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>(other, this._1(), this._2(), this._3(), this._4(), this._5(), this._6(), this._7(), this._8(), this._9(), this._10(), this._11(), this._12(), this._13(), this._14(), this._15(), this._16(), this._17())
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> Tuple18<T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>.prependedBy(other: T1): Tuple19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> = Tuple19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>(other, this._1(), this._2(), this._3(), this._4(), this._5(), this._6(), this._7(), this._8(), this._9(), this._10(), this._11(), this._12(), this._13(), this._14(), this._15(), this._16(), this._17(), this._18())
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> Tuple19<T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>.prependedBy(other: T1): Tuple20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> = Tuple20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>(other, this._1(), this._2(), this._3(), this._4(), this._5(), this._6(), this._7(), this._8(), this._9(), this._10(), this._11(), this._12(), this._13(), this._14(), this._15(), this._16(), this._17(), this._18(), this._19())
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> Tuple20<T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>.prependedBy(other: T1): Tuple21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> = Tuple21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>(other, this._1(), this._2(), this._3(), this._4(), this._5(), this._6(), this._7(), this._8(), this._9(), this._10(), this._11(), this._12(), this._13(), this._14(), this._15(), this._16(), this._17(), this._18(), this._19(), this._20())
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> Tuple21<T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>.prependedBy(other: T1): Tuple22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> = Tuple22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>(other, this._1(), this._2(), this._3(), this._4(), this._5(), this._6(), this._7(), this._8(), this._9(), this._10(), this._11(), this._12(), this._13(), this._14(), this._15(), this._16(), this._17(), this._18(), this._19(), this._20(), this._21())

operator fun <T1, T2> Tuple1<T1>.rangeTo(other: T2): Tuple2<T1, T2> = this.appendedBy<T1, T2>(other)
operator fun <T1, T2, T3> Tuple2<T1, T2>.rangeTo(other: T3): Tuple3<T1, T2, T3> = this.appendedBy<T1, T2, T3>(other)
operator fun <T1, T2, T3, T4> Tuple3<T1, T2, T3>.rangeTo(other: T4): Tuple4<T1, T2, T3, T4> = this.appendedBy<T1, T2, T3, T4>(other)
operator fun <T1, T2, T3, T4, T5> Tuple4<T1, T2, T3, T4>.rangeTo(other: T5): Tuple5<T1, T2, T3, T4, T5> = this.appendedBy<T1, T2, T3, T4, T5>(other)
operator fun <T1, T2, T3, T4, T5, T6> Tuple5<T1, T2, T3, T4, T5>.rangeTo(other: T6): Tuple6<T1, T2, T3, T4, T5, T6> = this.appendedBy<T1, T2, T3, T4, T5, T6>(other)
operator fun <T1, T2, T3, T4, T5, T6, T7> Tuple6<T1, T2, T3, T4, T5, T6>.rangeTo(other: T7): Tuple7<T1, T2, T3, T4, T5, T6, T7> = this.appendedBy<T1, T2, T3, T4, T5, T6, T7>(other)
operator fun <T1, T2, T3, T4, T5, T6, T7, T8> Tuple7<T1, T2, T3, T4, T5, T6, T7>.rangeTo(other: T8): Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> = this.appendedBy<T1, T2, T3, T4, T5, T6, T7, T8>(other)
operator fun <T1, T2, T3, T4, T5, T6, T7, T8, T9> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>.rangeTo(other: T9): Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9> = this.appendedBy<T1, T2, T3, T4, T5, T6, T7, T8, T9>(other)
operator fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>.rangeTo(other: T10): Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> = this.appendedBy<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>(other)
operator fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>.rangeTo(other: T11): Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> = this.appendedBy<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>(other)
operator fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>.rangeTo(other: T12): Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> = this.appendedBy<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>(other)
operator fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>.rangeTo(other: T13): Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> = this.appendedBy<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>(other)
operator fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>.rangeTo(other: T14): Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> = this.appendedBy<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>(other)
operator fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>.rangeTo(other: T15): Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> = this.appendedBy<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>(other)
operator fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>.rangeTo(other: T16): Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> = this.appendedBy<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>(other)
operator fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>.rangeTo(other: T17): Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> = this.appendedBy<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>(other)
operator fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>.rangeTo(other: T18): Tuple18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> = this.appendedBy<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>(other)
operator fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> Tuple18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>.rangeTo(other: T19): Tuple19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> = this.appendedBy<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>(other)
operator fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> Tuple19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>.rangeTo(other: T20): Tuple20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> = this.appendedBy<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>(other)
operator fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> Tuple20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>.rangeTo(other: T21): Tuple21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> = this.appendedBy<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>(other)
operator fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> Tuple21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>.rangeTo(other: T22): Tuple22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> = this.appendedBy<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>(other)

operator fun <T1, T2> T1.rangeTo(other: Tuple1<T2>): Tuple2<T1, T2> = other.prependedBy<T1, T2>(this)
operator fun <T1, T2, T3> T1.rangeTo(other: Tuple2<T2, T3>): Tuple3<T1, T2, T3> = other.prependedBy<T1, T2, T3>(this)
operator fun <T1, T2, T3, T4> T1.rangeTo(other: Tuple3<T2, T3, T4>): Tuple4<T1, T2, T3, T4> = other.prependedBy<T1, T2, T3, T4>(this)
operator fun <T1, T2, T3, T4, T5> T1.rangeTo(other: Tuple4<T2, T3, T4, T5>): Tuple5<T1, T2, T3, T4, T5> = other.prependedBy<T1, T2, T3, T4, T5>(this)
operator fun <T1, T2, T3, T4, T5, T6> T1.rangeTo(other: Tuple5<T2, T3, T4, T5, T6>): Tuple6<T1, T2, T3, T4, T5, T6> = other.prependedBy<T1, T2, T3, T4, T5, T6>(this)
operator fun <T1, T2, T3, T4, T5, T6, T7> T1.rangeTo(other: Tuple6<T2, T3, T4, T5, T6, T7>): Tuple7<T1, T2, T3, T4, T5, T6, T7> = other.prependedBy<T1, T2, T3, T4, T5, T6, T7>(this)
operator fun <T1, T2, T3, T4, T5, T6, T7, T8> T1.rangeTo(other: Tuple7<T2, T3, T4, T5, T6, T7, T8>): Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> = other.prependedBy<T1, T2, T3, T4, T5, T6, T7, T8>(this)
operator fun <T1, T2, T3, T4, T5, T6, T7, T8, T9> T1.rangeTo(other: Tuple8<T2, T3, T4, T5, T6, T7, T8, T9>): Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9> = other.prependedBy<T1, T2, T3, T4, T5, T6, T7, T8, T9>(this)
operator fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> T1.rangeTo(other: Tuple9<T2, T3, T4, T5, T6, T7, T8, T9, T10>): Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> = other.prependedBy<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>(this)
operator fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> T1.rangeTo(other: Tuple10<T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>): Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> = other.prependedBy<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>(this)
operator fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> T1.rangeTo(other: Tuple11<T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>): Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> = other.prependedBy<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>(this)
operator fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> T1.rangeTo(other: Tuple12<T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>): Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> = other.prependedBy<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>(this)
operator fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> T1.rangeTo(other: Tuple13<T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>): Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> = other.prependedBy<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>(this)
operator fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> T1.rangeTo(other: Tuple14<T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>): Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> = other.prependedBy<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>(this)
operator fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> T1.rangeTo(other: Tuple15<T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>): Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> = other.prependedBy<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>(this)
operator fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> T1.rangeTo(other: Tuple16<T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>): Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> = other.prependedBy<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>(this)
operator fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> T1.rangeTo(other: Tuple17<T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>): Tuple18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> = other.prependedBy<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>(this)
operator fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> T1.rangeTo(other: Tuple18<T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>): Tuple19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> = other.prependedBy<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>(this)
operator fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> T1.rangeTo(other: Tuple19<T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>): Tuple20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> = other.prependedBy<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>(this)
operator fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> T1.rangeTo(other: Tuple20<T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>): Tuple21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> = other.prependedBy<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>(this)
operator fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> T1.rangeTo(other: Tuple21<T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>): Tuple22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> = other.prependedBy<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>(this)
