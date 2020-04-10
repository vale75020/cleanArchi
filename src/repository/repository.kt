package repository

interface AgeRepository {
    fun getAge(question: String): Int?
}