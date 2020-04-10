package main

import controlleur.AgeController
import dataSource.AgeDataSource
import interactor.AgeInteractor
import presenter.AgePresenter
import presenter.AgePresenterError
import question.Question
import repository.AgeRepositoryImpl
import vue.Vue
import vue.VueError


fun main(){
    val vueError = VueError()
    val vue = Vue()
    val dataSource = AgeDataSource()
    val presenter = AgePresenter(vue)
    val presenterError = AgePresenterError(vueError)
    val repository = AgeRepositoryImpl(dataSource)
    val interactor = AgeInteractor(repository, presenter, presenterError)
    val controller = AgeController(interactor)
    val question = Question(controller)
    question.callController("erernfekjr")
}