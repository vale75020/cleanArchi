package presenter

import presenter.Message.*
import vue.Vue

class AgePresenter(val vue: Vue) {
    fun presentAge(response: Int, message: Message) {
        val vueMessage =
            when (message) {
                MINEUR -> "Salut mon p’tit ! Tu as ${response} ans ?! Qu’est-ce que t'as grandi!"
                MAJ -> "Bonjour ! Vous avez ${response} ans !"
                OLD -> "Mes respects mon cher, vous ne faîtes pas vos ${response} ans !"
                ERR -> "Erreur : je n’ai pas réussi à retrouver votre âge"
            }
        vue.printMessage(vueMessage)
    }

}

enum class Message {
    MINEUR,
    MAJ,
    OLD,
    ERR
}
