package movement

import board.Board
import board.Position
import piece.Piece

data class Movement(
    val initpos: Position,
    val finalpos: Position,
    val board: Board,
    val piece: Piece
) {
    fun moveTo(init: Position, final: Position) {
        board.movePiece(init, final)
    }
}