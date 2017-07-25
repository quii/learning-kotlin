
// Very similar to scala
class Person(val name: String, var age: Int)

fun HappyBirthday(person: Person): String {
    person.age++
    return "Happy Birthday ${person.name} you are now ${person.age}"
}