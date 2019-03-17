# dapic
Intralot Dapic


# It contains below endpoints

1) One that returns all available settings at (/api/settings)
2) One that returns a specific setting        (/api/settings/id)
3) Call a stored database procedure named `test` (/api/setting/id)
http://localhost:9999/api/setting/0

Example Image



```java
CREATE DEFINER=`root`@`localhost` PROCEDURE `dapic`.`test` (IN id INT,OUT endingResult boolean)
DETERMINISTIC
 begin
	 SET endingResult = false;
	 if id > 0 then
      SET endingResult = true;
     END IF;
 END;
```

# How to set up

Install XAMPP and start MYSQL locally and then modify the [application.properties](https://github.com/goxr3plus/dapic/blob/master/src/main/resources/application.properties)

For example i did it as shown below:

```java
## Spring DATASOURCE (DataSourceAutoConfiguration & DataSourceProperties)
spring.datasource.url = jdbc:mysql://localhost:3306/dapic?autoReconnect=true&useUnicode=true&characterEncoding=UTF-8&allowMultiQueries=true&useSSL=false
spring.datasource.username = root
spring.datasource.password =

```
