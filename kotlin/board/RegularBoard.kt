package board

import piece.Color
import piece.Piece
import piece.PieceType

data class RegularBoard(val board: Map<Position, Piece>) {
    fun getByColor(color: Color) = board.values.filter { piece -> piece.color == color }

}
