***Overview***
The RPN calculator project serves as an exploration playground wherein a developer can learn a bit about the software 
development process in a manner that can be catered towards the developer and the development environment (company 
norms), etc.  The core algorithmic work of this project is nothing more than what is defined with 'Reverse Polish 
Notation': http://en.wikipedia.org/wiki/Reverse_Polish_notation

The task list will start small, and then will build in a fashion that conveys software development principles.

**Installation**
- All operations assume the Eclipse STS IDE (3.2+)
- File > Import ... > Git > Repositories from GitHub > (search for rpnmde) > Finish


**Requirements***
27March2013
- Create a package in src/java named com.rpnmde.service
- Create a class (named following Oracle's conventions http://www.oracle.com/technetwork/java/codeconv-138413.html)
- Division operations should have a maximum of 3 decimal places
- Develop a JUnit unit test with methods illustrating the functionality of the RPN calculator for addition, subtraction,
  multiplication, and division.    
  
**Instructor Notes**
UI: command line, swing, simple browser, ajax
Log commands / operations: Log4J, File, DB (JDBC, Spring JDBC, Groovy SQL)
Build out web UI: perform operations, view transactions from DB
Batch Operations: read from file (flat, Excel, CSV, XML), read from server (HTTP, raw sockets)
Quartz job: process asynch