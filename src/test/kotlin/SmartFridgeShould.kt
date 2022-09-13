import kotlin.test.Test
import kotlin.test.assertEquals

class SmartFridgeFeatures {
    @Test
    fun `Given an empty fridge when adding an item then it yield correct display`() {
        val fridge: IFridge = Fridge()

        fridge.setCurrentDate("2021-10-18")
        fridge.signalFridgeDoorOpened()
        fridge.scanAddedItem("Milk", "2021-10-20", "sealed")
        fridge.signalFridgeDoorClosed()

        assertEquals("Milk: 2 days remaining", fridge.showDisplay())

    }
}