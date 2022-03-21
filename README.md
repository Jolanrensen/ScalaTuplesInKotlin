# Scala Tuples In Kotlin
This repo contains a bunch of files that provide extensions to make Scala Tuples easier to use in Kotlin.

For use without Scala and instead wrappers around Pair/Triple for any Kotlin platform, see [TuplesInKotlin](https://github.com/Jolanrensen/TuplesInKotlin).

# How to install
Check Jitpack:

Scala 2.12.15 ([Kotlin Spark API](https://github.com/JetBrains/kotlin-spark-api)): [![](https://jitpack.io/v/Jolanrensen/ScalaTuplesInKotlin.svg)](https://jitpack.io/#Jolanrensen/ScalaTuplesInKotlin/spark-api-SNAPSHOT)

# Examples
## Creation: functional
The project adds simple functional Tuple builders in the form of `tupleOf()`.

This allows you to easily create the correct type of tuple with correct types like
```kotlin
val yourTuple: Tuple4<Int, Long, Tuple2<String, YourObject>> = tupleOf(1, 5L, tupleOf("test", a))
```
or
```kotlin
val yourTuple: Tuple4<Int, Long, Tuple2<String, YourObject>> = c(1, 5L, tupleOf("test", a))
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
val (a, b, c, d) = c(5, 6L, "someText", something)
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

val a: List<Number> = c(1, 2.0, 3L).toList()

val b: List<Int> = tupleOf(1, 5, 3).toList()

tupleOf(1, 2, 3).size == 3

tupleOf(1, 2, 3)[0] == 1

c(1, 1, 2)[1..2] == tupleOf(1, 2, 2)[0..1]

tupleOf(1, 2, 3).dropLast() == tupleOf(0, 1, 2).dropFirst()
```
