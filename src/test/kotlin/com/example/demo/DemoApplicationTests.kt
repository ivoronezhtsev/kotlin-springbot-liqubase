package com.example.demo

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	lateinit var greetingController: GreetingController

	@Test
	fun name() {
		val result = greetingController.greeting("Igor")
		val text: String? = "Hi"
		val ifNotNull = text?.let { it }
		println(ifNotNull)
		assertEquals("Hello, Igor", result)
	}
}
