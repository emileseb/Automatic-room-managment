# AutomaticRoomManagement

Project : Automatic management of INSA's rooms  
Part of the Software Oriented Architecture course

## Project description

You are requested to develop a Web application (Proof-of-Concept) for managing INSA's rooms . This application must
allow automatic closing windows, doors, turning on heating, turning off lights ... etc. This application relies on
software services, sensors, and actuators. The goal is to retrieve data from sensors and analyze them to enable taking
decisions. Through software services (Restful Web services), the application retrieves data of sensors (temperature,
presence, ...), and according to the values of the retrieved data, actions on actuators can be triggered. Your
application must be based on a Restful architecture. Hereafter examples of scenarios to implement.

## First scenario example

The data of the temperature sensors of a given room are retrieved periodically. If the outside temperature is lower than
the indoor temperature and the outside temperature is between 18 and 27°, the windows should be opened automatically.

## Second scenario example

About closing doors, windows and lights if the current time is outside working hours and there is nobody. However, if
there are presence activities from 22h, an alarm must be triggered.

## Asked work  :

- Design your application based on Rest architecture
- Implement the different services and services calls
- Implement a web interface for viewing the history of actions
- Language to use : Java.
- Framework to use : SpringBoot fo Rest services
- OM2M can be used for sensors and actuators based architecture.

## Port Services Allocation :

| Service     | Port        |
| ----------- | ----------- |
| Alarm       | 8001        |
| Presence    | 8002        |
| Thermometer | 8003        |
| Heater      | 8004        |

## Usage
### Compile
`make build`
### Test
`make test`
### Run
`make run`
### Kill background instances
`make killall`

## Service Spec

### Alarm

When receiving a POST request on /alarm/{duration} triggers the alarm for {duration} minutes Return a String Warning
that the alarm has been triggered

### Presence

When receiving a GET request on /presence Return a JSON boolean of the presence

### Thermometer

When receiving a GET request on /thermometer/{room} give the temperature in the asked room Two existing room : indoor ;
outdoor Return in a JSON a random value between 0 and 30°C

### Heater

When recieving a POST request on /heater/{temperature}, triggers the heater and return that the heater is ON with the expected temperature.
