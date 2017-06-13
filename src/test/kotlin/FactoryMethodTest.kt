import kotlin.test.assertEquals



class FactoryMethodTest {
    @org.testng.annotations.Test
    fun testFactoryMethod() {

        // Cannot do this, constructor is private
        // val arya = SecretiveGirl();

        val arya1 = SecretiveGirl.newGirl("Arry")

        assertEquals(17, arya1.age)
        assertEquals("Arry", arya1.name)
        assertEquals("A girl has no desires", arya1.desires)

        val arya2 = SecretiveGirl.newGirl("Cersei Lannister", "Joffrey", "Ilyn Payne")

        assertEquals(17, arya2.age)
        assertEquals("A girl has no name", arya2.name)
        assertEquals("Cersei Lannister, Joffrey, Ilyn Payne", arya2.desires)
    }
}
