# wa-toll-samples


**Make sure you have mysql and rabbitmq running**
_If you haven't you can use the docker-compose to bring them up_

`docker-compose up -d`

For this example I'm using local maven to deploy the task:
Go to the TollTaskSample folder and run:

* Windows:
`mvnw.cmd clean package`
* On Linux/MacOS:
`./mvnw clean package`

After that you can start up the TollTaskSink project

* Windows:
`mvnw.cmd clean package`
* On Linux/MacOS:
`./mvnw clean package`


And then you can start up the TollTaskInTake project

* Windows:
`mvnw.cmd clean package`
* On Linux/MacOS:
`./mvnw clean package`


**To test you can call the task end point and pass some params**

`curl -d 'station100,FFF0001,2016-11-20T21:22:00' "http://localhost:8082/tasks"`

You can connect to your mysql and check the TASK_EXECUTION table to see your requests
