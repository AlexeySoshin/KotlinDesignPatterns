import kotlin.system.measureTimeMillis

class SingletonTest {

    @org.testng.annotations.Test
    fun testSingleton() {
        println("Test started")

        for (i in 1..3) {
            val total = measureTimeMillis {
                    //println(SlowSingleton.value)
            }

            println("Took $total ms")
        }
    }

}