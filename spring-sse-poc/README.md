# **Simple Sample for Spring Server-Sent Events (SSE)**
1. **Deploy in WLS (or Tomcat)**

This is the sample found at http://javaandspring.blogspot.cl/2015/11/server-sent-events-in-spring-42.html

IMPORTANT! :
change the following snippet code in the front-end depending on the webcontainer used:
subscribeEvent: `var notificationBaseUrl = "http://127.0.0.1:7001/sse";`

Maven WebLogic deployment:
`mvn com.oracle.weblogic:weblogic-maven-plugin:undeploy`

`mvn com.oracle.weblogic:weblogic-maven-plugin:deploy`

2. **Publish**:

   tomcat: [http://127.0.0.1:8080/sse/events/publish]() <br>
   wls: [http://127.0.0.1:7001/sse/events/publish]()

 
3. **Subscriber**
 
 Next, in a different window invoke the subscriber page url i.e. 
 
 tomcat: [http://127.0.0.1:8080/sse/events/subscribe]() <br>
 wls: [http://127.0.0.1:7001/sse/events/subscribe]()
 
 




