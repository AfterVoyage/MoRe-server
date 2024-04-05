package com.more

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MoReServerApplication

fun main(args: Array<String>) {
	runApplication<MoReServerApplication>(*args)
}
