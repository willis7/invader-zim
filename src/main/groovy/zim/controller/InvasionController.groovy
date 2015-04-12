package zim.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import zim.domain.Quote
import zim.exception.InvaderNotFoundException
import zim.repository.QuoteRepository

/**
 * Created by willis7 on 18/02/15.
 */
@Controller
class InvasionController {

    @Autowired
    QuoteRepository repository

    @RequestMapping("/invader/{name}")
    @ResponseBody
    ResponseEntity<Quote> quote(@PathVariable String name) {
        new ResponseEntity<Quote>(repository.findByName(name), HttpStatus.OK)
    }

    @ExceptionHandler
    ResponseEntity<String> handle(InvaderNotFoundException infe) {
        new ResponseEntity<String>(infe.message, HttpStatus.NOT_FOUND)
    }
}
