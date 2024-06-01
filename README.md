## Run Container
```bash
docker-compose -f docker-compose.yml up -d
```

### Access Redis
```bash
docker exec -it redis-lab redis-cli
```

### Remove Resource
```bash
docker-compose -f docker-compose.yml down -v
```
