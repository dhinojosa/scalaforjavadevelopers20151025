val a = 10
val a = 50
val a = 50
var b = 40
b = 50
class Employee(val firstName:String, lastName:String)
new Employee("Ada", "Lovelace")
res0.firstName
class Employee(val firstName:String, var lastName:String)
val ada = new Employee("Ada", "Lovelace")
ada.firstName
ada.lastName
ada.lastName = "Smith"
ada.lastName
val howMuchYouPayingMe_? = 40
val `Hey, what's going on, you wanna get some Mangos?` = 400
val `return` = 40
val `void` = 20
val `true` = false
if (`true`) `return` else `void`
4 + 10
4.+(10)
val b:Byte = 30
val b = 30:Byte
val b = 30.toByte
4.0.+(10)
val a = 0
val b = 30
var a = 0
val b = 30
if (b > 40) a = 19 else a = 20
a
val b = 30
val a = if (b > 40) 19 else 20
var list = List()
var list = List[Int]()
for (i <- 1 to 100) {
    list = list :+ i
}
list
val list = for (i <- 1 to 100) yield (i + 1)
val age = 23
s"My perceived age is $age"
s"My perceived age is $age.abs"
s"My perceived age is ${age.abs}"
"My perceived age is %d".format(age)
def method1(x:Int, y:Int):Int = {
    val temp = x + y
    return temp
}
def method1(x:Int, y:Int) = {
    val temp = x + y
    temp
}
def method1(x:Int, y:Int) = x + y
def method1(x:Int, y:Int) = x + y
def method1(x:Int, y:Int) {
    x + y
}
method1(3, 10)
def method1(x:Int, y:Int) {
}
def method1(x:Int, y:Int) = {
    x + y
    ()
}
method1(3, 40)
List()
def method1(x:Int, y:Int):Unit = {
   x + y
}
res22 :+ (30)
val list:List[Any] = res22 :+ (30)
val list:List[AnyVal] = res22 :+ (30)
val list:List[Int] = res22 :+ (30)
new Department("Gardening")
case class Department(name:String)
Department("Toys")
Department("Toys")
res25 == res26
res25.equals(res26)
res25 eq res26
res25.copy(name = "Hardware")
res25
def foo(x:Int, y:Int) = x + y
foo(y = 30, x = 10)
class Foo(x:Int) {
   def bar(y:Int) = x + y
}
val foo = new Foo(10)
foo.bar(14)
class Foo(x:Int) {
   def apply(y:Int) = x + y
}
val foo = new Foo(10)
foo.apply(14)
foo(14)
class Foo(x:Int) {
   def ~:(y:Int) = x + y
}
val foo = new Foo(10)
foo.~:(14)
14 ~: foo
1 :: 2 :: 3 :: 4 :: Nil
Nil
List(1,2,3,4)
List(1,2,3,4) :+ 5
0 +: List(1,2,3,4) :+ 5
Some("Ryan")
res43.get
None
res43.get
res45.getOrElse("No middle name")
new Employee("Bob", Some("Q"), "Barker", "Host")
new Employee("Bob", "Q", "Barker")
res51.middleName
res50.middleName
res50.middleName.get
new Employee("Bob", "Barker")
res55.middleName
res55.middleName.getOrElse("No middle name"
)
res55.middleName.getOrElse("No middle name")
res55.middleName.getOrElse("No middle name")
val a:Option[String] = null
val list = new java.util.ArrayList[String]()
list.add("Foo")
list.add("Bar")
object MySingleton
val a = MySingleton
val b = MySingleton
a == b
a eq b
object MySingleton {
  def add(x:Int, y:Int) = x + y
}
MySingleton.add(10, 20)
new Employee("Bob", "Barker")
Employee.count
new Employee("Bob", "Barker")
Employee.count
Employee.count
Employee.count
Employee.count
object Sam {
  def foo() = println(3)
}
Sam.foo
Sam.foo()
object Sam {
  def foo = println(3)
}
object Sam {
  def foo() = println(3)
}
val t = (1, 112.00, "Foo")
t._1
t._2
t._3
val t:Tuple3[Int, Double, String] = (1, 112.00, "Foo")
def foo(t:Tuple3[Int, Double, String]) = t._1 + t._2
foo((4, 19.3, "Foo"))
val t = (1, "Foo")
t.swap
List(1,2,3,4,5)
List.apply(1,2,3,4,5)
List(1,2,3,4,5).head
List(1,2,3,4,5).tail
List(1,2,3,4,5).init
List(1,2,3,4,5).last
List(1,2,3,4,5).mkString("@")
List(1,2,3,4,5).mkString("@")
List(1,2,3,4,5).mkString(" * ")
List(1,2,3,4,5).mkString("{", " * ", "}")
Set(1,2,3,4,5)
Set(1,2,3,4,5)
Set(1,2,3,4,5)
Set.apply(1,2,3,4,5)
Set.apply(1,2,3,4,5) + 10
res99
Map((1, "One"), (2, "Two"), (3, "Three"))
val a = 1 -> "One"
Map(1 -> "One", 2 -> "Two", 3 -> "Three")
res103.get(1)
Map(1 -> "One", 2 -> "Two", 3 -> "Three")
res105.get(1)
res105.get(5)
res105.apply(1)
res105(1)
List(1,2,3,4,5)
res111.apply(3)
res111(3)
"Hello, is it me you're looking for".head
"Hello, is it me you're looking for".apply(4)
val f:Function1[String, Int] = new Function1[String, Int] {
        def apply(s:String) = s.size
}
f.apply("Hello")
f("Hello")
val f  = (s:String) => s.size
List("Foo", "Zoom", "Minnesota", "St. Paul", "Minneapolis").map(f)
List("Foo", "Zoom", "Minnesota", "St. Paul", "Minneapolis").filter((x:String) => x.size > 3)
List("Foo", "Zoom", "Minnesota", "St. Paul", "Minneapolis").filter(x => x.size > 3)
List("Foo", "Zoom", "Minnesota", "St. Paul", "Minneapolis").filter(x => x.size > 3)
List("Foo", "Zoom", "Minnesota", "St. Paul", "Minneapolis").filter(_.size > 3)
List("Foo", "Zoom", "Minnesota", "St. Paul", "Minneapolis").map(s => s.size)
List("Foo", "Zoom", "Minnesota", "St. Paul", "Minneapolis").map(_.size)
List(1,2,3,4,5).map(x=>x+1)
List(1,2,3,4,5).map(_+1)
List(1,2,3,4,5).map(1+_)
List(1,2,3,4,5).map(1+)
List(1,2,3,4,5).find(x => x % 2 == 0)
List(1,2,3,4,5).foldLeft(0)((total, next) => next * total)
List(1,2,3,4,5).foldLeft(1)((total, next) => next * total)
(1 to 5).foldLeft(1)((total, next) => next * total)
(1 to 5).foldLeft(1){(total, next) => println(s"total: $total, next: $next"); next * total}
(1 to 5).foldLeft(1){(total, next) => println(s"total: $total, next: $next"); next * total}
1 to 5
(1 to 5).foldRight(1){(next, total) => println(s"total: $total, next: $next"); next * total}
(1 to 5).foreach(x => println(x))
(1 to 5).foreach(println(_))
(1 to 5).foreach(println _)
(1 to 5).foreach(println)
(1 to 5) foreach println
val groceries = List("Eggs", "Naan", "Yogurt", "Orange Juice", "Vegetables", "Ketchup")
groceries.zipWithIndex
groceries.zipWithIndex.map(x => x.swap)
groceries.zipWithIndex.map(x => x.swap).map(t => (t._1 + 1, t._2))
groceries.zipWithIndex.map(x => x.swap).map(t => (t._1 + 1, t._2)).map(t => s"$t._1. $t._2")
groceries.zipWithIndex.map(x => x.swap).map(t => (t._1 + 1, t._2)).map(t => s"${t._1}. ${t._2}")
groceries.zipWithIndex.map(x => x.swap).map(t => (t._1 + 1, t._2)).map(t => s"${t._1}. ${t._2}")
groceries.zipWithIndex.map(x => x.swap).map(t => (t._1 + 1, t._2)).map(t => s"${t._1}. ${t._2}").mkString("\n")
groceries.view.zipWithIndex.map(x => x.swap).map(t => (t._1 + 1, t._2)).map(t => s"${t._1}. ${t._2}").mkString("\n")
try {
   1/0
} catch {
   case e:ArithmeticException => "Nope"
}
def foo (x:Int, y:Int) = {
   if (x > 10) x + y
   else "Zoom"
}
import scala.concurrent._
import ExecutionContext.Implicits.global
val myFuture = Future { println(Thread.currentThread.getName); Thread.sleep(5000);100/2}
myFuture foreach println
val myFuture = Future { println(Thread.currentThread.getName); Thread.sleep(5000);100/2}
myFuture foreach println
