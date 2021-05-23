# notification-service
A service to send notification to different channels

There can be multiple channels on which notifications can be sent. As of now there are three channels namely - email, slack and in app.
Each channel has its own client to do the communication with the actual provider.
Each client has two methods:
* send - sends the notification to a single or multiple users (not a predefined group)
* broadcast - sends the notification to a group/channel of multiple users (more like a cohort)