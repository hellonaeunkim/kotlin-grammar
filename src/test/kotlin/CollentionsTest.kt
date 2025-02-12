import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CollentionsTest {

    // 1. List (순서 보장)
    // listOf
    @Test
    fun immutableList() {
        val list = listOf("a", "b", "c", "d", "e", "f")
        assertEquals("a", list[0])
        assertEquals(6, list.size)
        assertEquals(true, list.contains("a"))

//        list.add("test") // 변경 불가능
//        list[0] // 변경 불가능
    }

    // mutableListOf
    @Test
    fun mutableList() {
        val list = mutableListOf("a", "b", "c", "d", "e", "f")
        assertEquals("a", list[0])
        assertEquals(6, list.size)
        assertEquals(true, list.contains("a"))

        list.add("test") // 변경 가능
        list[0] = "changed" // 변경 가능

        println(list)
    }

    // 2. Set (중복 제거)
    // setOf
    @Test
    fun immutableSet() {
        val set = setOf(1,2, 3)

//        set.add // 변경 불가능
    }

    // mutableSetOf
    @Test
    fun mutableSet() {
        val set = mutableSetOf(1,2,3)

        set.add(4)
        println(set)
    }

    // 3. Map
    //mapOf
    @Test
    fun immutableMap() {
        val map = mapOf("Apple" to 100, "Banana" to 200)
        println(map)

        assertEquals(100, map["Apple"])
        assertEquals(200, map["Banana"])

//        map["Apple"] = 300 // 변경 불가능

    }

    // mutableMapOf
    @Test
    fun mutableMap() {
        val map = mutableMapOf("Apple" to 100, "Banana" to 200)

        map["Apple"] = 300
    }
}