import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import kotlin.test.assertNotNull
import kotlin.test.assertNull

class NullSafetyTest {

    @Test
    fun notNullableTypes() {
        val language = "kotlin" // val or var
        assertNotNull(language)
    }

    @Test
    fun nullableTypes() {
        val language: String? = null // String Type인데, null이 될 수도 있다는 뜻
        assertNull(language)
    }

    @Test
    fun safeCall() {
        val language: String? = null
        val length = language?.length // null일 가능성 있는 변수의 길이 알고 싶을 때
        assertNull(length) // null

        val notNulllanguage: String = "Java"
        val notNulllanguageLength = notNulllanguage.length // null일 가능성 있는 변수의 길이 알고 싶을 때
        assertEquals(4, notNulllanguageLength) // null
    }

    // Default 값을 지정해줄 수 있다.
    @Test
    fun elvisOperator() {
        val language: String? = null
        val length = language?.length ?: 10 // ?: 10 -> elvis 연산자
        assertEquals(10, length)
    }

    // 지양
    @Test
    fun notNullAssertions() {
        val language: String? = null

        assertThrows(NullPointerException::class.java) {
            language!!.length // !! null이 아니라고 단언
        }
    }
}

// Java : String name = "ann"
// "ann"