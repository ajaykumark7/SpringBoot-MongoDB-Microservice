Best principles on building RESTful services with Spring and MongoDB: https://spring.io/guides/tutorials/rest/

How to structure a Spring Boot project: https://docs.spring.io/spring-boot/docs/current/reference/html/using-spring-boot.html#using-boot-structuring-your-code

Startup steps(coding):
1. From initializr - add Lombok, Web, MongoDB
2. Create PACKAGES - one each, for controller, service etc (according to https://docs.spring.io/spring-boot/docs/current/reference/html/using-spring-boot.html#using-boot-structuring-your-code)
3. Create interfaces for service, repo classes (to enable loose coupling)
4. Pass the configuration parameters through application.properties (Make sure that they accept configurable values from environmental variables, which then accepts the value from the docker-compose file)

Dockerising:
4. Write dockerfile for spring boot project: https://spring.io/guides/gs/spring-boot-docker/ 
5. When two or more containers need to be connected, use docker-compose. Write the docker-compose.yml file.
6. Build the project and create fat JAR using command: sudo mvn install (will be created inside /target folder)
7. If docker-compose accepts image instead of Dockerfile, build the docker image
7. run "docker-compose up"

Important points:
1. Make sure to send the right response codes
2. For this example, mongo DB name is "dataset" and collection name is "arithmetic"
3. Immediately after importing to STS, the project structure(especially packages) might not be properly visible. Give it sometime.
4. Lombok MUST be installed manually(by going to the m2 folder and running the java jar file). Then, update project.
5. Regarding DB, the database name is configurable through application.properties and the collection is configured through code via @Document annotation inside DTO class
