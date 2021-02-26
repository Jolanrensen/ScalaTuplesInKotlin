# Scala Tuples In Kotlin
This repo contains a bunch of files that provide extensions to make Scala Tuples easier to use in Kotlin.

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
This project provides the operator functions to destructuring for Scala classes implementing `ProductX`, like Tuples.
This means you can type 
```kotlin
val (a, b, c, d) = yourTuple
``` 
to unpack its values, similar to how `Pair`, `Triple` and other data classes work in Kotlin.

## Product (Tuple) textual accessors
The project provides textual accessors instead of `_1()`, `_2()` etc. for Scala classes implementing `ProductX`, like Tuples.
This means you can type 
```kotlin
yourTuple.first
yourTuple.second
yourTuple.last
```
etc. to access the value you require, similar to how `Pair` and `Triple` name their values in Kotlin.
