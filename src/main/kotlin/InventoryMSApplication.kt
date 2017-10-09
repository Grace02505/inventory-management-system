package org.hirito.inventorymanagementsystem

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class InventoryMSApplication

fun main(args: Array<String>) {
    SpringApplication.run(InventoryMSApplication::class.java, *args)
}
