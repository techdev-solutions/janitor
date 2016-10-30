package de.techdev.pocket.api

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.Duration
import java.time.Instant

data class Item(
        @JsonProperty("item_id") val id: Long,
        @JsonProperty("time_added") val added: Long,
        @JsonProperty("given_url") val url: String,
        @JsonProperty("resolved_title") val title: String?) {

    fun label(): String{
        if (title.isNullOrEmpty()) {
            return url
        }

        return title!!
    }

    fun age(): Long {
        val instant = Instant.ofEpochSecond(added)
        return Duration.between(instant, Instant.now()).toDays()
    }

}
