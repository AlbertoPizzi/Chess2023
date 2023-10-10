package movement

import board.Board
import board.Position
import piece.Piece

data class Movement(
    val initpos: Position,
    val finalpos: Position,
    val movementValidator: MovementValidator,
    val board: Board,
    val piece: Piece
) {
//    fun moveTo(init: Position, final: Position) {
//        if (movementValidator.validateMovement(init, final, board))
//
//    }
}