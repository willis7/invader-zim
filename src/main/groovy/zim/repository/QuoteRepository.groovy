package zim.repository

import zim.domain.Quote

/**
 * Created by willis7 on 18/02/15.
 */
public interface QuoteRepository {
    Quote findByName(String name)
}
