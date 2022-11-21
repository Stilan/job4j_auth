проект job4j_auth

RestFull API архитектура - это архитектура клиент-серверного приложения базирующаяся на 6 принципах.

1. Универсальный интерфейс взаимодействия. (Uniform Interface)

2. Запросы без состояния. (Stateless)

3. Поддержка кеширования. (Cacheable)

4. Клиент-серверная ориентация.

5. Поддержка слоев (Layered System)

6. Возможность выполнять код на стороне клиента (Code on Demand)

Как запустить приложение через Docker Compose.(Многоэтапная сборка)

1. Сборка и запуск

docker-compose up --build

Как запустить приложение через k8s

1. Создание Secret
kubectl apply -f postgresdb-secret.yml
kubectl get secret


2. Создание ConfigMap
kubectl apply -f postgresdb-configmap.yml
kubectl get configmap

3. Создание развертывания postgresdb-deployment
kubectl apply -f postgresdb-deployment.yml
kubectl logs -l app=postgresdb
kubectl describe pod

4. Создание развертывания spring-boot-deployment
kubectl apply -f spring-deployment.yml
kubectl logs -l app=spring-boot
kubectl describe pod
minikube service spring-boot-service







