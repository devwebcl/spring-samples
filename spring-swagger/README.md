## Spring Swagger WLS Sample

From http://www.baeldung.com()

http://127.0.0.1:7001/spring-security-rest/api/swagger-ui.html#

http://127.0.0.1:7001/spring-security-rest/api/v2/api-docs

Ejemplo simple para demostrar que swagger se puede utilizar en WLS 12.1.3 al usar los siguientes ClassLoading Filtering (por conflictos con Guava):

```
  <container-descriptor>
    <prefer-web-inf-classes>false</prefer-web-inf-classes>
    <prefer-application-packages>
  		<package-name>com.google.common.*</package-name>
	</prefer-application-packages>
  </container-descriptor>
```
