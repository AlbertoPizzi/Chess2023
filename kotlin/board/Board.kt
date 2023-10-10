package board

import piece.Piece

interface Board {
    fun build(positions: List<Position>):Board
}