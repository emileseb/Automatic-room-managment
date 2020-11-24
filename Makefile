.DEFAULT_GOAL := cleanrun

build: AutoManagement AlarmService PresenceManagement
	mvn -f AutoManagement/pom.xml package
	mvn -f AlarmService/pom.xml package
	mvn -f PresenceManagement/pom.xml package

run:
	java -jar PresenceManagement/target/presencemanagement-alpha.jar &
	java -jar AlarmService/target/alarmservice-alpha.jar &
	sleep 3
	java -jar AutoManagement/target/automanagement-alpha.jar

killall:
	-lsof -t -i:8001 | xargs kill
	-lsof -t -i:8002 | xargs kill

cleanrun:
	make killall
	make run

