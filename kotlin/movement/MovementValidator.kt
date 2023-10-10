package movement

import board.Board
import board.Position

interface MovementValidator {
    fun validateMovement(init: Position, final: Position, board: Board): Boolean
}