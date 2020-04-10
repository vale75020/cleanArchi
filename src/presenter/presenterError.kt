package presenter


import vue.VueError

class AgePresenterError(val vueError: VueError) {
    fun presentAgeError() {
        val messageError = "Vous n'avez pas rentré votre age"
        vueError.printMessageError(messageError)
    }

}

