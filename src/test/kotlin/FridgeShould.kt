import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class FridgeShould {
    @Test
    fun `throw exception when adding item while closed`() {
        assertThrows<OperationNotAllowedWhileClosed> {
            val fridge = Fridge()

            fridge.scanAddedItem("Milk", "21/10/21", "sealed")
        }
    }
}