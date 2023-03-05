## Logging using log-back ecs

### What is ECS?
    Elastic Common Schema (ECS) defines a common set of fields for ingesting data into Elasticsearch. For more information about ECS, visit the ECS Reference Documentation.

### What is ECS logging?
    ECS loggers are plugins for your favorite logging library. They make it easy to format your logs into ECS-compatible JSON. For example:

    {"@timestamp":"2019-08-06T12:09:12.375Z", "log.level": "INFO", "message":"Tomcat started on port(s): 8080 (http) with context path ''", "service.name":"spring-petclinic","process.thread.name":"restartedMain","log.logger":"org.springframework.boot.web.embedded.tomcat.TomcatWebServer"}
    {"@timestamp":"2019-08-06T12:09:12.379Z", "log.level": "INFO", "message":"Started PetClinicApplication in 7.095 seconds (JVM running for 9.082)", "service.name":"spring-petclinic","process.thread.name":"restartedMain","log.logger":"org.springframework.samples.petclinic.PetClinicApplication"}
    {"@timestamp":"2019-08-06T14:08:40.199Z", "log.level":"DEBUG", "message":"init find form", "service.name":"spring-petclinic","process.thread.name":"http-nio-8080-exec-8","log.logger":"org.springframework.samples.petclinic.owner.OwnerController","transaction.id":"28b7fb8d5aba51f1","trace.id":"2869b25b5469590610fea49ac04af7da"}

### ECS Logback
    * Check logback-spring.xml file
    * Add maven dependency

    - Write log in json file
    - Write json log in console  
    - Write text log in console
    - Write text log in file



### Why ECS logging?
* Simplicity: no manual parsing

  * Logs arrive pre-formatted, pre-enriched and ready to add value, making problems quicker and easier to identify. No more tedious grok parsing that has to be customized for every application.

* Decently human-readable JSON structure
  
  * The first three fields are @timestamp, log.level and message. This lets you easily read the logs in a terminal without needing a tool that converts the logs to plain-text.

* Enjoy the benefits of a common schema

  * Use the Kibana Logs app without additional configuration.

  * Using a common schema across different services and teams makes it possible create reusable dashboards and avoids mapping explosions.

  * APM Log correlation
  If you are using an Elastic APM agent, you can leverage the log correlation feature without any additional configuration. This lets you jump from the Span timeline in the APM UI to the Logs app, showing only the logs which belong to the corresponding request. Vice versa, you can also jump from a log line in the Logs UI to the Span Timeline of the APM UI.
  - Please check log-back.xml file for logging in console and file(threshold, maxSize)

  - Restrict logging level through package level 

  - Write log in json or log file based upon condition 'file.write_json: true', check application.yml file

  - Add dependency for json logback and janino for condition in the logback file