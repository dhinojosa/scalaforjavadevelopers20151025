
import scala.beans.BeanProperty

class Person(firstName:String, lastName:String)

class Employee(@BeanProperty val firstName:String, 
               val middleName:Option[String],
               @BeanProperty var lastName:String,
               val title:String) extends Person(firstName, lastName) {

    //Block of the primary
    import Employee._
    require(title != null)
    c = c + 1
    private val fullName = s"$firstName $lastName"

    def this(firstName:String, lastName:String) = {
      //Block of the secondary
      this(firstName, None, lastName, "Toys")
    }

    def this(firstName:String, middleName:String, lastName:String) = {
      this(firstName, Some(middleName), lastName, "Toys")
    }
}

object Employee {
    private var c = 0
    def count = c
    def food = println("33")
}

case class Department(name:String)

object Runner {
  def main(args:Array[String]) {
     println("Woot! Scala")
  }
}

object AltRunner extends App {
    println("Woot! Again! Scala!")
}


