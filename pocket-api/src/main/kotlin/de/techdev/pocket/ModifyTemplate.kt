package de.techdev.pocket

import de.techdev.pocket.api.ModifyOperations
import okhttp3.OkHttpClient

internal class ModifyTemplate(private val client: OkHttpClient) : ModifyOperations