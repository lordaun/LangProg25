object TCalc {
	def getTPercentage(names: List[String]): Int = {
          if (names.size > 6) 20
          else if (names.size > 0) 10
          else 0
        }
}
