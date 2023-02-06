# Spring Boot Mybatis Example
Trying sql and sql-queries logging using mybatis

#### Example:
```
22:59:25.487 [http-nio-8081-exec-1] level=DEBUG logger=c.m.demo.mapper.TodoMapper.getTodo - ==>  Preparing: Select * from todos where id = ?
22:59:25.537 [HikariPool-1 housekeeper] level=DEBUG logger=com.zaxxer.hikari.pool.HikariPool - HikariPool-1 - Pool stats (total=1, active=1, idle=0, waiting=0)
22:59:25.621 [http-nio-8081-exec-1] level=DEBUG logger=c.m.demo.mapper.TodoMapper.getTodo - ==> Parameters: 3(Integer)
```