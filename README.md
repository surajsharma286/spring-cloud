# Spring Cloud Demo Project
Inspired From - in28min

## Application Flow
Following are the Services created in this project.

### Currency Exchange
Returns the Exchange rates for the Currencies. Currency exchange rates are persisted in H2.

* http://localhost:8000/currency-exchange/from/USD/to/INR


### Currency Conversion
Returns the Currency Conversion values.

* http://localhost:8100/currency-conversion/from/USD/to/INR/quantity/10
* http://localhost:8100/currency-conversion-feign/from/USD/to/INR/quantity/10

### Eureka
http://localhost:8761/
### Zipkin
http://localhost:9411/
### API GATEWAY
http://localhost:8765/currency-exchange/from/USD/to/INR
http://localhost:8765/currency-conversion/from/USD/to/INR/quantity/10
http://localhost:8765/currency-conversion-feign/from/USD/to/INR/quantity/10
http://localhost:8765/currency-conversion-new/from/USD/to/INR/quantity/10

### Docker Commands
docker-compose up