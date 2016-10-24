package de.techdev.pocket.api

import com.fasterxml.jackson.annotation.JsonProperty

data class Item(
        @JsonProperty("item_id") val id: Long,
        @JsonProperty("time_added") val added: Long,
        @JsonProperty("resolved_title") val title: String?)
