package zim.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
 * Created by willis7 on 18/02/15.
 */
@Document
class Quote {
    @Id BigInteger id
    String name
    String message
}
