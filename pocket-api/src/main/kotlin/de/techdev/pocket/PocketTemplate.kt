package de.techdev.pocket

import de.techdev.pocket.api.ModifyOperations
import de.techdev.pocket.api.Pocket
import de.techdev.pocket.api.RetrieveOperations
import okhttp3.OkHttpClient


internal class PocketTemplate : Pocket {

    private val retrieveOperations: RetrieveOperations
    private val modifyOperations: ModifyOperations

    init {
        val client = client()

        retrieveOperations = RetrieveTemplate(client)
        modifyOperations = ModifyTemplate(client)
    }

    private fun client(): OkHttpClient {
        return OkHttpClient()
    }

    override fun retrieveOperations() = retrieveOperations

    override fun modifyOperations() = modifyOperations

}
