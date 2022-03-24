package nl.jolanrensen.scalaTuplesInKotlin

import scala.*
import java.io.Serializable

/**
 * Just as in Scala3, we provide the [EmptyTuple]. It is the result of dropping the last item from a [Tuple1]
 * or when calling `tupleOf()` for instance.
 *
 * It can also be used to create tuples like:
 * ```kotlin
 * val tuple: Tuple3<Int, Long, String> = t + 1 + 5L + "test"
 * ```
 * if you really want to.
 */

object EmptyTuple : Product, Serializable {
    override fun canEqual(that: Any?): Boolean = that == EmptyTuple
    override fun productElement(n: Int): Nothing = throw IndexOutOfBoundsException("EmptyTuple has no members")
    override fun productArity(): Int = 0
    override fun toString(): String = "()"
}

public val t: EmptyTuple = EmptyTuple
public fun emptyTuple(): EmptyTuple = EmptyTuple
