# InfoSys Study Guide

**Structure of JVM**

- **JVM** - Java Virtual Machine =\&gt; Runs your code (runs the compiled bytecode) in a virtual environment that is the same across devices.
  - **JIT** - Just-In-Time Compiler =\&gt; Turns Bytecode into machine code essentially line by line.

**Final, finally, finalize**

- **Final** : three implementations &quot;unchangeable&quot;
  - Final class: No subclasses can extend from this class.
  - Final method: Can&#39;t be overridden
  - Final variable: Can&#39;t be modified after initialization.
- **Finally** is used in a try/catch block which handles exceptions/errors. It will always run no matter if an exception/error is caught or not.
- **Finalize** is a method that will be run immediately before an object is removed from memory (i.e. garbage collected). (+)Allows for last minute methods or closes in order to not take up memory.

**Purpose of static keyword**
- Non-access modifier; used for methods/variables that you plan to use multiple times throughout your program and wish to keep the same
- Example: Used for variables you wish to stay constant throughout all the instances you make of a class

**Functional interface**

- Has one abstract method that allows you to use Lambda expressions and a number of default methods.

**Lambda expression**

- These allow you to make single use of anonymous methods.

**String**

- Its an object over a primitive, and it&#39;s similar to an array of characters
- They are immutable so if you change something in a string it creates a new string in the string pool. Unless you state new String then it will be in the heap.

**Stack vs heap**

**Heap –**

- JRE uses it to allocate memory for objects, primitives, and JRE classes.
- Garbage collection is done on heap memory
- Objects created on heap are accessible globally.
- dynamic

**Stack –**

- Short term references like the current thread of execution
- References to heap objects are stored in stack
- When a method is called, a new memory block is created. Once the method gets executed, the block is used by the next program.
- Where the application flow happens. A new thread creates a new set of instructions that can run simultaneously with the original thread
- LIFO

Stack memory size is smaller compared to heap memory.

Static Memory Allocation (Stack) is done before program execution. Dynamic Memory Allocation (Heap) is done during program execution. In static memory allocation, once the memory is allocated, the memory size can not change. In dynamic memory allocation, when memory is allocated the memory size can be changed.

**How to create a thread**
- Extend the Thread class and override the run method
- Implement the Runnable interface and override the run method

**Abstract Class vs. Interface**

- Abstract Class: can have abstract and concrete methods; can have a constructor
- Interface: only have public and abstract methods; can't have a constructor; also thanks to Java 8, has default methods(used for backwards compatibility)

**Singleton Class How do you make one.**

The way we achieve this is have:

- a private constructor
- a private static field that will hold the instance of the class&#39;s object
- a public method that will instantiate the object if none exists and return it, or, if one already exists, return the previously instantiated object.


**Check vs Uncheck**
- **Checked ("compile time")** Exceptions are so predictable that the compiler checks to ensure that we have accounted for them. If we have not, the Java compiler will refuse to compile our code.
  - FileNotFoundException (I/O exception)

- **Unchecked(Runtime)** exceptions are exceptions that are not checked for by the compiler.
  - NullPointerException
  - ArrayIndexOutOfBounds


**Can you use multiple catch in a try catch block**
- Yes, you can use multiple catch blocks in a try catch statement if it&#39;s from most specific to generic.

**Whats a Class Loader**
- Java Class Loader is a part of the Java Runtime Environment that dynamically loads Java classes into the Java Virtual Machine.

**Garbage Collection**
- Cannot call the garbage collector in Java you can suggest by using ```System.gc()``` however, it does not mean it will trigger garbage collection. Ultimately garbage collection removes objects from memory that no longer have any reference variable pointing to them.

**Query Param vs. Path Param**
- Query Param: optional parameter that&#39;s used to define the scope of your search
- Path Param: variable part of the URI that indicates what you&#39;re searching for

**Is the DateAndTime API immutable and has no setters? choose yes or no and explain your answer**
- Yes; to make it thread safe

**Comparable vs Comparator**
- Comparable is used for objects that have a &quot;natural&quot; or default sorting method.
- Comparable is implemented by the class directly and provides the
  - &quot; compareTo() &quot; method.
  - It takes in an object of the same type as the generic as a single parameter and returns an int based on how it should be sorted in comparison to that object.
    - 0 = the objects are equal
    - -i = the object is &quot;smaller&quot;
    - +i = the object is &quot;larger&quot;
- Comparator (functional interface) is used to provide multiple sorting methods for objects that will need to be sorted in multiple ways. The Comparator interface is implemented by a separate class. This class then implements "compare() " method.

**Wrapper Classes**
- convert primitive data types into objects.

**Iterator vs List-Iterator**
- Iterator – iterates over a collection any type of collection (List, Set, Queue), unidirectional
- List-Iterator- can only iterate over a list and is bidirectional this iterator is an extension of the iterator.
  - Can add and modify elements of the collection

**Arrays and Collections (Why is array not in the CollectionsAPI)**
- Arrays are not part of the collections API because they are immutable


### **Collections:**

- The collections API is a group of data structures in an inheritance hierarchy. It exists in the java.util package.
![](http://spiroprojects.com/webadmin/uploads/java-collection-hierarchy.png)

**Differences between all collection interfaces and classes**

- **List(Interface)** : Lists are data structures that are ordered, they preserve the order of insertion, duplicates are allowed, and elements are accessed by their index which starts at 0.
  - **ArrayList (class)**: It contains an array within it, but can resize that array dynamically to accept new values. Not Synchronized

  - **LinkedList (class)**: this implements both List and Queue so it has all the methods from both interfaces. It is composed of nodes that do not necessarily have to sit next to each other in memory.
  - **Vector(class)**: This is a List that is essentially a thread-safe arraylist. Synchronized
  - **Stack (class)**: This is a Last-In-First-Out (LIFO) data structure. It is an older implementation of a LIFO structure and has been replaced with the ArrayDeque. Double ended queue(can pull from each end).

- **Set(Interface)**: Not index driven, only allows unique elements, generally does not preserve the order of insertion.

  - **HashSet(class)**: backed by a hashmap, guarantees no ordering when iterating (going through each element) through the set. Allows a single null value. Fast insertion and traversal but is impossible to find a value based on index.
  - **TreeSet(class)** : Does maintain the order of the elements (sorted). This means that insertion and removal of elements is slower because ordering must be upheld. No null values since they can&#39;t be ordered.
- **Queue (Interface)**: A data structure used when elements should be added and removed in a specific order. Unless specified elements are ordered in First-In-First-Out (FIFO) order.
  - **ArrayDeque (class)**: (Deque is pronounced like &quot;deck&quot; but stands for double ended queue) It stores elements in a resizable array internally.
    - Methods:
      - pop(): functions like a Stack (FILO);
      - push(): adds to the front of the ArrayDeque (used like a stack).
      - peekFirst() - returns the first element but does not remove it.
      - peekLast() - returns but does not remove the last element.
      - pollFirst() - returns the first element and removes it from the
      - deque.
      - pollLast() returns the last element and removes it from the deque.
      - addFirst() - adds the element to the front of the ArrayDeque
      - addLast() - adds the element to the back of the ArrayDeque.


  **If you have an ArrayList and you want to reverse it how would I do it using an CollectionsAPI**

  - ```reverse()```

  **How would you sort an ArrayList in the CollectionsAPI.**
  - You would use the ```sort()``` to get it in ascending order then reverse() to get it descending

  **How to make collections in Java thread safe**
  - Using the synchronizedCollection() method

##[**HashMap vs. TreeMap vs. HashTable**](https://www.w3spoint.com/hashmaplinkedhashmap-treemap-hashtable-java)

**LinkedHashMap vs LinkedHashSet**
![](https://www.w3spoint.com/wp-content/uploads/2018/04/Pasted-into-what-is-the-difference-between-hashmap-and-treemap-in-java.png)

-  [**LinkedHashMap**](https://www.geeksforgeeks.org/linkedhashmap-class-java-examples/) is just like [HashMap](https://www.geeksforgeeks.org/java-util-hashmap-in-java-with-examples/) with an additional feature of maintaining an order of elements inserted into it. HashMap provided the advantage of quick insertion, search, and deletion but it never maintained the track and order of insertion which the LinkedHashMap provides where the elements can be accessed in their insertion order.
-  [**LinkedHashSet**](https://www.geeksforgeeks.org/linkedhashset-in-java-with-examples/) is an ordered version of [HashSet](https://www.geeksforgeeks.org/hashset-in-java/) that maintains a [doubly-linked List](https://www.geeksforgeeks.org/doubly-linked-list/) across all elements. LinkedHashSet lets us iterate through the elements in the order in which they were inserted.



**Priority Queue vs TreeSet**

- **Priority Queue** – Under the queue interface which does not allow null values to be stored, does not focus on order but the head will always return largest or smallest element, Allows duplicate elements
- **TreeSet** - Order matters and is sorted and allows you to access these indexes in sorted order. Does not allow duplicate elements


##SQL
**HAVING, GROUP BY, ORDER BY**

- **ORDER BY** : Takes your queries return and sorts it.
- **GROUP BY** : This divides the rows on the select statement and groups it so it can be ordered later.
- **HAVING** : Specify a search condition for a group or aggregate result. Often used with GROUP BY

**Outer join**
- OUTER JOIN Returns relations that have no match in the other relation

**View all employees from employee table**

```sql
SELECT * FROM employee
```

**What's the Query would Delete the Table?**
```sql
DROP TABLE table_name CASCADE
```

**How do you get a top 10 salaries from a table.**
```sql
SELECT saleries FROM employees
ORDER BY saleries
LIMIT 10;
```

**Selecting only unique items from a specific column in a table**
```sql
SELECT DISTINCT column_name FROM table_name;
```

**How would you format a One to Many relationship vs Many to Many**
- One to Many - An individual record in one table can be associated with multiple records in a different table.
- Many to Many - you would want to have a join table which house your FKs for your tables and records in both tables are associated with multiple records in the other.

**Modulus(%) as Wildcard Character in SQL**
- Represents zero or more characters in a SQL query; used with the LIKE keyword
- Finds all names starting with b
```sql
SELECT * FROM Employees
WHERE first_name LIKE 'b%';
```

**SQL Injection**
- SQL Injection is when a bad-actor enters SQL code instead of a normal input in order to mess with your database

**What is the purpose of Cascading?**
- To maintain referential integrity

**What is a wildcard character?**
- Wildcard character: used to substitute one or more characters in a string

**What is the &#39;?&#39; wildcard?**
- Used to represent values in a PreparedStatement in JDBC


## Spring
**Spring Module**

Required Modules:

- **Core** : Core functionality of spring. Contains the BeanFactory interface which is
one of the IoC containers you can choose from.
**IoC**
- Takes some part of control of the program away from the programmer and gives it to the Framework.
- **Beans** : Bean configuration and functionality.
- **Context** : Provides the ApplicationContext interface which is the other IoC container. It is a child of the BeanFactory

**Spring Annotations:**
Annotation driven (Stereotype Annotations)
- **@Component** - General/Generic (No relation to Angular)
- **@Repository** - DAO/Repository layer classes
- **@Service** - Service classes
- **@Controller** - Controller (MVC) classes.

**@Qualifier**
- can be used to differentiate between Beans of the same type (class/interface) doing so however is poor practice and refactoring to remove the conflict is preferred.

**Bean Scope:**

**Universal:**
- Singleton (default) : There will only ever be one instance of the Bean with the Bean&#39;s class at one time.
- Prototype : A new Bean is instantiated each time a Bean is called for. So that the beans are not overridden

**WebAware:** ( how are these used??? )
- Request : One Bean of a class for each HTTP request that calls it.
- Session : One Bean for each HTTP session.
- Application (Spring5) : One per ServletContext.
- Websocket (Spring5) : One per Websocket. (We will not cover)

**Depreciated:**
- Global Session: was used for portlets (Also something we won&#39;t cover)

**Difference between BeanFactory and ApplicationContext**
- BeanFactory: Older version of Spring Container; lazily instantiates beans; requires a resource object configuration to be instantiated
- ApplicationContext: Newer version; eagerly instantiates beans; provides support for annotations; sub-interface of BeanFactory

**@Autowired**
- Is Spring specific and located above where dependency injection would take place.
  - Automagically&quot; determines the dependencies for you and provides them.
  - **XML:**
    - byType: Setter Injection based on the Bean&#39;s class or interface.
    - byName: Setter Injection based on the Bean&#39;s name registered with the IoC Container.
    - Constructor: uses constructor injection.
  - **Annotations** :

**@RestController vs. @Controller**
  - @Controller: Stereotype Annotation
  - @RestController: combination of @Controller and @ResponseBody

**Type out @RequestMapping and its usage**
  - @RequestMapping(value=&quot;/login&quot;)
  - It&#39;s used as an annotation in SpringMVC to specify the path needed for requests to go to a specific controller and typically put above the class declaration. It&#39;s also typically used along with @GetMapping/@PostMapping/etc, for more specific types of requests.

**Two main bullet points Spring, Spring MVC, Spring Boot**
- **Spring**
  - Spring can be the framework, projects, or beans
  - Lightweight framework
- **Spring MVC**
  - abstracts away Servlets and provides tools for using the Model-View-Controller design pattern
  - DispatcherServlet : This is SpringMVC&#39;s front controller.
- **Spring Boot**
  - Less boiler plate code
  - Spring Boot is used to create stand-alone, production-grade, Spring based applications you can&quot;just run.&quot;
  - Opinionated because it tells you how and application should be set up



## Spring Boot
  **Spring Boot**
  - Spring Boot is a Spring Project
  - Spring Boot is used to create stand-alone, production-grade, Spring based applications you can &quot;just run.&quot;
  - Spring Boot is opinionated: it makes decisions about how an application should be set up (the default configurations) so you can get it up and running with nearly just a push of a button.
  - Spring Boot has the mindset of Convention Over Configuration: This means that it is designed to work with the standard industry conventions , and as long as you follow those conventions it can abstract away configuration. Example DAOs use findById etc.

  **Actuator**
  Spring Boot Actuator is a sub-project of the Spring Boot Framework. It includes a number of additional features that help us to monitor and manage the Spring Boot application. It contains the actuator endpoints (the place where the resources live). We can use HTTP and JMX endpoints to manage and monitor the Spring Boot application. If we want to get production-ready features in an application, we should use the Spring Boot actuator.


## Microservices
**Microservice and benefits.**

- **Fault Isolation** - if a service crashes generally the rest of the application can continue.
  - Single responsibility
- Microservices are platform and language independent.

- **Dynamic Scalability** - easily scale up or down single services instead of the whole application.
- Developers can develop and deploy applications independently of each other.
- Takes full advantage of containerization for quick deployment and scaling of the application.

**Why do you use Zuul?**
- You use Zuul to handle all of the requests coming into the application and send them to the right service.

**API Gateway? Eureka?**
- API Gateway: service that sits between the client and the rest of your backend services; takes all requests and directs them to the correct service
- Eureka: service discovery agent; will have a service registry maintaining all f the locations of the services


## HTTP

**POST vs. PUT**
- POST: adds new information
- PUT: updates a complete resource

**What does Restful mean for an application.**

- **Client-server architecture** : Separates user interface from data storage allowing for portability across multiple platforms.
- **Stateless** : Each request from the client to the server must contain all information necessary for the server to understand and complete the request. The server does not store any context(session) information about the client. Client stores it and sends it each time @ each request
- **Cacheable** - Because responses are resources at particular endpoints, those resources should be cacheable so we can reduce repeat requests to the server.
- **Uniform Interface** - The system architecture should be designed in a way that make s finding resources highly logical. URIs should proceed from the general to the collective to the specific resources. For example:
  - www.mycars.com/cars - Returns a resource that is all the cars in the database.
  - www.mycars.com/cars/sportcars - Return all cars that are sports in the database
  - www.mycars.com/cars/sportcars/1 - Returns a single car that is the first sportscar in the database.
- **Layered System** - The server should be designed in a layered fashion so that the client is not aware of how the server is designed beyond the layer that interacts directly with requests .
- **(Optional) Code on demand** - This allows client functionality to be expanded by downloading and executing code in the form of applets or scripts to use with the resources. This is not particularly well defined or agreed upon by the software development community at large.

**Soap vs Rest**

![](https://3.bp.blogspot.com/-Wha7T5RCRVs/W0Qw-Rf-RNI/AAAAAAAACvo/97bYNufKKUYRR5iIl2RVwNM7lizS5WzFgCLcBGAs/s1600/soap-vs-rest.PNG)

**HTTP Error Codes**

- **100s level: Informational**
  - 101: Switching protocols
- **200s: Success!**
  - 200 - OK
  - 201 - Created
  - 202 - Accepted
  - 204 - No Content
- **300s: Redirects**
  - 300 - Multiple Choices More than 1 response; need to distinguish choice
  - 301 - Moved Permanently
  - 307 - Temporary Redirect
- **400s: Client-Side Errors**
  - 400 - Bad Request
  - 401 - Unauthorized
  - 403 – Forbidden
  - 404 - Not Found
  - 418 - I&#39;m a teapot (not a coffee maker) - indicates request is trying to do something the application is not designed to do.
  - 420 - Enhance your Calm chill bro requesting too much too fast
- **500s: Server-side errors**
  - 500 - Internal server error response not generated
  - 501 - Not implemented
  - 502 - Bad gateway
  - 504 - Gateway timeout took too long to process request

















##Hibernate/JPA
**Benefits of Hibernate**

- Handles a lot of the querying
- Easier to make changes to the DB
- Knows by annotations what you are trying to adjust.

**JPA:**

- Java Persistence API which is Java&#39;s standard for ORMs.
- The JPA is defined and contained in the javax.persistence package and it uses the EntityManager interface to create, read, and delete mapped entities in the database.
- For our purposes, we need to know that our annotations are standardized by the JPA (e.g. @Entity will come from javax.persistence) but their implementation is done with Hibernate.

**How to connect Hibernate**

- application.properties when using Spring
- hibernate.cfg.xml if not using Spring

**Hibernate vs. JDBC**

- JDBC especially in larger applications can become incredibly complex.
- If we need to change our database dialect we would likely need to edit a significant amount of our JDBC statements for syntax reasons. Hibernate can do this for us.
  - Hibernate converts based on dialect
- In JDBC we have to convert ResultSets manually to our POJOs, Hibernate will do that for us.
- JDBC requires the developer to have specific knowledge of the database (table and column names) while Hibernate does not.
- Hibernate also has caching mechanisms to reduce calls to the database. So it saves results that have occurred and if it repeats calls it will return result that is in the cache but also persists changes

**Sessions Thread Safe:**

- Yes, Hibernate Sessions are thread safe because sessions factory can only produce 1 thread at a time. It also depends on how you are creating the session. openSession() is not thread safe, getCurrentSession() is thread safe.

**Session vs. SessionFactory**

- SessionFactory: creates the sessions; one instance per app
- Session: establishes connections to the database; one instance per transaction

**Lazy vs. Eager in Hibernate**
- Lazy: gives a proxy object instead of going to the database until your code actually calls for the object; only works while the object is persistent; once it becomes detached there is no longer a Session to replace the proxy.
- Eager: returns the dependent object immediately with no proxy. This is generally safer

##Agile
**Agile methodology:**
What would be the process if the user stories change?

- **Product Owner** : usually the client or someone who acts as the point of contact for the client.
  - They prioritize product backlog and when the sprint should finish and release.
- **Scrum Master** : Facilitator to scrum development team
  - Clarifies questions, organizes the team, focuses on return on investment.
- **Scrum Development Team** : This is the development and the Quality Assurance(QA) team.
  - They decided effort estimation. (How much can get done in a sprint)
- **Scrum Team** : Product owner + BAs+Developers+QA usually a total size of 5-9 people.

- requirements and solutions evolve through the collaboration of &quot;cross-functional&quot; teams
  - Individuals and interactions over processes and tools. ( people\&gt;process )
  - Working software over comprehensive documentation. ( working \&gt;comprehension )
  - Customer collaboration over contract negotiation. ( collaboration\&gt;negotiation )
  - Responding to change over following the plan. ( reactive vs. proactive ?, flexible vs strict )


##AWS
**AWS experience**
- **RDS** - Relational Database Service: Creates a virtual, scalable, Relational Database.
  - Creates the environment to host the database
  - Has support for many types of relational databases. (PostgreSQL, Oracle DB, MySQL)
- **EC2** - Elastic Compute Cloud: Virtual computer/server.
  - Can run an application that is not local (where local computer uses local internet that can be unreliable )
- **ELB** - **Elastic Load Balancing** : Gateway service, it will distribute incoming traffic across multiple instances of your application. So that there is less traffic throughout
  - Configurable to decide how many instances it distributes to
- **Security Groups** : These function like a firewall for instances (EC2, RDS etc) restricting traffic by IP, protocol or port.
## Linux
**Linux experience**
- pwd - (present working directory) will show the path of the current directory you are in.
- cd - change directory, will move us into another directory.
Note "cd" by itself will move us into the home directory. And "cd .." will move up a
single directory.
- ls - lists the contents of the directory.
- ps – shows which processes are running


##Coding Challenges

**Bubble Sort**

```java
void bubbleSort(int arr[])

    {

        int n = arr.length;

        for (int i = 0; i \&lt; n-1; i++)

            for (int j = 0; j \&lt; n-i-1; j++)

                if (arr[j] \&gt; arr[j+1])

                {

                    // swap arr[j+1] and arr[j]

                    int temp = arr[j];

                    arr[j] = arr[j+1];

                    arr[j+1] = temp;

                }

    }

    /* Prints the array */

    void printArray(int arr[])

    {

        int n = arr.length; 65

        for (int i=0; i < n; ++i)

            System.out.print(arr[i] + " ");

        System.out.println();

    }
```    

**Write a program to check if a number is prime.**

```java
boolean swap = false;

for(int i = 2; i <= num/2; ++i){

  if(num % i == 0){
    swap=true;
    break;
  }

}

if(swap != true){
  System.out.println(num + "is prime.");
}else{
  System.out.println(num + "is not prime.");
```

**Reverse a String**


```java
class ReverseString {

    public static void main(String[] args)

    {

        String input = "Hello";

        char[] try1 = input.toCharArray();

        for (int i = try1.length - 1; i >= 0; i--)

            System.out.print(try1[i]);

    }

}
```
**Factorial**

```java
static int factorial(int n)

    {

        int res = 1, i;

        for (i=2; i<=n; i++)

            res *= i;

        return res;

    }

    // Driver method

    public static void main(String[] args)

    {

        int num = 5;

        System.out.println("Factorial of "+ num + " is " + factorial(5));

    }
```


**How to swap values of variables without using temp assignment**

- int number1=10;
- Int number2=20;
- number1 = number1 + number2; // number1 is now 30
- number2 = number1 - number2; // number2 is now 10(number1)
- number1 = number1 - number2; // number1 is now 20(number2)

**Using Temp**

int temp = 0;

temp = number1;

number1 = number2;

number2 = temp;



**3 Types Directives:**
- **Component Directive** : directs angular on how to process instantiate and use components at runtime.

- **Structural Directives** : These will change the structure of the DOM elements.
They generally are declared with an &quot;\*&quot; before the &quot;ng&quot;.
  - Eg \*ngFor, \*ngIf
- **Attribute Directives** : Used to change the look or behavior of an element.
  - Eg ngModel used to change behavior , ngStyle

**Decorator in Angular**
- Like an annotation in Java; provides additional functionality

**What is @Selector used for?**
- Used on a parameter of an @Endpoint method to indicate that the parameter is used to select a subset of the endpoint&#39;s data

**Two types of building up forms in Angular**
- Template driven form-built out in HTML
- Reactive form-built out in TS(TypeScript)


**What are some disadvantages of Angular?**

**Can Angular be multipage?**

**What is Angular?**

**What is Multithreading?**

**What is Webservices?**

**Why is SOAP and REST so popular?**

**What is the benefits of Junit testing?**

**Notify()**

**Data vs Information?**

**What does lightweight program mean?**
