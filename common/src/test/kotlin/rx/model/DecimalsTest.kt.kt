package rx.model

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class DecimalsTest {
    val _1_1 = Decimals.valueOf("1.1")
    val _2_0 = Decimals.valueOf("2.0")
    val munis_2_0 = Decimals.valueOf("-2.0")
    val _4_0 = Decimals.valueOf("4.0")

    @Test fun testPlus() {
        assertEquals(3.1.toDouble(), (_1_1 + _2_0).toDouble())
    }

    @Test fun testMinus() {
        assertEquals(2.toDouble(), (_4_0 - _2_0).toDouble())
    }

    @Test fun testDev() {
        assertEquals(2.0.toDouble(), (_4_0 / _2_0).toDouble())
    }

    @Test fun testTimes() {
        assertEquals(4.4.toDouble(), (_4_0 * _1_1).toDouble())
    }

    @Test fun testUnaryMinus() {
        assertEquals(-1.1.toDouble(), (-_1_1).toDouble())
        assertEquals(2.0.toDouble(), (-munis_2_0).toDouble())
    }

    @Test fun testCompareTo() {
        assertTrue(_2_0 == _2_0)
        assertFalse(_2_0 > _2_0)
        assertFalse(_2_0 < _2_0)
        assertTrue(_2_0 > munis_2_0)
        assertTrue(_2_0 > _1_1)
        assertTrue(_2_0 < _4_0)
    }
}
