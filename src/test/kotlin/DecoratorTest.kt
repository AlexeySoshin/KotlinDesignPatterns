import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.assertEquals

class DecoratorTest {



    @org.testng.annotations.Test
    fun testDecorator() {
        val map = HappyMap<String, String>()
        val result = captureOutput {
            map["A"] = "B"
            map["B"] = "C"
            map["A"] = "C"

            map.remove("A")

            map["A"] = "C"
        }

        assertEquals(mapOf("A" to "C", "B" to "C"), map.map)
        assertEquals(listOf("Yay! A", "Yay! B", "Yay! A"), (result))
    }
}

fun captureOutput(function: () -> Unit): List<String> {
    val out = System.out
    val b = ByteArrayOutputStream()

    System.setOut(PrintStream(b))

    function.invoke()

    System.setOut(out)

    return b.toString().trim().split("\r\n")
}
