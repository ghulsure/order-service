# order-service
#Api details

GET - /order-service/api Returns string ("Getting Called by order service")

GET - /order-product Calls order-service api (http://product-service:8080/product-service/api) which returns (Service call from service 1 to service 2 --- " + val)

#To build using dockerfile command - docker build -t app .

#To run docker file command - docker run -it -p 8080:8080 app
