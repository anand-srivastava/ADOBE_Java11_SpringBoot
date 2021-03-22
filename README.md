# Java 11 and Spring boot


Banuprakash C

Full Stack Architect,

Co-founder Lucida Technologies Pvt Ltd.,

Corporate Trainer,

Email: 

banu@lucidatechnologies.com; 

banuprakashc@yahoo.co.in

https://www.linkedin.com/in/banu-prakash-50416019/

https://github.com/BanuPrakash/ADOBE_Java11_SpringBoot
-----------------------------------------------------------

Java 9 onwards till Java 11 features
-------------------------------------

lib.jar
	
	pkg1
	public class EmployeeService {
		uses SomeAPI
	}

	pkg2;
	public class SomeAPI {

	}


some other application:
	we can access SomeAPI becuase it's Public class

----------------
JVM contains:
java.xml
javax.corba
java.rmi
java.sql
...

Dockerfile
FROM:openjdk8:alphine

myapp.jar
import java.util.List;

public class HelloWorld {
	main() {
		List<String> ==

	}
}
==================================================================
openjdk 11
==================================================================
java --list-modules

Named Modules:
	all modules follow java 9 JPMS

Unnamed modules
automatic modules
--------------------------------

Each java project --> one module --> each project contains module-info.java
---------------------------------------------------------------------------

Java Project => multi module ==> each module has module-info.java
--------------------------------------------------------------------

jdeps  -s jackson.databind.jar
---------------------------------------------------------------------

ServiceLoader

Create a file in client: [ file name is same as fully qulafied interface name within "META-iNF/service"]

META-INF/services/com.example.CodecSet
com.example.impl.StandardCodecs    
com.example.impl.Sampleodecs  

Client code:
 private static ServiceLoader<CodecSet> codecSetLoader
     = ServiceLoader.load(CodecSet.class);
---------------------------------------------------------------------------

ServiceLoader==> Maven Multi-module project using Java 9 module system