
// Very similar to scala
class Person(val name: String, var age: Int) {

    /* Custom accessors. Not much different from just writing a function. If the function describes the characteristic of a thing then it may be better to write a custom accessor*/
    val IsAwesome: Boolean
        get() = name == "CJ"
}

fun HappyBirthday(person: Person): String {
    person.age++
    return "Happy Birthday ${person.name} you are now ${person.age}"
}