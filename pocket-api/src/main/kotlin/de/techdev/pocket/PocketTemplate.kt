package de.techdev.pocket

import de.techdev.pocket.api.ModifyOperations
import de.techdev.pocket.api.Pocket
import de.techdev.pocket.api.RetrieveOperations


internal class PocketTemplate : Pocket {

    private val retrieveOperations: RetrieveOperations
    private val modifyOperations: ModifyOperations

    init {
        retrieveOperations = RetrieveTemplate()
        modifyOperations = ModifyTemplate()
    }

    override fun retrieveOperations() = retrieveOperations

    override fun modifyOperations() = modifyOperations

}
