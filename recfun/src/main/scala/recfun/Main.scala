package recfun

object Main {
  def main(args: Array[String]) {
    println(countChange(4, List(1, 2)))
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if (c < 1 || c >= r) 1 else pascal(c - 1, r - 1) + pascal(c, r - 1)
    }
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def loop(l: List[Char], k: Int): Boolean = {
        if (k < 0) false
        else if (l.isEmpty) k == 0
        else {
          if (l.head == '(') loop(l.tail, k+1)
          else if (l.head == ')') loop(l.tail, k-1)
          else loop(l.tail, k)
        }
      }
      loop(chars, 0)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      if (money < 0) 0
      else if (money == 0) 1
      else if (coins.isEmpty) 0
      else countChange(money, coins.tail) + countChange(money - coins.head, coins)
    }
  }
