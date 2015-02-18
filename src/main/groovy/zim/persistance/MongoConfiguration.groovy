package zim.persistance

import com.mongodb.Mongo
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.config.AbstractMongoConfiguration

/**
 * Created by willis7 on 18/02/15.
 */
@Configuration
class MongoConfiguration extends AbstractMongoConfiguration {
    @Override
    protected String getDatabaseName() {
        "invasion"
    }

    @Override
    Mongo mongo() throws Exception {
        // Instantiate new mongo driver
        new Mongo()
    }
}
