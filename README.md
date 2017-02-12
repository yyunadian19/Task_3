# Task_3 - 2017
## Exercise on Class Relationship
> This exercise is intended to allow students to practice basic Class Relationship
<br> Aggregation and Composition

There are 2 Exercises that you have to complete individually<br>
write down your identity (Name, Student ID, Class) on the top of each file

---
# Exercise 1
## Task 3 - Exercise 1 - 2017

### Write Java Program as described in Class Diagram below<br>
![Class Diagram Exercise 1] (/exercise1.JPG) <br>

* **Class Application.java**
 * Constructor initialize application name and size (MB)
 * Method ```toString() : String``` 
    returns String that contains application name and application size <br>
    example : ```"Application name: App_1, with size: 3MB"``` <br>
   
* **Class AppStore.java**
 * method ```createNewApp( appName, appSize ) ``` 
    **instantiate** new Application object and insert it in array appList
 * method ```getApp( id ) : Application ``` 
    returns Application object from array appList with array index = id
 * Method ```toString() : String``` 
    returns String that contains the number of Application available<br>
    example : ```"There are 5 applications ready to install"``` <br>
	
* **Class SmartPhone.java**
 * method ```addApplication( appStore , appId ) ``` 
    get an Application object from array appList of an appStore with array index = appId<br>
	an Application can be installed if Application size < remaining memory size
 * method ```getRemainingSize() : int```
    returns the remaining memory size of the smart phone
 * Method ```toString() : String``` 
    returns String that contains the smart phone total memory size, number of application installed, and remaining memory size <br>
    example : ```"memory size 100MB, 5 application installed, remaining memory size: 60MB"``` <br>

### Write a Driver.java class (**Main class**) to test these scenarios<br> (**Scenario Testing**)
* **instantiate** 1 AppStore object _aps_<br>
	example : ```AppStore aps = new AppStore(); ```
* _create_ 4 new Applications within the App Store _aps_, with app name = app1, app2, app3, and app4; and app size 100, 200, 300, and 400<br>
	example : ```aps.createNewApp( "app1" , 100 ); ```
* display the status of App Store _aps_<br>
	example : ```System.out.println( aps );```
* display the status of one of application available on App Store _aps_<br>
	example : ```System.out.println( aps.getApp( 2 ) );```
* **instantiate** 1 SmartPhone object _sm_, set the memory size 300<br>
	example : <br>
        ```SmartPhone sm = new SmartPhone();```<br>
        ```sm.setMemory(300);```
* display the status of SmartPhone _sm_<br>
	example : ```System.out.println( sm ); ```
* _install_ applications (in sequence) app1, app3, and app2 in SmartPhone _sm_<br>
	example : ```sm.addApplication( aps, app1 ); ```
* display the status of SmartPhone _sm_ after **each** installation<br>

### Try another scenario case on your own


---
# Exercise 2
## Task 3 - Exercise 2 - 2017
# 

### Write Java Program as described in Class Diagram below<br>
![Class Diagram Exercise 2] (/exercise2.JPG) <br>

* **Class Member.java**
 * Create 2 Constructors : initialize name, and initialize name and specialization
 * Method ```toString() : String``` 
    returns String that contains member name, specialization, and number of project worked <br>
    example : ```"Member Alex specialized in Java Programming and already worked on 5 projec(s)"``` <br>
   
* **Class Project.java**
 * Constructor **initialize** project name, **instantiate** array member with size of [5],<br> and set release status = false
 * method ```addMember( m : Member ) ``` 
    add an object Member _m_ into array team member<br>
	increment integer nTeam+1
 * method ```releaseApp()``` 
    set release status = true
 * Method ```toString() : String``` 
    returns String that contains Project name, number of team member, and release status<br>
    example : ```"Project Exodus status is in progress with team member of 4"``` <br>
	
* **Class StartUp.java**
 * method ```addMember( m : Member ) ``` 
    add an object Member _m_ into array member<br>
	increment integer nMember+1
 * method ```getMember( id : int ) : Member``` 
    returns Member object from array member with array index = id
 * method ```createNewProject( projectName : String ) ``` 
    **instantiate** new Project object and insert it in array projectList<br>
	increment integer nProject+1
 * method ```getProject( id : int ) : Project``` 
    returns Project object from array projectList with array index = id
 * method ```releaseProject( p : Project )```
	set release status of object Project _p_ by invoking method releaseApp()
 * method ```getNumReleasedProject() : int```
	returns number of project with status is released

### Write a Driver.java class (**Main class**) to test these scenarios<br> (**Scenario Testing**)
* **instantiate** 1 StartUp object _stp_<br>
	example : ```StartUp stp = new StartUp(); ```
* **instantiate** 5 new Member objects with name = Alex, Beni, Cakra, Deni, and Eric; and add them to StartUp _stp_<br>
	example : <br>
		```Member m = new Member("Alex");```<br>
		```stp.addMember( m );```
* **create** 2 Project object within the Start Up _stp_, with project name = project1 and project2<br>
	example : ```stp.createNewProject( "project1" ); ```
* set project member as below
 * add Alex, Beni, and Deni into Project1
 * add Beni, Cakra, Deni, and Eric into Project2
	example : <br>
		```Project p = stp.getProject( 0 ); ```<br>
		```Member m = stp.getMember( 0 );```<br>
		```stp.setProjectMember( p , m );```<br>
* set release one of the project<br>
	example : ```stp.releaseProject( stp.getProject( 1 ) ); ```
* display the status of **every** member in Start Up _stp_<br>
	example : ```System.out.println( stp.getMember( 0 ) );```
* display the status of **every** project in Start Up _stp_<br>
	example : ```System.out.println( stp.getProject( 0 ) );```
* display the number of released project in Start Up _stp_<br>

### Try another scenario case on your own


