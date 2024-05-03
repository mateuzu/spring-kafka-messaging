# spring-kafka-messaging
Repositório com exemplo básico de um sistema com arquitetura em microserviços interagindo através de mensageria assíncrona com Spring Kafka.

### Nesse exemplo: 
- Tanto o serviço de coordenação Zookeeper quanto o Kafka foram containeirizados com o Docker
- O endpoint *Producer* é responsável por enviar uma mensagem
- O endpoint *Consumer* é responsável por receber essa mensagem e salvá-la no banco de dados H2

### Tecnologias

<img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40" style="max-width: 100%;"><img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/spring/spring-original.svg" alt="spring" width="40" height="40" style="max-width: 100%;"><img src="https://github.com/devicons/devicon/blob/master/icons/apachekafka/apachekafka-original.svg" alt="kafka" width="40" height="40" style="max-width: 100%;"> <img src="https://github.com/devicons/devicon/blob/master/icons/docker/docker-plain.svg" alt="postman" width="40" height="40" style="max-width: 100%;"><img src="https://github.com/devicons/devicon/blob/master/icons/insomnia/insomnia-original.svg" alt="insomnia" width="40" height="40" style="max-width: 100%;"/>

- Java
- Spring Boot
  - Spring WEB 
  - Spring Data JPA
  - Spring Kafka
  - Spring H2 Database
- Docker
- Insomnia 
