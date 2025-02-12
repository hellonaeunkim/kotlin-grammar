import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class InterOperWithJava {
    @Test
    fun javaclasscall() {
        val personJava = PersonJava("ann", 27)
        personJava.age
        personJava.name

        assertEquals(27, personJava.age)
        assertEquals(personJava.name, "ann")
    }
}