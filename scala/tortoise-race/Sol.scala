object Sol {
  def race(v1: Int, v2: Int, g: Int): Array[Int] = {
    val difference = g.toDouble / (v2 - v1).toDouble
    if(v1 >= v2) Array(-1, -1, -1)
    else Array(difference.toInt, (difference * 60 % 60).toInt, (difference * 3600 % 60).toInt)
  }

  def main(args: Array[String]): Unit = {
    val race1 = race(30, 50, 5436)
    race1.foreach(println)
  }
}