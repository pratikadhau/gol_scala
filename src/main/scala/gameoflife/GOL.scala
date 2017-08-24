package gameoflife

/**
  * Created by pratik on 23/08/17.
  */
object GOL {

  def main(args: Array[String]): Unit = {

    val seedCells = Set(Cell(0,0),Cell(0,1),Cell(0,2))

    val initialGen = new Universe(seedCells)

    initialGen.tick().foreach( println )

  }
}
