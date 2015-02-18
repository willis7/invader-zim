package zim

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan

/**
 * Created by willis7 on 18/02/15.
 */
@EnableAutoConfiguration
@ComponentScan("zim")
class Application {
    public static void main(String[] args) {
        new SpringApplication(Application).run(args)
    }
}
