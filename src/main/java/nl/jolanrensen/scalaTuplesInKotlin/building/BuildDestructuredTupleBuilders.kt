package nl.jolanrensen.scalaTuplesInKotlin.building

private fun main() {

    println("infix fun <T1, T2> T1.u(next: T2): Tuple2<T1, T2> = Tuple2<T1, T2>(this, next)")

    val alphabet = (3..22).toList()

    for (a in alphabet) {
        val numbers = (1..a).toList()

        println(
            "infix fun <${numbers.joinToString { "T$it" }}> Tuple${a - 1}<${numbers.dropLast(1).joinToString { "T$it" }}>.T(next: T$a): Tuple$a<${numbers.joinToString { "T$it" }}> = Tuple$a<${numbers.joinToString { "T$it" }}>(${numbers.dropLast(1).joinToString { "this._$it()" }}, next)"
        )
    }

    println()

    println("infix fun <T1 : Product, T2> (() -> T1).u(next: T2): Tuple2<T1, T2> = Tuple2<T1, T2>(this(), next)")
    println("infix fun <T1, T2 : Product> T1.u(next: () -> T2): Tuple2<T1, T2> = Tuple2<T1, T2>(this, next())")
    println("infix fun <T1 : Product, T2: Product> (() -> T1).u(next: () -> T2): Tuple2<T1, T2> = Tuple2<T1, T2>(this(), next())")


    for (a in alphabet) {
        val numbers = (1..a).toList()

        println("infix fun <${numbers.joinToString { "T$it" }}: Product> Tuple${a - 1}<${numbers.dropLast(1).joinToString { "T$it" }}>.u(next: () -> T$a): Tuple$a<${numbers.joinToString { "T$it" }}> = Tuple$a<${numbers.joinToString { "T$it" }}>(${numbers.dropLast(1).joinToString { "this._$it()" }}, next())")
    }




}