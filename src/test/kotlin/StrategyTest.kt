import kotlin.test.assertEquals

class StrategyTest {

    @org.testng.annotations.Test
    fun testStrategy() {

        val someAnimal = UncertainAnimal()

        val output = captureOutput {
            someAnimal.makeSound()

            someAnimal.makeSound = fun () {
                println("Woof!")
            }

            someAnimal.makeSound()
        }

        assertEquals(listOf("Meow!", "Woof!"), output)

        // Cannot change signature
        /*someAnimal.makeSound = fun (message : String) {
            println("$message")
        }*/
    }
}