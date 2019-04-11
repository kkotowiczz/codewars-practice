object Sol {
  def race(v1: Int, v2: Int, g: Int): Array[Int] = {
    if(v1 >= v2) Array(-1, -1, -1)
    else if (g < 0) Array(1,2, 3)
    else race(v1, v2, (v1 + g) - v2)
  }


  def main(args: Array[String]): Unit = {
    val race1 = race(30, 50, 450)
    race1.foreach(println)
  }
}