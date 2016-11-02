package de.techdev.janitor

import de.techdev.pocket.api.Pocket
import org.springframework.beans.factory.annotation.Value
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class SweepTask(
        private val pocket: Pocket,
        @Value("\${pocket.item.maxage}") private val maxage: Long) {

    @Scheduled(cron = "30 2 * * * *")
    fun sweep() {
        val items = pocket.retrieveOperations().items().filter { it.age() > maxage }

        if (items.isEmpty().not()) {
            pocket.modifyOperations().archive(items)
        }
    }

}
