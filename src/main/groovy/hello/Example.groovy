package hello

import groovy.transform.CompileStatic
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CompileStatic
class Example {

  @RequestMapping('/')
  def index() {
    'Hello World!'
  }

}
