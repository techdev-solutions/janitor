package de.techdev.pocket.api

interface RetrieveOperations {

    fun items(state: State = State.UNREAD, sort: Sort = Sort.OLDEST, details: Details = Details.SIMPLE): Collection<Item> = emptyList()

}
