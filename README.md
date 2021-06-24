```
docker exec -it redis_1 redis-cli --cluster create 10.1.0.7:6379 10.1.0.5:6379 10.1.0.6:6379 10.1.0.3:6379 10.1.0.4:6379 10.1.0.2:6379 --cluster-replicas 1
```