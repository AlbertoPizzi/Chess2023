package board

data class Position (val column: Int ,val line : Int) {
    fun getColumn(): Int {
        return column
    }
    fun getLine(): Int {
        return line
    }
}