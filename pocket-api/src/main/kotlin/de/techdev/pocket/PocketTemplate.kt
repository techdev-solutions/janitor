package de.techdev.pocket

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import de.techdev.pocket.api.ModifyOperations
import de.techdev.pocket.api.Pocket
import de.techdev.pocket.api.RetrieveOperations
import okhttp3.OkHttpClient


internal class PocketTemplate(consumer: String, access: String) : Pocket {

    private val retrieveOperations: RetrieveOperations
    private val modifyOperations: ModifyOperations

    init {
        val transport = transport(consumer, access)

        retrieveOperations = RetrieveTemplate(transport)
        modifyOperations = ModifyTemplate(transport)
    }

    private fun transport(consumer: String, access: String): Transport {
        return Transport(client(), mapper(), consumer, access)
    }

    private fun mapper(): ObjectMapper {
        return jacksonObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
    }

    private fun client(): OkHttpClient {
        return OkHttpClient.Builder().addInterceptor(PocketInterceptor).build()
    }

    override fun retrieveOperations() = retrieveOperations

    override fun modifyOperations() = modifyOperations

}
