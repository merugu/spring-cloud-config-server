# spring-cloud-config-server
The project is used to have all microservices configuration in github and read those configuration dynamically based on environment(qa,dev) configured in bootstrap.properties file in appurl-service

Rest API call

http://localhost:8080/api/appurl/geturls/ 

Test the above service by modifying the spring.profiles.active value in bootstrap.properties file under appurl-service microservice.

The possible values for spring.profiles.active are 'qa' and 'dev'


