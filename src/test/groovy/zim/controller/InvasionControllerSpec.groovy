package zim.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import spock.lang.Specification
import zim.domain.Quote
import zim.repository.QuoteRepository

/**
 * Created by willis7 on 18/02/15.
 */
class InvasionControllerSpec extends Specification {
    InvasionController controller
    QuoteRepository repository = Mock()

    void setup() {
        controller = new InvasionController(repository: repository)
    }

    def "should successfully quote invader zim"() {
        given:
        def name = 'zim'
        def message = 'DOOOOOOM'
        def quote = new Quote(name: name, message: message)

        when:
        ResponseEntity<Quote> response = controller.quote(name)

        then:
        1 * repository.findByName(name) >> quote

        and:
        response.statusCode == HttpStatus.OK
        response.body.name == name
        response.body.message == message
    }

    def "should successfully quote invader gir"() {
        given:
        def name = 'gir'
        def message = 'doomdy doomdy doomdy doom ....'
        def quote = new Quote(name: name, message: message)

        when:
        ResponseEntity<Quote> response = controller.quote(name)

        then:
        1 * repository.findByName(name) >> quote

        and:
        response.statusCode == HttpStatus.OK
        response.body.name == name
        response.body.message == message
    }
}
