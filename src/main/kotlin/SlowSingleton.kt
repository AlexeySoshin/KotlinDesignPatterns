import java.util.*
import kotlin.system.measureTimeMillis

object SlowSingleton {
    val value : String
    init {

        var uuid = ""
        val total = measureTimeMillis {

            println("Computing")
            for (i in 1..10_000_000) {
                uuid = UUID.randomUUID().toString()
            }
        }

        value = uuid

        println("Done computing in ${total}ms")
    }
}

object JustSingleton {
    val value : String = "Just a value"
}