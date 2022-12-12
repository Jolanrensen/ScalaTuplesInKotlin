# Scala Tuples In Kotlin (Deprecated)
The work is continued in the Kotlin Spark Api (https://github.com/Kotlin/kotlin-spark-api/wiki/Tuples)
and can be imported separately without Spark (https://search.maven.org/search?q=g:%22org.jetbrains.kotlinx.spark%22%20scala_tuples_in_kotlin)

This repo contains a bunch of files that provide extensions to make Scala Tuples easier to use in Kotlin.

For use without Scala and instead wrappers around Pair/Triple for any Kotlin platform, see [TuplesInKotlin](https://github.com/Jolanrensen/TuplesInKotlin).

# How to install
Check Jitpack:

Scala 2.12.10 ([Kotlin Spark API](https://github.com/JetBrains/kotlin-spark-api)): [![](https://jitpack.io/v/Jolanrensen/ScalaTuplesInKotlin.svg)](https://jitpack.io/#Jolanrensen/ScalaTuplesInKotlin/alpha03-scala2.12.10)

Scala 2.13.5: [![](https://jitpack.io/v/Jolanrensen/ScalaTuplesInKotlin.svg)](https://jitpack.io/#Jolanrensen/ScalaTuplesInKotlin/alpha04-scala2.13.5)

# Examples
## Creation: functional
The project adds simple functional Tuple builders in the form of `tupleOf()`.

This allows you to easily create the correct type of tuple with correct types like
```kotlin
val yourTuple: Tuple4<Int, Long, Tuple2<String, YourObject>> = tupleOf(1, 5L, tupleOf("test", a))
```

## Creation: descriptive
The project also adds a more descriptive way to create tuples using `u`:
```kotlin
val yourTuple: Tuple3<Int, Long, String> = 1 u 5L u "test"
```
and this method even includes a clever way to create tuples in tuples just like you world be able to do using the functions before:
```kotlin
val yourTuple: Tuple4<Int, Long, Tuple2<String, YourObject>> = 1 u 5L u { "test" u a }
```
To create a `Tuple1` using the descriptive method, the following extension function was created:
```kotlin
val yourTuple: Tuple1<Int> = 5.u
```
One issue currently if you add a Tuple inside a Tuple is that there is no difference between the `u` creation. To fix this, simply add `{}` around your Tuple.
Yes, I'm still exploring the notation for this. For example: 
```kotlin
val yourSecondTuple: Tuple2<Tuple2<Int, String>, String> = { yourTuple } u "something"
```

## Tuple joining
This project provides functions to easily merge two separate Scala Tuples into one.
For example (using `tupleOf()` to create a new tuple):
```kotlin
tupleOf(a).concat(tupleOf(b, c, d)) == tupleOf(a, b, c, d)
```
or
```kotlin
tupleOf(a) concat tupleOf(b, c, d) == tupleOf(a, b, c, d)
```
or using the shorthand: 
```kotlin
tupleOf(a) + tupleOf(b, c, d) == tupleOf(a, b, c, d)
```

## Tuple extending
The project provides functions to easily extend Scala Tuples.

This means you can easily create a new tuple appended-, or prepended by a new value or tuple.
For example (using `tupleOf()` to create a new tuple):
```kotlin
tupleOf(a, b).appendedBy(c) == tupleOf(a, b, c)
```
and
```kotlin
tupleOf(a, b).prependedBy(c) == tupleOf(c, a, b)
```
or in shorthand:
```kotlin
tupleOf(a, b)..c == tupleOf(a, b, c)
```
and
```kotlin
c..tupleOf(a, b) == tupleOf(c, a, b)
```
Note that `tupleOf(a, b)..tupleOf(c, d)` will not work due to it being ambiguous:
It could mean both `tupleOf(a, b, tupleOf(c, d))` and `tupleOf(tupleOf(a, b), c, d)`.
So, for two tuples, you must use `appendedBy` and `prependedBy` explicitly.

## Product (Tuple) destructuring
This project provides the operator functions to destructuring for Scala classes implementing `Product`, like Tuples.
This means you can type 
```kotlin
val (a, b, c, d) = yourTuple
``` 
and even declare multiple variables at once, like in Python:
```kotlin
val (a, b, c, d) = 5 u 6L u "someText" u something
```
to unpack its values, similar to how `Pair`, `Triple` and other data classes work in Kotlin.

## Product (Tuple) textual accessors
The project provides textual accessors instead of `_1()`, `_2()` etc. for Scala classes implementing `Product`, like Tuples.
This means you can type 
```kotlin
yourTuple.first
yourTuple.second
yourTuple.last
```
etc. to access the value you require, similar to how `Pair` and `Triple` name their values in Kotlin.
`yourTuple.last()` and `yourTuple.first()` are also present, similar to `List`s.

## Quality of life extensions
There are also some other extensions built for `Product` types like Tuples. 
These extensions are type-aware, meaning that `tupleOf(1, 2, 3).toList()` will result in a `List<Int>`,
while `tupleOf(1, 2.0, 3L).toList()` will give a `List<Number>`.
For instance:

```kotlin
1 in tupleOf(1, 2, 3) == true

for (x: String in tupleOf("a", "b", "c")) { /* ... */ }

val a: List<Number> = tupleOf(1, 2.0, 3L).toList()

val b: List<Int> = tupleOf(1, 5, 3).toList()

tupleOf(1, 2, 3).size == 3

tupleOf(1, 2, 3)[0] == 1

tupleOf(1, 1, 2)[1..2] == tupleOf(1, 2, 2)[0..1]

tupleOf(1, 2, 3).dropLast() == tupleOf(0, 1, 2).dropFirst()
```
