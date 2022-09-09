internal class Fridge : IFridge {

    var IsOpen: Boolean = false

    override fun scanAddedItem(name: String, expiry: String, condition: String) {
        throw OperationNotAllowedWhileClosed();
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