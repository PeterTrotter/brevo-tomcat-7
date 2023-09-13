# brevo-tomcat-7
Minimal example showing brevo failing with tomcat 7

The following should fail:
```
mvn clean tomcat7:run-war
```

Whilst running unpacked should succeed:
```
mvn clean tomcat7:run-war
```
