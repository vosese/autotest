import org.junit.Test
import kotlin.test.assertEquals

class MainKtTest {

    @Test
    fun test1() {
        val typeCard = "VK Pay"
        val history = 0
        val amount = 75_000

        val result = comission(typeCard, history, amount)

        assertEquals(3000, result)
    }
}

/*  IDEA выдаёт следующий результат:

Test events were not received


> Task :wrapper
BUILD SUCCESSFUL in 2s
1 actionable task: 1 executed
> Task :compileKotlin UP-TO-DATE
> Task :compileJava NO-SOURCE
> Task :processResources NO-SOURCE
> Task :classes UP-TO-DATE
> Task :jar UP-TO-DATE
> Task :inspectClassesForKotlinIC UP-TO-DATE
> Task :compileTestKotlin UP-TO-DATE
> Task :compileTestJava NO-SOURCE
> Task :processTestResources NO-SOURCE
> Task :testClasses UP-TO-DATE
> Task :test
BUILD SUCCESSFUL in 1s
5 actionable tasks: 1 executed, 4 up-to-date
21:20:14: Execution finished ':test'.
 */