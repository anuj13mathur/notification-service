# notification-service
A service to send notification to different channels. This repo contains the skeleton and structure of such a service,
illustrating the LLD(low level design).

There can be multiple channels on which notifications can be sent. As of now there are three channels namely - email, slack and in app.
Each channel has its own client to do the communication with the actual provider.
Each client has two methods:
* send - sends the notification to a single or multiple users (not a predefined group)
* broadcast - sends the notification to a group/channel of multiple users (more like a cohort)

Right now, the templating is pretty straight forward. A templating engine like
Thymeleaf, Apache FreeMarker or even groovy templates can be used. The choice of templating engine
would also depend on the implementation language like in this case Java.

### Swagger documentation 
Swagger API documentation is added in file swagger.yaml, present at the root directory of this project. 
This file can be imported in https://editor.swagger.io/ to view the documentation.