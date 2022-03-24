package nl.jolanrensen.scalaTuplesInKotlin.building


private fun main() {
    val alphabet = (1..22).toList()
//    val words = listOf(
//        "first",
//        "second",
//        "third",
//        "fourth",
//        "fifth",
//        "sixth",
//        "seventh",
//        "eighth",
//        "ninth",
//        "tenth",
//        "eleventh",
//        "twelfth",
//        "thirteenth",
//        "fourteenth",
//        "fifteenth",
//        "sixteenth",
//        "seventeenth",
//        "eighteenth",
//        "nineteenth",
//        "twentieth",
//        "twentyFirst",
//        "twentySecond",
//    )

    for (a in alphabet) {

        @OptIn(ExperimentalStdlibApi::class)
        val numbers = (1..a).toList()

        for (nr in numbers) {
            println(
                "\nval <T> Product$a<${numbers.joinToString { if (it == nr) "T" else "*" }}>._$nr: T get() = this._$nr()"
            )
        }

        println("\n/** Returns the first value of this Tuple or Product. */")
        println("fun <T> Product$a<${numbers.joinToString { if (it == 1) "T" else "*" }}>.first(): T = this._1()")
        println("\n/** Returns the last value of this Tuple or Product. */")
        println("fun <T> Product$a<${numbers.joinToString { if (it == numbers.last()) "T" else "*" }}>.last(): T = this._${numbers.last()}()")
    }
}