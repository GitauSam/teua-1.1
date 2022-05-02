package com.zenza.adapters

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.zenza"])
class AdaptersApplication

fun main(args: Array<String>) {
    runApplication<AdaptersApplication>(*args)
}

