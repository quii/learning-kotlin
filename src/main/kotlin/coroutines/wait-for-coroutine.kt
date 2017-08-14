package coroutines

import kotlinx.coroutines.experimental.*

fun main(args: Array<String>) = runBlocking<Unit> {
    val job = launch(CommonPool) { printWorld() }
    println("Hello,")
    job.join() // wait until child coroutine completes
}

// the suspend keyword lets you call coroutine-y functions like delay
suspend fun printWorld() {
    delay(1000L)
    println("World!")
}