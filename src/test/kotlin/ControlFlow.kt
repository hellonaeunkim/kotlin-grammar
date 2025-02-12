import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ControllFlow {

    // 1. if
    @Test
    fun `if`() {
        val max = max(1, 10)
        assertEquals(10, max)
    }

    private fun max(num1: Int, num2: Int): Int = if (num1 > num2) num1 else num2

    // 2. when
    @Test
    fun `when`() {
        val numberType1 = getNumberType(10)
        assertEquals("positive", numberType1)

        val numberType2 = getNumberType(0)
        assertEquals("zero", numberType1)

        val numberType3 = getNumberType(-1)
        assertEquals("negative", numberType1)

    }

    private fun getNumberType(number: Int): String =
        when {
            number < 0 -> "negative"
            number == 0 -> "zero"
            number > 0 -> "positive"
            else -> "zero"
        }

    // 3. while
    @Test
    fun `while`() {

//        val count = 0 // 값 변경 불가능
        var count = 0
        var sum = 0 // 값 변경 가능

        while (count < 5) {
            sum += count
            count++
//            count++ // val 이므로 변경 불가능 !

            assertEquals(10, sum)
        }
    }

    // 4. for
    @Test
    fun `for`() {
        val list = listOf(1, 2, 3, 4, 5)
        var sum = 0

        for (number in list) {
            sum = sum + number
        }

        assertEquals(15, sum)
    }
}
