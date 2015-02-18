package zim.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import zim.domain.Quote

/**
 * Created by willis7 on 18/02/15.
 */
class InvasionController {
    /**
     * Quote
     * @param name
     * @return quote
     */
    ResponseEntity<Quote> quote(String name) {
        new ResponseEntity<Quote>(new Quote(name: name, message: 'DOOOOOOM'), HttpStatus.OK)
    }
}
