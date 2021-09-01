# address-ms1
  This ms is to store address in a virtual DB. This is a part of [ms-eureka-gateway-hysrtix-cloud-config Project](https://github.com/tsmahur/ms-eureka-gateway-hysrtix-cloud-config).
  It will load yml properties from [configurations-server](https://github.com/tsmahur/configurations-server)
##
### Dependency
    h2,jpa,web,lombok,eureka discover client, spring-cloud-starter-config
	zipkin , sleuth
    
### application.yml
    port ,app name,eureka client(same in all MS)
    config:import: optional:configserver:http://localhost:8094
	zipkin:base-url: http://localhost:9411/

### main application class
    @EnableEurekaClient

### EndPoints
    POST http://localhost:8091/address/
    {
        "city": "Noida",
        "state": "Up",
        "pinCode": 1233456
    }

    GET http://localhost:8091/address/1
