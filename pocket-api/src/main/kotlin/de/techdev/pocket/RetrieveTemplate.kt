package de.techdev.pocket

import de.techdev.pocket.api.*

internal class RetrieveTemplate(private val transport: Transport) : RetrieveOperations {

    private var endpoint = "https://getpocket.com/v3/get"

    constructor(transport: Transport, endpoint: String) : this(transport) {
        this.endpoint = endpoint
    }

    override fun items(state: State, sort: Sort, details: Details): Collection<Item> {
        val retrieve = Retrieve(state.value, sort.value, details.value)

        val result: RetrieveResponse = transport.post(retrieve, endpoint)
        return result.items.values
    }

}
