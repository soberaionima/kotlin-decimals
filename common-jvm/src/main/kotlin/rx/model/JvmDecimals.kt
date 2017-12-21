package rx.model

import java.math.BigDecimal


actual typealias Decimal = JvmDecimal


class JvmDecimal(val value: BigDecimal) {
    operator fun plus(other: JvmDecimal): JvmDecimal = JvmDecimal(this.value.add(other.value))
    operator fun minus(other: JvmDecimal): JvmDecimal = JvmDecimal(this.value.subtract(other.value))
    operator fun div(other: JvmDecimal): JvmDecimal = JvmDecimal(this.value.divide(other.value))
    operator fun times(other: JvmDecimal): JvmDecimal = JvmDecimal(this.value.multiply(other.value))
    operator fun unaryMinus(): JvmDecimal = JvmDecimal(this.value.negate())
    open operator fun compareTo(other: JvmDecimal): Int = this.value.compareTo(other.value)
    open fun toDouble(): Double = this.value.toDouble()
}

actual sealed class Decimals {
    actual companion object {
        actual  fun valueOf(str: String): Decimal = JvmDecimal(BigDecimal(str))
    }
}

