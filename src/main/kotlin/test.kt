import java.math.BigDecimal

fun main() {
    val result = (BigDecimal("2") * BigDecimal("2") +
            BigDecimal("0") * BigDecimal("3") +
            BigDecimal("0") * BigDecimal("4") +
            BigDecimal("1") * BigDecimal("5")) /
            (BigDecimal("2") + BigDecimal("0") +
                    BigDecimal("0") + BigDecimal("1"))

    println(result)
}
