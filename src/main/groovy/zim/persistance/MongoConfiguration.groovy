package zim.persistance

import com.mongodb.Mongo
import com.mongodb.MongoClient
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.config.AbstractMongoConfiguration

/**
 * Created by willis7 on 18/02/15.
 */
@Configuration
class MongoConfiguration extends AbstractMongoConfiguration {
    @Value('${spring.data.mongodb.host}')
    String mongoHost

    @Override
    protected String getDatabaseName() {
        "invasion"
    }

    @Override
    Mongo mongo() throws Exception {
        // Instantiate new mongo driver
        new MongoClient(mongoHost)
    }
}
