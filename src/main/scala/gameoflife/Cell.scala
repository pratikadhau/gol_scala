package gameoflife

import scala.util.matching.Regex.Match

/**
  * Created by pratik on 23/08/17.
  */
case class Cell(x: Int, y: Int) {
  def isNeighbour(cell: Cell): Boolean = {
    val ranges = Set(0, 1)
    (ranges contains Math.abs(x - cell.x)) && (ranges contains Math.abs(y - cell.y))
  }

  def neighbours : Set[Cell] = Set(Cell(x-1,y-1)
                                  ,Cell(x-1,y)
                                  ,Cell(x-1,y+1)
                                  ,Cell(x,y-1)
                                  ,Cell(x,y+1)
                                  ,Cell(x+1,y-1)
                                  ,Cell(x+1,y)
                                  ,Cell(x+1,y+1))

}
