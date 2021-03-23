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
-----------------------------------------------------------------------

Day 2:
------
	Java 8 +

	JPMS ==> Module System
		Why? How?
		Better encapsulation, NoClassDefError @ Runtime, Modularized, reduce footprint on JRE

		module, exports, require, uses, provides with

		single module application [ module-info.java -===> src]

		multi-module application [ jar]
			each module-info.java in seperate folder [module names] within src folder

		Named modules ==> module-info.java
		un-named modules ==> any jar present in classpath without module-info.java is treated as unnamed module [ everthying public is exposed] ==> just like any java 8 version jar
		Named modules can't acces unnamed modules 

		Automatic modules: we create named modules which in turn used automatic modules [ jars which are not modularized ( not having module-info.java ) in module path]


		Also : convert atomatic module to named module ==> gson-2.0.2.jar rename to gson.jar
		then add module-info.java 
		module gson {
			exports  ...;
		}

		javac --module-source-path src -m a,b -d out

		java --module-path out -m main/pkg.Main

		jlink ==> build application image [ not contain entire JRE, rather only required modules]
		
		--add-modules java.sql, java.logging

		java --list-modules
-----------------------------------------------------------------------------------

	Java 11 features:

	1) jshell
		is a REPL
		to test java apis

		/vars
		/methods
		/exit
		/help
		/env --class-path c:\temp\a.jar;

		/open Main.java
		/list

	2) new String methods:
		isBlank()
		strip() // trim() in java 8 and before was not aware of Unicode
		stripLeading()
		stripTrailing()
		repeat()

	3) var for type inference way of  variable declaration

		List<String> list = new ArrayList<String>();

		java 11:

		var list = new ArrayList<String>();

		unlike JavaScript "var" is static typing

		Map<String,List<Integer>> studentMap = new HashMap<String, List<Integer>>();

		var studentMap = new HashMap<String, List<Integer>>();

		// Anonymous class
		Predicate<Integer> pred = new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return false;
			}
		};
		
		// Lambda expression:
		
		Predicate<Integer> pred2 = (@NotNull Integer t) -> true;
		
		Predicate<Integer> pred3 = (@NotNull t) -> true; // error Annotations not allowed on type inference
		
		Predicate<Integer> pred4 = (@NotNull var t) -> true; // valid

	4) Diamond Operator

			// Anonymous class
				Predicate<Integer> diamond = new Predicate<>() {
					@Override
					public boolean test(Integer t) {
						return false;
					}
				};
	5) Single file compile
		java Main.java

	6) AOT -> Ahead of Time compilation
		Interpreted, JIT compiler , AOT
		limitation is works with Linux based machines [ Amazon EC2]

		Javac ==> source code to Bytecode
		Bytecode to Native code [ Intepret, JIT or AOT]

		AOT will compile bytecode to native code [ java.base]

		javac JaotCompilation.java
		jaotc --output jaotCompilation.so JaotCompilation.class
		java -XX:AOTLibrary=./jaotCompilation.so JaotCompilation
	----------------------------------------------------------------------

	7) HttpClient
	8) FlowAPI
	9) FLightRecorder and JMC
	10) EpsilonGC

	Resume after Tea break