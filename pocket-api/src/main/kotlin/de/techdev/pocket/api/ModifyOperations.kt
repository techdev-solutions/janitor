package de.techdev.pocket.api

interface ModifyOperations {

    fun archive(item: Item) = archive(listOf(item))

    fun archive(items: Collection<Item>)

    fun delete(item: Item) = delete(listOf(item))

    fun delete(items: Collection<Item>)

}
