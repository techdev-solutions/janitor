package de.techdev.pocket

import de.techdev.pocket.api.RetrieveOperations
import okhttp3.OkHttpClient

internal class RetrieveTemplate(private val client: OkHttpClient) : RetrieveOperations