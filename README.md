# address-ms1
  This ms is to store address in a virtual DB. This is a part of ms-eureka-gateway-hysrtix-cloud-config Project.
##
### Dependency
    h2,jpa,web,lombok,eureka discover client

### application.yml
    port ,app name,eureka client(same in all MS)

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
