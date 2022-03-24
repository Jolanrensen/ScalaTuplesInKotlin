package nl.jolanrensen.scalaTuplesInKotlin

import scala.*
import java.io.Serializable

object EmptyTuple : Product, Serializable {
    override fun canEqual(that: Any?): Boolean = that == EmptyTuple
    override fun productElement(n: Int): Nothing = throw IndexOutOfBoundsException("Tuple0 has no members")
    override fun productArity(): Int = 0
    override fun toString(): String = "()"
}

public val t: EmptyTuple = EmptyTuple
