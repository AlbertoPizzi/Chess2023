package piece

class Piece (
    val type: PieceType,
    val color: Color ) {

fun getType(): PieceType {
        return type
    }
fun getColor(): Color {
        return color
    }

}