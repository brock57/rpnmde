**Overview**

The RPN calculator project serves as an exploration playground wherein a developer can learn a bit about the software 
development process in a manner that can be catered towards the developer and the development environment (company 
norms), etc.  The core algorithmic work of this project is nothing more than what is defined with 'Reverse Polish 
Notation': http://en.wikipedia.org/wiki/Reverse_Polish_notation

The task list will start small, and then will build in a fashion that conveys software development principles.

**Installation**
- All operations assume the Eclipse STS IDE (3.2+); Ensure extensions described here are in place: 
  http://www.grails.org/STS+Integration
- Setup basic Eclipse Git settings (Preferences > Git).  Most notably, setup a Default respository folder
- File > Import... > Git > Repositories from GitHub > (search for rpnmde) > (click repository) > Finish
- Takes a few seconds to pull down respository from GitHub
- File > Import... > Grails > Grails Project > (browse to your Git repository) > Finish
- Takes a few seconds to setup project synch Git respository with Eclipe
- Right click on project > Team... > Share Project... > Git > (it should detect your Git details> Finish



**Requirements**

-27March2013-
- Create a package in src/java named com.rpnmde.service
- Create a class (named following Oracle's conventions http://www.oracle.com/technetwork/java/codeconv-138413.html)
- Division operations should have a maximum of 3 decimal places
- Develop a JUnit unit test with methods illustrating the functionality of the RPN calculator for addition, subtraction,
  multiplication, and division.    


  
**Instructor Notes**
- Test Driven Development
- Build File - create a script
- Threading: Java and Groovy
- UI: command line, swing, simple browser, ajax
- Log commands / operations: Log4J, File, DB (learn to create tables - by hand and code, JDBC, Spring JDBC, Groovy SQL)
- Build out web UI: perform operations, view transactions from DB
- Batch Operations: read from file (flat, Excel, CSV, XML), read from server (HTTP, raw sockets)
- Quartz job: process asynch
- Endianness, Base64 encoding
