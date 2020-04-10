package controlleur

import interactor.AgeInteractor

open class AgeController(val interactor: AgeInteractor) {

    fun checkMyQuestion(question: String) {
            interactor.checkMyQuestion(question)
        }
    }
