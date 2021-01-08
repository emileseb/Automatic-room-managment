.DEFAULT_GOAL := run

build: AutoManagement AlarmService PresenceManagement ThermometerService webinterface
	mvn compile
	npm install --prefix ./webinterface


test:
	mvn test


killall:
	-lsof -t -i:8001 | xargs kill
	-lsof -t -i:8002 | xargs kill
	-lsof -t -i:8003 | xargs kill
	-lsof -t -i:8004 | xargs kill
	-lsof -t -i:3000 | xargs kill


run:
	make killall
	mvn spring-boot:run -f AlarmService/pom.xml &
	mvn spring-boot:run -f HeaterService/pom.xml &
	mvn spring-boot:run -f PresenceManagement/pom.xml &
	mvn spring-boot:run -f ThermometerService/pom.xml &
	mvn spring-boot:run -f AutoManagement/pom.xml &
	npm run --prefix ./webinterface start
