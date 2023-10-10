package movement

import board.Board
import board.Position

data class Movement(
    val initpos: Position,
    val finalpos: Position,
    val movementValidator: MovementValidator,
    val board: Board
) {

    fun getInitpos(): Position {
        return initpos
    }

    fun getFinalpos(): Position {
        return finalpos
    }

    fun moveTo(init: Position, final: Position) {
        if (movementValidator.validateMovement(init, final, board)) {

        } else {
            throw Exception("Invalid movement")
        }
    }
}