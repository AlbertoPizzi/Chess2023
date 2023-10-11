package board

import piece.Color
import piece.Piece

interface Board {
    fun build(positions: List<Position>):Board
    fun getByColor(color: Color): List<Piece>

    fun movePiece(init: Position, final: Position): Board
}