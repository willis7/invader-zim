package zim.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

/**
 * Created by willis7 on 18/02/15.
 */
class InvasionController {
    /**
     * Quote
     * @param name
     * @return quote
     */
    ResponseEntity<String> quote(String name) {
        new ResponseEntity<String>("", HttpStatus.OK)
    }
}
