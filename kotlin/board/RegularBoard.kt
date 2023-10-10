package board

import piece.Color
import piece.Piece
import piece.PieceType

data class RegularBoard(val board: Map<Position, Piece> ) : Board{
    fun getByColor(color: Color) = board.values.filter { piece -> piece.color == color }
    fun boardBuilder(colSize : Int , rowSize: Int ){

    }

    override fun build(positions: List<Position>): Board {
        TODO("Not yet implemented")
    }

}
