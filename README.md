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

    ## Kafka UI
    You can access the Kafka UI by navigating to `http://localhost:8989/ui/clusters/local/all-topics` in your browser.
    
    ## Troubleshooting
    If you have any issues, please check the following:
    - Make sure you have Docker installed.
    - Kafaka and Zookeeper are running.
    - The Kafka-UI is running.
    - The Spring Boot application is running.
    - The Kafka topic is created.
    - if you are using Docker, make sure the containers are running.

    ## Docker의 node를 못찾는 케이스
    /etc/hosts 파일에 로컬IP와 도커의 node를 매핑해주면 된다.
    ```127.0.0.1 kafkanode```