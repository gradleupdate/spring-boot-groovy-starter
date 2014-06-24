import org.springframework.boot.*
import org.springframework.boot.autoconfigure.*
import org.springframework.stereotype.*
import org.springframework.web.bind.annotation.*

@RestController
@groovy.transform.CompileStatic
class Example {
  @RequestMapping("/")
  String home() {
    "Hello World!"
  }
}

