import java.time.LocalDate

internal class Fridge : IFridge {

    private var currentDate: LocalDate? = null
    private var isOpen: Boolean = false

    override fun scanAddedItem(name: String, expiry: String, condition: String) {
        throw OperationNotAllowedWhileClosed()
    }

    fun getCurrentDate(): LocalDate? {
        return currentDate
    }

    override fun setCurrentDate(date: String)
    {
        currentDate = LocalDate.parse(date)
    }

    override fun signalFridgeDoorOpened() {
        isOpen = true
    }

    override fun signalFridgeDoorClosed() {
        isOpen = false
    }
    fun isOpen(): Boolean
    {
        return isOpen
    }
}

class FridgeFactory{
    companion object{
        fun GetNew():IFridge {
            return Fridge()
        }
    }
}

interface IFridge {
    fun scanAddedItem(name: String, expiry: String, condition: String) {
        TODO("Not yet implemented")
    }
    fun setCurrentDate(date: String) {
        TODO("Not yet implemented")
    }
    fun signalFridgeDoorOpened(){
        TODO("Not yet implemented")
    }
    fun signalFridgeDoorClosed(){
        TODO("Not yet implemented")
    }
    fun showDisplay(): String {
        TODO("Not yet implemented")
    }
}