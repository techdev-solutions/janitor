package de.techdev.pocket.api

import de.techdev.pocket.PocketTemplate

interface Pocket {

    companion object {
        fun connect(): Pocket = PocketTemplate()
    }

    fun retrieveOperations(): RetrieveOperations

    fun modifyOperations(): ModifyOperations

}
