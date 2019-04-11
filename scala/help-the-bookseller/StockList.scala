import scala.collection.immutable.TreeMap

object StockList {
  def stockSummary(lstOfArt: Array[String], lstOfCat: Array[String]): String = {
    val categoryQuantity = for {
      book <- lstOfArt
      cat <- lstOfCat
      quantity =
        if(book.startsWith(cat)) book.substring(book.indexOf(" ") + 1).toInt
        else 0
    } yield (cat -> quantity)
    val mergedMap = categoryQuantity.groupBy(_._1) mapValues(_.map(_._2))
    val treeMap = TreeMap[String, Array[Int]]() ++ mergedMap
    val stringList = treeMap.map { case (k, v) => s"($k : ${v.sum})" }

    stringList.mkString(" - ")
  }
  def main(args: Array[String]): Unit = {
    var b = Array("BBAR 150", "CDXE 515", "BKWR 250", "BTSQ 890", "DRTY 600")
    var c = Array("A", "B", "C", "D")
    println(stockSummary(b, c))
  }
}