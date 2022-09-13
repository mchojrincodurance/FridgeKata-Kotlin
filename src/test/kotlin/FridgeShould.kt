import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.api.assertThrows
import java.time.LocalDate
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class FridgeShould {
    @ParameterizedTest
    @CsvSource("2021-10-21", "2021-10-22")
    fun `parse date correctly`(date: String) {
        val fridge = Fridge()
        fridge.setCurrentDate(date)
        assertEquals(LocalDate.parse(date), fridge.getCurrentDate())
    }
    @Test
    fun `not allow adding items while closed`() {
        assertThrows<OperationNotAllowedWhileClosed> {
            val fridge = Fridge()

            fridge.scanAddedItem("Milk", "21/10/21", "sealed")
        }
    }

    @Test
    fun `allow opening`() {
        val fridge = Fridge()

        fridge.signalFridgeDoorOpened()
        assertTrue { fridge.isOpen() }
    }

    @Test
    fun `allow closing`() {
        val fridge = Fridge()

        fridge.signalFridgeDoorClosed()
        assertFalse { fridge.isOpen() }
    }
}