@file:Suppress("FunctionName", "RemoveExplicitTypeArguments", "DuplicatedCode")
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
 * This file contains simple functional Tuple builders in the form of `tupleOf()`.
 *
 * This allows you to easily create the correct type of tuple with correct types like
 * ```val yourTuple = tupleOf(1, "test", a)```
 * or
 * ```val yourTuple = t(1, "test", a)```
 *
 * by Jolan Rensen, 18-02-2021
 */


/**
 * Returns a new Tuple1 of the given arguments.
 **/
fun <T1> tupleOf(first: T1): Tuple1<T1> = Tuple1<T1>(first)

/**
 * Returns a new Tuple2 of the given arguments.
 **/
fun <T1, T2> tupleOf(first: T1, second: T2): Tuple2<T1, T2> = Tuple2<T1, T2>(first, second)

/**
 * Returns a new Tuple3 of the given arguments.
 **/
fun <T1, T2, T3> tupleOf(first: T1, second: T2, third: T3): Tuple3<T1, T2, T3> = Tuple3<T1, T2, T3>(first, second, third)

/**
 * Returns a new Tuple4 of the given arguments.
 **/
fun <T1, T2, T3, T4> tupleOf(first: T1, second: T2, third: T3, fourth: T4): Tuple4<T1, T2, T3, T4> = Tuple4<T1, T2, T3, T4>(first, second, third, fourth)

/**
 * Returns a new Tuple5 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5> tupleOf(first: T1, second: T2, third: T3, fourth: T4, fifth: T5): Tuple5<T1, T2, T3, T4, T5> = Tuple5<T1, T2, T3, T4, T5>(first, second, third, fourth, fifth)

/**
 * Returns a new Tuple6 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5, T6> tupleOf(first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6): Tuple6<T1, T2, T3, T4, T5, T6> = Tuple6<T1, T2, T3, T4, T5, T6>(first, second, third, fourth, fifth, sixth)

/**
 * Returns a new Tuple7 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5, T6, T7> tupleOf(first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7): Tuple7<T1, T2, T3, T4, T5, T6, T7> = Tuple7<T1, T2, T3, T4, T5, T6, T7>(first, second, third, fourth, fifth, sixth, seventh)

/**
 * Returns a new Tuple8 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5, T6, T7, T8> tupleOf(first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7, eighth: T8): Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> = Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>(first, second, third, fourth, fifth, sixth, seventh, eighth)

/**
 * Returns a new Tuple9 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9> tupleOf(first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7, eighth: T8, ninth: T9): Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9> = Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth)

/**
 * Returns a new Tuple10 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> tupleOf(first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7, eighth: T8, ninth: T9, tenth: T10): Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> = Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth)

/**
 * Returns a new Tuple11 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> tupleOf(first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7, eighth: T8, ninth: T9, tenth: T10, eleventh: T11): Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> = Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh)

/**
 * Returns a new Tuple12 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> tupleOf(first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7, eighth: T8, ninth: T9, tenth: T10, eleventh: T11, twelfth: T12): Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> = Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth)

/**
 * Returns a new Tuple13 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> tupleOf(first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7, eighth: T8, ninth: T9, tenth: T10, eleventh: T11, twelfth: T12, thirteenth: T13): Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> = Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth)

/**
 * Returns a new Tuple14 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> tupleOf(first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7, eighth: T8, ninth: T9, tenth: T10, eleventh: T11, twelfth: T12, thirteenth: T13, fourteenth: T14): Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> = Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth)

/**
 * Returns a new Tuple15 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> tupleOf(first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7, eighth: T8, ninth: T9, tenth: T10, eleventh: T11, twelfth: T12, thirteenth: T13, fourteenth: T14, fifteenth: T15): Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> = Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth)

/**
 * Returns a new Tuple16 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> tupleOf(first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7, eighth: T8, ninth: T9, tenth: T10, eleventh: T11, twelfth: T12, thirteenth: T13, fourteenth: T14, fifteenth: T15, sixteenth: T16): Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> = Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth)

/**
 * Returns a new Tuple17 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> tupleOf(first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7, eighth: T8, ninth: T9, tenth: T10, eleventh: T11, twelfth: T12, thirteenth: T13, fourteenth: T14, fifteenth: T15, sixteenth: T16, seventeenth: T17): Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> = Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth)

/**
 * Returns a new Tuple18 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> tupleOf(first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7, eighth: T8, ninth: T9, tenth: T10, eleventh: T11, twelfth: T12, thirteenth: T13, fourteenth: T14, fifteenth: T15, sixteenth: T16, seventeenth: T17, eighteenth: T18): Tuple18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> = Tuple18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth, eighteenth)

/**
 * Returns a new Tuple19 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> tupleOf(first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7, eighth: T8, ninth: T9, tenth: T10, eleventh: T11, twelfth: T12, thirteenth: T13, fourteenth: T14, fifteenth: T15, sixteenth: T16, seventeenth: T17, eighteenth: T18, nineteenth: T19): Tuple19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> = Tuple19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth, eighteenth, nineteenth)

/**
 * Returns a new Tuple20 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> tupleOf(first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7, eighth: T8, ninth: T9, tenth: T10, eleventh: T11, twelfth: T12, thirteenth: T13, fourteenth: T14, fifteenth: T15, sixteenth: T16, seventeenth: T17, eighteenth: T18, nineteenth: T19, twentieth: T20): Tuple20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> = Tuple20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth, eighteenth, nineteenth, twentieth)

/**
 * Returns a new Tuple21 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> tupleOf(first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7, eighth: T8, ninth: T9, tenth: T10, eleventh: T11, twelfth: T12, thirteenth: T13, fourteenth: T14, fifteenth: T15, sixteenth: T16, seventeenth: T17, eighteenth: T18, nineteenth: T19, twentieth: T20, twentyFirst: T21): Tuple21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> = Tuple21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth, eighteenth, nineteenth, twentieth, twentyFirst)

/**
 * Returns a new Tuple22 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> tupleOf(first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7, eighth: T8, ninth: T9, tenth: T10, eleventh: T11, twelfth: T12, thirteenth: T13, fourteenth: T14, fifteenth: T15, sixteenth: T16, seventeenth: T17, eighteenth: T18, nineteenth: T19, twentieth: T20, twentyFirst: T21, twentySecond: T22): Tuple22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> = Tuple22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth, eighteenth, nineteenth, twentieth, twentyFirst, twentySecond)

/**
 * Returns a new Tuple1 of the given arguments.
 **/
fun <T1> t(first: T1): Tuple1<T1> = Tuple1<T1>(first)

/**
 * Returns a new Tuple2 of the given arguments.
 **/
fun <T1, T2> t(first: T1, second: T2): Tuple2<T1, T2> = Tuple2<T1, T2>(first, second)

/**
 * Returns a new Tuple3 of the given arguments.
 **/
fun <T1, T2, T3> t(first: T1, second: T2, third: T3): Tuple3<T1, T2, T3> = Tuple3<T1, T2, T3>(first, second, third)

/**
 * Returns a new Tuple4 of the given arguments.
 **/
fun <T1, T2, T3, T4> t(first: T1, second: T2, third: T3, fourth: T4): Tuple4<T1, T2, T3, T4> = Tuple4<T1, T2, T3, T4>(first, second, third, fourth)

/**
 * Returns a new Tuple5 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5> t(first: T1, second: T2, third: T3, fourth: T4, fifth: T5): Tuple5<T1, T2, T3, T4, T5> = Tuple5<T1, T2, T3, T4, T5>(first, second, third, fourth, fifth)

/**
 * Returns a new Tuple6 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5, T6> t(first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6): Tuple6<T1, T2, T3, T4, T5, T6> = Tuple6<T1, T2, T3, T4, T5, T6>(first, second, third, fourth, fifth, sixth)

/**
 * Returns a new Tuple7 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5, T6, T7> t(first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7): Tuple7<T1, T2, T3, T4, T5, T6, T7> = Tuple7<T1, T2, T3, T4, T5, T6, T7>(first, second, third, fourth, fifth, sixth, seventh)

/**
 * Returns a new Tuple8 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5, T6, T7, T8> t(first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7, eighth: T8): Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> = Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>(first, second, third, fourth, fifth, sixth, seventh, eighth)

/**
 * Returns a new Tuple9 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9> t(first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7, eighth: T8, ninth: T9): Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9> = Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth)

/**
 * Returns a new Tuple10 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> t(first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7, eighth: T8, ninth: T9, tenth: T10): Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> = Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth)

/**
 * Returns a new Tuple11 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> t(first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7, eighth: T8, ninth: T9, tenth: T10, eleventh: T11): Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> = Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh)

/**
 * Returns a new Tuple12 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> t(first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7, eighth: T8, ninth: T9, tenth: T10, eleventh: T11, twelfth: T12): Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> = Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth)

/**
 * Returns a new Tuple13 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> t(first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7, eighth: T8, ninth: T9, tenth: T10, eleventh: T11, twelfth: T12, thirteenth: T13): Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> = Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth)

/**
 * Returns a new Tuple14 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> t(first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7, eighth: T8, ninth: T9, tenth: T10, eleventh: T11, twelfth: T12, thirteenth: T13, fourteenth: T14): Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> = Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth)

/**
 * Returns a new Tuple15 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> t(first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7, eighth: T8, ninth: T9, tenth: T10, eleventh: T11, twelfth: T12, thirteenth: T13, fourteenth: T14, fifteenth: T15): Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> = Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth)

/**
 * Returns a new Tuple16 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> t(first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7, eighth: T8, ninth: T9, tenth: T10, eleventh: T11, twelfth: T12, thirteenth: T13, fourteenth: T14, fifteenth: T15, sixteenth: T16): Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> = Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth)

/**
 * Returns a new Tuple17 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> t(first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7, eighth: T8, ninth: T9, tenth: T10, eleventh: T11, twelfth: T12, thirteenth: T13, fourteenth: T14, fifteenth: T15, sixteenth: T16, seventeenth: T17): Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> = Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth)

/**
 * Returns a new Tuple18 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> t(first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7, eighth: T8, ninth: T9, tenth: T10, eleventh: T11, twelfth: T12, thirteenth: T13, fourteenth: T14, fifteenth: T15, sixteenth: T16, seventeenth: T17, eighteenth: T18): Tuple18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> = Tuple18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth, eighteenth)

/**
 * Returns a new Tuple19 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> t(first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7, eighth: T8, ninth: T9, tenth: T10, eleventh: T11, twelfth: T12, thirteenth: T13, fourteenth: T14, fifteenth: T15, sixteenth: T16, seventeenth: T17, eighteenth: T18, nineteenth: T19): Tuple19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> = Tuple19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth, eighteenth, nineteenth)

/**
 * Returns a new Tuple20 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> t(first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7, eighth: T8, ninth: T9, tenth: T10, eleventh: T11, twelfth: T12, thirteenth: T13, fourteenth: T14, fifteenth: T15, sixteenth: T16, seventeenth: T17, eighteenth: T18, nineteenth: T19, twentieth: T20): Tuple20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> = Tuple20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth, eighteenth, nineteenth, twentieth)

/**
 * Returns a new Tuple21 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> t(first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7, eighth: T8, ninth: T9, tenth: T10, eleventh: T11, twelfth: T12, thirteenth: T13, fourteenth: T14, fifteenth: T15, sixteenth: T16, seventeenth: T17, eighteenth: T18, nineteenth: T19, twentieth: T20, twentyFirst: T21): Tuple21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> = Tuple21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth, eighteenth, nineteenth, twentieth, twentyFirst)

/**
 * Returns a new Tuple22 of the given arguments.
 **/
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> t(first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7, eighth: T8, ninth: T9, tenth: T10, eleventh: T11, twelfth: T12, thirteenth: T13, fourteenth: T14, fifteenth: T15, sixteenth: T16, seventeenth: T17, eighteenth: T18, nineteenth: T19, twentieth: T20, twentyFirst: T21, twentySecond: T22): Tuple22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> = Tuple22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth, eighteenth, nineteenth, twentieth, twentyFirst, twentySecond)
