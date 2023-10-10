package movement.concretemovement

import board.Board
import board.Position
import movement.MovementValidator

class HorizontalMovement : MovementValidator {

    override fun validateMovement(init: Position, final: Position, board: Board): Boolean {
        return init.line.equals(final.line)
    }

}