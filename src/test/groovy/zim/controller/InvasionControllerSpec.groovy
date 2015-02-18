package zim.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import spock.lang.Specification
import zim.domain.Quote

/**
 * Created by willis7 on 18/02/15.
 */
class InvasionControllerSpec extends Specification {
    InvasionController controller
    void setup() {
        controller = new InvasionController()
    }

    def "should successfully quote invader zim"() {
        given:
        def name = 'zim'
        def message = 'DOOOOOOM'
        def quote = new Quote(name: name, message: message)

        when:
        ResponseEntity<Quote> response = controller.quote(name)

        then:
        response.statusCode == HttpStatus.OK
        response.body.name == name
        response.body.message == message
    }
}
