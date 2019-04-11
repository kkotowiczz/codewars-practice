object Sol {
  def evaporator(content: Double, evapPerDay: Int, threshold: Int, days: Int = 0): Int = {
    if (content <= threshold / 10) days
    else evaporator(content - (content * evapPerDay / 100), evapPerDay, threshold, days + 1)
  }

  def main(args: Array[String]): Unit = {
    println(evaporator(`  10, 10, 10))
  }

}