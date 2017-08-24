package gameoflife

/**
  * Created by pratik on 23/08/17.
  */
class Universe (seedCells : Set[Cell]){

  def tick() :Set[Cell]= {
    val survivedCells = seedCells.filter(cell => Set(2,3) contains getLiveCellSurrounded(cell).size)
    val deadCells = seedCells.flatMap(p => p.neighbours diff seedCells)
    val born = deadCells.filter(cell => Set(3) contains getLiveCellSurrounded(cell).size)
    survivedCells ++ born
  }

  private def getLiveCellSurrounded(cell: Cell) = {
    seedCells & cell.neighbours
  }
}
