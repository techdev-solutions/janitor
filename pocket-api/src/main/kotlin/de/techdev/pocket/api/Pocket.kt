package de.techdev.pocket.api

interface Pocket {

    fun retrieveOperations(): RetrieveOperations

    fun modifyOperations(): ModifyOperations

}
