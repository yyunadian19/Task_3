## Task 3 - Exercise 1 - 2017

### Write Java Program as described in Class Diagram below<br>
![Class Diagram Exercise 1] (/Exercise_1/exercise1.JPG) <br>

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
