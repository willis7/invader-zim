package zim.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import zim.domain.Quote
import zim.repository.QuoteRepository

/**
 * Created by willis7 on 18/02/15.
 */
class InvasionController {

    QuoteRepository repository

    /**
     * Quote
     * @param name
     * @return quote
     */
    ResponseEntity<Quote> quote(String name) {
        new ResponseEntity<Quote>(repository.findByName(name), HttpStatus.OK)
    }
}
