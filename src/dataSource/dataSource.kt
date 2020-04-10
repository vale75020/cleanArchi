package dataSource

class AgeDataSource() {

    fun ageDataSource(question: String): String {
        var response = ""
        if (question == "what's my age?") {
            response = "36"
            return response
        } else {
            response = "Repeat the question please"
            return response
        }
    }
}