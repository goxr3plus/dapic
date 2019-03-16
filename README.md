# dapic
Intralot Dapic


# It contains two end points

1) One that returns all available settings at (/api/settings)
2) One that returns a specific setting        (/api/settings/id)

# How to set up

Install XAMPP and start MYSQL locally and then modify the [application.properties](https://github.com/goxr3plus/dapic/blob/master/src/main/resources/application.properties)

For example i did it as shown below:

```XML
## Spring DATASOURCE (DataSourceAutoConfiguration & DataSourceProperties)
spring.datasource.url = jdbc:mysql://localhost:3306/dapic?autoReconnect=true&useUnicode=true&characterEncoding=UTF-8&allowMultiQueries=true&useSSL=false
spring.datasource.username = root
spring.datasource.password =

```
