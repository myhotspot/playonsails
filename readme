Play on sails.
This project allows you to using lift-mongo-record models with play framework

adding module to play project:

1. git clone https://github.com/reflow/playonsails
2. add play dependencies:
- playonsails -> playonsails
    
repositories: 
    - LocalModules: 
        type:       local 
        artifact:   "/path/to/module/playonsails"  
        contains: 
            - playonsails-> *
3. setting up configuration parameters into  /playproject/application.conf:
mongo.host (localhost by default)
mongo.port (27017 by default)
mongo.timeout (in seconds, 10 by default)

mongo.username (optional, null by default)
mongo.password (optional, null by default)
