package nl.jolanrensen.scalaTuplesInKotlin.building

private fun main() {

    println("""
        /** Creates a [Tuple1] from this value. */
        val <T1> T1.u: Tuple1<T1> get() = Tuple1<T1>(this)
    """.trimIndent())
    println()

    // value u value
    println("infix fun <T1, T2> T1.u(next: T2): Tuple2<T1, T2> = Tuple2<T1, T2>(this, next)")

    val alphabet = (3..22).toList()

    // tuple u value
    for (a in alphabet) {
        val numbers = (1..a).toList()

        println(
            "infix fun <${numbers.joinToString { "T$it" }}> Tuple${a - 1}<${numbers.dropLast(1).joinToString { "T$it" }}>.u(next: T$a): Tuple$a<${numbers.joinToString { "T$it" }}> = Tuple$a<${numbers.joinToString { "T$it" }}>(${numbers.dropLast(1).joinToString { "this._$it()" }}, next)"
        )
    }

    println()

    // value u tuple: Same as tuple u value
    // { value }: Not done, use { value.u }
    // tuple u tuple: Not done, use tuple u value u value... or {}

    // value u { tuple }
    println("infix fun <T1, T2 : Product> T1.u(next: () -> T2): Tuple2<T1, T2> = Tuple2<T1, T2>(this, next())")

    // { tuple } u value
    println("infix fun <T1 : Product, T2> (() -> T1).u(next: T2): Tuple2<T1, T2> = Tuple2<T1, T2>(this(), next)")

    // tuple u { tuple }
    for (a in alphabet) {
        val numbers = (1..a).toList()

        println("infix fun <${numbers.joinToString { "T$it" }}: Product> Tuple${a - 1}<${numbers.dropLast(1).joinToString { "T$it" }}>.u(next: () -> T$a): Tuple$a<${numbers.joinToString { "T$it" }}> = Tuple$a<${numbers.joinToString { "T$it" }}>(${numbers.dropLast(1).joinToString { "this._$it()" }}, next())")
    }

    // { tuple } u tuple: Not done, use { tuple } u value u value

    // { tuple } u { tuple }
    println("infix fun <T1 : Product, T2: Product> (() -> T1).u(next: () -> T2): Tuple2<T1, T2> = Tuple2<T1, T2>(this(), next())")






}