package nl.jolanrensen.scalaTuplesInKotlin.building

private fun main() {
    val alphabet = (1..22).toList()

    for (a in alphabet) {
        val numbers = (1..a).toList()

        for (nr in numbers) {
            println(
                "fun <T> Product$a<${numbers.joinToString { if (it == nr) "T" else "*" }}>.component$nr(): T = this._$nr()"
            )
        }
    }

}