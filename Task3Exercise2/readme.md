## Task 3 - Exercise 2 - 2017
# 

### Write Java Program as described in Class Diagram below<br>
![Class Diagram Exercise 2] (/Exercise_2/exercise2.JPG) <br>

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
