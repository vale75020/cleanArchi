package repository

import dataSource.AgeDataSource
import java.lang.NumberFormatException

class AgeRepositoryImpl(
    val dataSource : AgeDataSource
): AgeRepository {
    override fun getAge(question: String): Int? {
       try {
           val check = dataSource.ageDataSource(question).toInt()
           return check
       } catch(e: NumberFormatException) {return null}
    }
}