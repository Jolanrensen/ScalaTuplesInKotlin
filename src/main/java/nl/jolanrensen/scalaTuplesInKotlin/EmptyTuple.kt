package nl.jolanrensen.scalaTuplesInKotlin

import scala.*
import java.io.Serializable

object EmptyTuple : Product, Serializable {
    override fun canEqual(that: Any?): Boolean = that == EmptyTuple
    override fun productElement(n: Int): Nothing = throw IndexOutOfBoundsException("EmptyTuple has no members")
    override fun productArity(): Int = 0
    override fun toString(): String = "()"
}

public val t: EmptyTuple = EmptyTuple
public fun emptyTuple(): EmptyTuple = EmptyTuple
