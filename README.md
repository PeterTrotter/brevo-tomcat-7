# brevo-tomcat-7
Minimal example showing brevo's https://github.com/sendinblue/APIv3-java-library failing with tomcat 7

The following should fail:
```
mvn clean tomcat7:run-war
```

Whilst running unpacked should succeed:
```
mvn clean tomcat7:run-war
```

## NoSuchFieldError: Companion

Resultant error:
```
Sep 13, 2023 3:54:19 PM org.apache.catalina.core.StandardContext loadOnStartup
SEVERE: Servlet [brevo] in web application [] threw load() exception
java.lang.NoSuchFieldError: Companion
	at okhttp3.internal.Util.<clinit>(Util.kt:70)
	at okhttp3.OkHttpClient.<clinit>(OkHttpClient.kt:1073)
	at sendinblue.ApiClient.<init>(ApiClient.java:80)
	at sendinblue.Configuration.<clinit>(Configuration.java:18)
	at brevo.BrevoServlet.init(BrevoServlet.java:13)
	at org.apache.catalina.core.StandardWrapper.initServlet(StandardWrapper.java:1240)
	at org.apache.catalina.core.StandardWrapper.loadServlet(StandardWrapper.java:1184)
	at org.apache.catalina.core.StandardWrapper.load(StandardWrapper.java:1078)
	at org.apache.catalina.core.StandardContext.loadOnStartup(StandardContext.java:5380)
	at org.apache.catalina.core.StandardContext.startInternal(StandardContext.java:5680)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1689)
	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1679)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
```