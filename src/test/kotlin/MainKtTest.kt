import org.junit.Test
import kotlin.test.assertEquals

class MainKtTest {

    @Test
    fun test1() {
        val typeCard = "VK Pay"
        val history = 0
        val amount = 75_000

        val result = comission(typeCard, history, amount)

        assertEquals(5, result)
    }

    @Test
    fun MaestroTest1() {
        val typeCard = "Maestro"
        val history = 0
        val amount = 75_000

        val result = comission(typeCard, history, amount)

        assertEquals(470.0, result)
    }

    @Test
    fun MaestroTest2() {
        val typeCard = "Maestro"
        val history = 0
        val amount = 15_000

        val result = comission(typeCard, history, amount)

        assertEquals(0, result)
    }

    @Test
    fun MasterCardTest1() {
        val typeCard = "MasterCard"
        val history = 0
        val amount = 75_000

        val result = comission(typeCard, history, amount)

        assertEquals(470.0, result)
    }

    @Test
    fun MasterCardTest2() {
        val typeCard = "MasterCard"
        val history = 0
        val amount = 15_000

        val result = comission(typeCard, history, amount)

        assertEquals(0, result)
    }

    @Test
    fun VisaTest1() {
        val typeCard = "Visa"
        val history = 0
        val amount = 75_000

        val result = comission(typeCard, history, amount)

        assertEquals(562.5, result)
    }

    @Test
    fun VisaTest2() {
        val typeCard = "Visa"
        val history = 0
        val amount = 4500

        val result = comission(typeCard, history, amount)

        assertEquals(35, result)
    }

    @Test
    fun MirTest1() {
        val typeCard = "Мир"
        val history = 0
        val amount = 75_000

        val result = comission(typeCard, history, amount)

        assertEquals(562.5, result)
    }

    @Test
    fun MirTest2() {
        val typeCard = "Мир"
        val history = 0
        val amount = 4500

        val result = comission(typeCard, history, amount)

        assertEquals(35, result)
    }

    @Test
    fun test4() {
        val typeCard = "РосСельхозБанк"
        val history = 0
        val amount = 75_000

        val result = comission(typeCard, history, amount)

        assertEquals("Error", result)
    }
}