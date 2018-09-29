package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))

  val s1 = singletonSet(4)
  val s2 = singletonSet(8)
  val s3 = singletonSet(3)

  val y = union(s1, s2)
  printSet(y)
  val z = union(y, s3)
  printSet(z)
  val m = map(z, x => x * x)
  printSet(m)
}
