Best principles on building RESTful services with Spring: https://spring.io/guides/tutorials/rest/

How to structure a Spring Boot project: https://docs.spring.io/spring-boot/docs/current/reference/html/using-spring-boot.html#using-boot-structuring-your-code

Startup steps:
1. From initializr - add Lombok, Web, MongoDB
2. Create PACKAGES - one each, for controller, service etc according to https://docs.spring.io/spring-boot/docs/current/reference/html/using-spring-boot.html#using-boot-structuring-your-code
3. Create interfaces for service, repo classes
4. build using command: mvn install
5. Write dockerfile and create image: https://spring.io/guides/gs/spring-boot-docker/

Important points:
1. Make sure to send the right response codes
2. For this example, mongo DB name is "dataset" and collection name is "arithmetic"
3. Immediately after importing to STS, the project structure(especially packages) might not be properly visible. Give it sometime.
4. Lombok MUST be installed(by going to the m2 folder and running the java jar file). Then, update project.