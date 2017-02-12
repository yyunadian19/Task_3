/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3exercise1;

/**
 * NIM 1 : ................ 
 * NIM 2 : ................ 
 * NIM 3 : ................
 *
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instantiate 1 AppStore object aps        
        AppStore aps = new AppStore();

        // create 4 new Applications within the App Store aps, 
        // with app name = app1, app2, app3, and app4; 
        // and app size 100, 200, 300, and 400 respectively
        aps.createNewApp( "app1" , 100 );
        aps.createNewApp( "app2" , 100 );
        aps.createNewApp( ..., ... );
        
        // display the status of App Store aps
        System.out.println( aps );
        
        // display the status of one of application available on App Store aps
        System.out.println( aps.getApp( 2 ) );
        
        
        // instantiate 1 SmartPhone object sm, set the memory size 300
        SmartPhone sm = new SmartPhone();
        sm.setMemory(300);
        
        // display the status of SmartPhone sm        
        System.out.println( sm );
        
        // install applications (in sequence) 
        // app1, app3, and app2 in SmartPhone sm
        // display the status of SmartPhone sm after each installation
        sm.addApplication( aps, app1 );
        System.out.println(sm);
        sm.addApplication( aps, app2 );
        System.out.println(sm);
        sm.addApplication( aps, app3 );
        System.out.println(sm);
        
        // Try another scenario case on your own
        
    }

}
