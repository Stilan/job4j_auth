проект job4j_auth

RestFull API архитектура - это архитектура клиент-серверного приложения базирующаяся на 6 принципах.

1. Универсальный интерфейс взаимодействия. (Uniform Interface)

2. Запросы без состояния. (Stateless)

3. Поддержка кеширования. (Cacheable)

4. Клиент-серверная ориентация.

5. Поддержка слоев (Layered System)

6. Возможность выполнять код на стороне клиента (Code on Demand)

Как запустить приложение через Docker Compose.

1. Собираем jar

mvn install Dmaven.test.skip=true

2. Собираем образ приложения:

docker build -t auth .

3. Запускаем

docker-compose up






