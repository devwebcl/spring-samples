# **Deploy in WLS**
1. **Deploy in WLS / Tomcat 7**

IMPORTANT! :
subscribeEvent: var notificationBaseUrl = "http://127.0.0.1:7001/sse";


mvn com.oracle.weblogic:weblogic-maven-plugin:undeploy

mvn com.oracle.weblogic:weblogic-maven-plugin:deploy

2. **Publish**:

   tomcat: http://127.0.0.1:8080/sse/events/publish <br>
   wls: http://127.0.0.1:7001/sse/events/publish

 
3. **Subscriber**
 
 Next, in a different window invoke the subscriber page url i.e. 
 
 tomcat: http://127.0.0.1:8080/sse/events/subscribe <br>
 wls: http://127.0.0.1:7001/sse/events/subscribe
 
 




