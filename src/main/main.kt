package main

import controlleur.AgeController
import dataSource.AgeDataSource
import interactor.AgeInteractor
import presenter.AgePresenter
import question.Question
import repository.AgeRepositoryImpl
import vue.Vue


fun main(){
    val vue = Vue()
    val dataSource = AgeDataSource()
    val presenter = AgePresenter(vue)
    val repository = AgeRepositoryImpl(dataSource)
    val interactor = AgeInteractor(repository, presenter)
    val controller = AgeController(interactor)
    val question = Question(controller)
    question.callController("what's my age?")
}