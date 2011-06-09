package play.modules.liftmongorecord
import play.PlayPlugin
import play.Play
import play.Logger
import com.mongodb.Mongo
import net.liftweb.mongodb.{DefaultMongoIdentifier, MongoDB}



class LiftMongoRecordPlugin extends PlayPlugin {
    override def onConfigurationRead() {
    	MongoDB.defineDb(DefaultMongoIdentifier, new Mongo, "test")
    	//Logger.info("scala probably ok")
    	//Logger.info(MongoDB.getDb(DefaultMongoIdentifier).toString);
    	}
    }
