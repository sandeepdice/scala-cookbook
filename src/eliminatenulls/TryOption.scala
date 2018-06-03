package eliminatenulls

object TryOption {
  def main(args: Array[String]): Unit = {
    var personNulss = new PersonNulls("first name", "last name")
    println(personNulss.age)
    println(personNulss.sex)
    println(personNulss.salary)

    println("** Option **")
    
    var persionOptions = new PersonOptions();
    println(persionOptions.age)
    
  }
}

class PersonNulls(var firstName: String, var lastName: String) {
  var age: Int = _;
  var sex: String = _;
  var salary: Float = _;
}

class PersonOptions(var firstName: Option[String], var lastName: Option[String]) {
  var age = None: Option[Int]
  var sex = None: Option[Char]
  var salary = None: Option[Float]

  def this() = {
    this(Some("first"), Some("last"))
  }
}