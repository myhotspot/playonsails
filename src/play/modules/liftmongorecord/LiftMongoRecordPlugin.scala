package play.modules.liftmongorecord
import play.PlayPlugin
import play.Play
import play.Logger
import com.mongodb.{Mongo, MongoOptions, ServerAddress}
import net.liftweb.mongodb.{DefaultMongoIdentifier, MongoDB}



class LiftMongoRecordPlugin extends PlayPlugin {
    override def onConfigurationRead() {
    	
    	val host = Play.configuration.getProperty("mongo.host", "localhost");
    	val port =  Integer.parseInt(Play.configuration.getProperty("mongo.port", "27017"));
    	val dbname = Play.configuration.getProperty("mongo.database", "play." + Play.configuration.getProperty("application.name"))
    	val srvr = new ServerAddress(host, port)
    	val username = Play.configuration.getProperty("mongo.username", null);
    	val password= Play.configuration.getProperty("mongo.password", null);
    	val mo = new MongoOptions
    	mo.socketTimeout = Integer.parseInt(Play.configuration.getProperty("mongo.timeout", "10"));
    	if(username==null) {
    		MongoDB.defineDb(DefaultMongoIdentifier, new Mongo(srvr, mo), dbname)
    	} else {
    		MongoDB.defineDbAuth(DefaultMongoIdentifier, new Mongo(srvr, mo), dbname, username, password)
    	}
    	
    	//Logger.info("scala probably ok")
    	//Logger.info(MongoDB.getDb(DefaultMongoIdentifier).toString);
    	}
    }
