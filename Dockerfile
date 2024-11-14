FROM eclipse-temurin:17
COPY target/jenkinautomation.jar jenkinautomation.jar 
CMD [ "java", "-jar","jenkinautomation.jar"]