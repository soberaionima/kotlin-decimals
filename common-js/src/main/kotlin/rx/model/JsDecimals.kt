package rx.model

actual typealias Decimal = Double


actual sealed class Decimals {
    actual companion object {
        actual  fun valueOf(str: String): Decimal = str.toDouble()
    }
}