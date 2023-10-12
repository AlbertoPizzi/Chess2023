package board

import piece.Color
import piece.Piece
import piece.PieceType

data class RegularBoard(val board: Map<Position, Piece> ) : Board{
    val colSize = 8
    val rowSize = 8
    override fun getByColor(color: Color) = board.values.filter { piece -> piece.color == color }
    override fun movePiece(init: Position, final: Position): Board {
        val piece = board[init] ?: throw Exception("No piece at $init")
        val newBoard = board.toMutableMap()
        newBoard.remove(init)
        newBoard[final] = piece
        return RegularBoard(newBoard)
    }
     override fun build(positions: List<Position>): Board {
        val board = mutableMapOf<Position, Piece>()

        return RegularBoard(board)
    }

}
