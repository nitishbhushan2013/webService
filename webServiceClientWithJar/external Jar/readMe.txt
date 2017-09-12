Below command was used to generate the jar file using wsimport command and providing the wsdl url. 

wsimport -keep -clientjar -s src helloService.jar http://localhost:9091/ws/helloService?wsdl
