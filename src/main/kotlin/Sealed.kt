
sealed class Content{
    data class Chapter(val title: String, val bookName: String) : Content()
    data class Article(val title: String, val journalName: String): Content()
}

fun PrintContentTitle(content: Content): String =  when(content) {
    is Content.Chapter -> "${content.title} - ${content.bookName}"
    is Content.Article -> "${content.title} - ${content.journalName}"
}
