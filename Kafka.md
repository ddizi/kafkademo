# 카프카 라이브러리 비교

## Kafka Clients


Kafka Clients는 Apache Kafka와 상호 작용하기 위해 사용되는 공식적인 클라이언트 라이브러리의 집합이다.

순수한 Kafka 클라이언트 라이브러리로, Spring Kafka의 추가적인 기능과 자동 구성을 활용하지 않는다.

이 라이브러리는 다양한 언어로 제공되며, 프로듀서(Producer)와 컨슈머(Consumer)와 같은 다양한 역할을 수행할 수 있다.

Java, Python, C/C++, Go, Ruby 등 다양한 언어에서 사용할 수 있으며, 각각의 언어에 대한 공식 클라이언트 라이브러리가 있다.

Kafka Clients를 사용하여 메시지를 생산하고, 메시지를 소비하며, Kafka 클러스터와 상호 작용할 수 있다.

주로 Kafka 프로듀서는 메시지를 Kafka 토픽으로 보내고, 컨슈머는 토픽에서 메시지를 읽어오는 역할을 한다.

## Spring Kafka

Spring Kafka는 Spring Framework를 기반으로 한 Apache Kafka의 간편한 통합을 제공하는 라이브러리다.

Kafka Clients를 기반으로 구축되며, Kafka를 사용하는 애플리케이션을 더 쉽게 작성할 수 있도록 도와준다.

Spring Boot와 함께 사용할 때 특히 편리한데, Spring Boot의 Autoconfiguration 기능을 통해 Kafka와의 통합에 대한 구성이 거의 없어도 바로 시작할 수 있다.

Spring Kafka는 프로듀서와 컨슈머를 쉽게 설정하고 메시지를 처리할 수 있는 다양한 기능과 유틸리티를 제공한다.

또한, Spring의 특성을 이용해 메시지 핸들러를 정의하고 Kafka 토픽과의 매핑을 간단하게 설정할 수 있다.

즉, Kafka Clients는 Apache Kafka와 통신하는 순수한 Kafka 클라이언트 라이브러리를 의미하며, 

Spring Kafka는 Spring Framework를 기반으로 Kafka를 더 쉽게 통합할 수 있도록 도와주는 라이브러리다.

참고로 Spring Bean에서 관리해주는 Spring Kafka는 어플리케이션 실행 시점에 Kafka와 연동이 정상적인지 바로 확인 가능하지만, 

Kafka Clients는 메세지 전송, 수신과 관련된 메서드를 호출해 실행하고 연동을 진행하기 때문에, 메세지 전공/수신 시점에 연동이 

정상적으로 이루어졌는지 확인할 수 있다.

## Spring Cloud Stream

- kis-channel-contract 에서 사용중
- Kafka에 종속적이지 않고 다른 메세지큐도 사용가능함. Kafka에서 래빗엠큐로 전환시 용이함.
- Spring Cloud ( Spring 기반 MSA를 만들기 위한 라이브러리) 


## 참고
- [Kafka Clinet Vs Spring kafka](https://hoehen-flug.tistory.com/42)
- [Spring Cloud Stream 공식](https://spring.io/projects/spring-cloud-stream)
