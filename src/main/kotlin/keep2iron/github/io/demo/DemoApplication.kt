package keep2iron.github.io.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.ServletComponentScan
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["keep2iron.github.io.demo.controller"])
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}





