package nl.jolanrensen.scalaTuplesInKotlin.building

private fun main() {
    val alphabet = (1..22).toList()
    val words = listOf(
        "first",
        "second",
        "third",
        "fourth",
        "fifth",
        "sixth",
        "seventh",
        "eighth",
        "ninth",
        "tenth",
        "eleventh",
        "twelfth",
        "thirteenth",
        "fourteenth",
        "fifteenth",
        "sixteenth",
        "seventeenth",
        "eighteenth",
        "nineteenth",
        "twentieth",
        "twentyFirst",
        "twentySecond",
    )

    for (a in alphabet) {

        @OptIn(ExperimentalStdlibApi::class)
        val numbers = (1..a).toList()

        for (nr in numbers) {
            println(
                "val <T> Product$a<${numbers.joinToString { if (it == nr) "T" else "*" }}>.${words[nr - 1]}: T get() = this._$nr()"
            )
        }
    }
}