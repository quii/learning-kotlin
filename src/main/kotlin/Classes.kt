
// Very similar to scala
class Person(val name: String, var age: Int, private val secret: String) {

    /* Custom accessors. Not much different from just writing a function. If the function describes the characteristic of a thing then it may be better to write a custom accessor*/
    val IsAwesome: Boolean
        get() = name == "CJ"
}

//todo: return the score or 0 once ive seen how to handle the null thing
fun findHighestScore(scores: List<Score>): Score?{
    return scores.maxBy(Score::amount)
}

data class Score(val amount: Int, val participant: String)

//note: the IDE moans that this can be refactored into a simple declaration, the init syntax is helpful when you need a block to do more complicated stuff. But why would a constructor ever be complicated...
class SideEffectyConstructors constructor(_phrase: String) {
    val phrase: String

    init {
        phrase = "Poo " + _phrase
    }
}

class MultipleConstructors{

    val score: Int

    constructor(name: String){
        if(name=="CJ"){
            score = 10
        }else {
            score = 2
        }
    }

    constructor(_score: Int) {
        score = _score
    }
}

fun HappyBirthday(person: Person): String {
    person.age++
    return "Happy Birthday ${person.name} you are now ${person.age}"
}