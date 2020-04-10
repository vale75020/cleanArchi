package repository

import dataSource.AgeDataSource

class AgeRepositoryImpl(
    val dataSource : AgeDataSource
): AgeRepository {
    override fun getAge(question: String): Int {
          return  dataSource.ageDataSource(question).toInt()
    }
}