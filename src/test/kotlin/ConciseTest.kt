import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ConciseTest {
    @Test
    fun functions() {
        // 더하기 함수 결과 테스트
        val result1 = sum(1, 3)
        assertEquals(4, result1)

        val result2 = sum(2, 5)
        assertEquals(7, result2)
    }

    private fun sum(num1: Int, num2: Int) = num1 + num2 // Type 추론
//    private fun sum(num1: Int, num2: Int): Int { // Type 명시
//        return num1 + num2
//    }

    @Test
    fun datacclass() {
        val person = Person("ann", "ann@email.com")
        assertEquals("ann", person.name)
        assertEquals("ann@email.com", person.email)

        val person2 = person.copy(name = "kim")
        assertEquals("kim", person2.name)
        assertEquals("ann@email.com", person2.email)
    }

    data class Person(val name: String, val email: String) // 변수 (Property), 동시에 생성자

    @Test
    fun stringTemplates() {
//        "" + "test" + "test2" -> Java에서 concat

        val lan = "kotlin"
        val version = 2.0

        val concat = "Languate is ${lan} and version is ${version}"
        assertEquals("Languate is kotlin and version is 2.0", concat)
    }

    @Test
    fun 확장함수() {
        val text: String = "Hello World!"
        text.repeatCustom(5)

        println(text.repeatCustom(5))
    }

    fun String.repeatCustom(times: Int): String {
        return this.repeat(times)
    }
}