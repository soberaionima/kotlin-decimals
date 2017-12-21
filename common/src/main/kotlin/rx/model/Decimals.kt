package rx.model


expect class Decimal {
    operator fun plus(other: Decimal): Decimal
    operator fun minus(other: Decimal): Decimal
    operator fun div(other: Decimal): Decimal
    operator fun times(other: Decimal): Decimal
    operator fun unaryMinus(): Decimal
    open operator fun compareTo(other: Decimal): Int
    open fun toDouble(): Double

}

expect sealed class Decimals {
    companion object {
        fun valueOf(str: String): Decimal
    }
}