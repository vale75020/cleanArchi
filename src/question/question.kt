package question

import controlleur.AgeController

class Question (val controller : AgeController) {
    fun callController(question: String){
        controller.checkMyQuestion(question)
    }
}