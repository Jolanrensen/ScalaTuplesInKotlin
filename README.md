# Scala Tuples In Kotlin
This repo contains a bunch of files that provide extensions to make Scala Tuples easier to use in Kotlin.

# How to install
Check Jitpack:

Scala 2.13: [![](https://jitpack.io/v/Jolanrensen/ScalaTuplesInKotlin.svg)](https://jitpack.io/#Jolanrensen/ScalaTuplesInKotlin/alpha01-scala2.13-SNAPSHOT)

Scala 2.12.10 ([Kotlin Spark API](https://github.com/JetBrains/kotlin-spark-api)): [![](https://jitpack.io/v/Jolanrensen/ScalaTuplesInKotlin.svg)](https://jitpack.io/#Jolanrensen/ScalaTuplesInKotlin/alpha01-scala2.12.10-SNAPSHOT)

Scala 2.12.13: [![](https://jitpack.io/v/Jolanrensen/ScalaTuplesInKotlin.svg)](https://jitpack.io/#Jolanrensen/ScalaTuplesInKotlin/alpha01-scala2.12-SNAPSHOT)

# Examples
## Creation
The project adds simple functional Tuple builders in the form of `tupleOf()` and `t()` for short.

This allows you to easily create the correct type of tuple with correct types like
```kotlin
val yourTuple: Tuple3<Int, String, YourObject> = tupleOf(1, "test", a)
```
or for short
```kotlin
val yourTuple: Tuple3<Int, String, YourObject> = t(1, "test", a)
```

## Tuple joining
This project provides functions to easily merge two separate Scala Tuples into one.
For example (using `t()` to create a new tuple): 
```kotlin
t(a) concat t(b, c, d) == t(a, b, c, d)
```
or using the shorthand: 
```kotlin
t(a) + t(b, c, d) == t(a, b, c, d)
```

## Tuple extending
The project provides functions to easily extend Scala Tuples.

This means you can easily create a new tuple appended-, or prepended by a new value or tuple.
For example (using `t()` to create a new tuple):
```kotlin
t(a, b).appendedBy(c) == t(a, b, c)
```
and
```kotlin
t(a, b).prependedBy(c) == t(c, a, b)
```
or in shorthand:
```kotlin
t(a, b)..c == t(a, b, c)
```
and
```kotlin
c..t(a, b) == t(c, a, b)
```
Note that `t(a, b)..t(c, d)` will not work due to it being ambiguous:
It could mean both `t(a, b, t(c, d))` and `t(t(a, b), c, d)`.
So, for two tuples, you must use `appendedBy` and `prependedBy` explicitly.

## Product (Tuple) destructuring
This project provides the operator functions to destructuring for Scala classes implementing `Product`, like Tuples.
This means you can type 
```kotlin
val (a, b, c, d) = yourTuple
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

## Quality of life extensions
There are also some other extensions built for `Product` types like Tuples. 
These extensions are type-aware, meaning that `t(1, 2, 3).asIterable().toList()` will result in a `List<Int>`,
while `t(1, 2.0, 3L).asIterable().toList()` will give a `List<Number>`.
For instance:

```kotlin
1 in t(1, 2, 3) == true

for (x: String in t("a", "b", "c")) { /* ... */ }

val a: List<Number> = t(1, 2.0, 3L).asIterable().toList()

val b: List<Int> = t(1, 5, 3).asIterable().toList()

t(1, 2, 3).size == 3

t(1, 2, 3)[0] == 1

t(1, 1, 2)[1..2] == t(1, 2, 2)[0..1]
```