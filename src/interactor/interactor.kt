package interactor

import presenter.AgePresenter
import presenter.AgePresenterError
import presenter.Message
import repository.AgeRepository

open class AgeInteractor(
    val repository: AgeRepository,
    val presenter: AgePresenter,
    val presenterError: AgePresenterError
) {
    fun checkMyQuestion(question: String) {
        if (question != "") {
            val res = repository.getAge(question)
            checkMyAge(res)
        } else {
            presenterError.presentAgeError()
        }
    }

    fun checkMyAge(response: Int) {
        val message =
            if (response < 18) {
                Message.MINEUR
            } else if (response > 18 && response < 70) {
                Message.MAJ
            } else if (response > 70 && response < 100) {
                Message.OLD
            } else {
                Message.ERR
            }
        presenter.presentAge(response, message)
    }
}

