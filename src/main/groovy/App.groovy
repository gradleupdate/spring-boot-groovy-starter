import org.springframework.boot.*
import org.springframework.boot.autoconfigure.*
import org.springframework.stereotype.*
import org.springframework.web.bind.annotation.*

@RestController
@EnableAutoConfiguration
@groovy.transform.CompileStatic
class App {
  static void main(String[] args) {
    SpringApplication.run(App, args)
  }
}
