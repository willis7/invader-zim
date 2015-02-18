package zim.repository

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import zim.domain.Quote

/**
 * Created by willis7 on 18/02/15.
 */
@Repository
interface QuoteRepository extends MongoRepository<Quote, BigInteger> {
    Quote findByName(String name)
}
