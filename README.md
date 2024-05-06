 # Spring Kafka Producer Example
 
    This project is a simple example of how to use Spring Kafka Producer.

    ## How to run the project
    1. Clone the project
    2. Run the project using the command `mvn spring-boot:run`
    3. Open the browser and navigate to `http://localhost:8080/sendMessage?message=HelloWorld`
    4. Check the console to see the message being sent to the Kafka topic.

    ## Docker
    You can run the project using Docker. Just run the following command:
    ```docker-compose up```
    This will start the Kafka, Zookeeper and Kafka-UI containers and the Spring Boot application.

    