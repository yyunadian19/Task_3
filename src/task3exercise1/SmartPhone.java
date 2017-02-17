package task3exercise1;

public class Smartphone {
    // 
    // 1. Declare your private attributes here:
    // NIM : 1301150012
    // NAMA : Yusuf Yunadian 
    // 
    private String name; 
    private Application[] appListS = new Application[10];
    private int totalApp;
    private int memory;

    public void setMemory(int memory) {
        this.memory = memory;
    }
    
    public void addApplication(AppStore appStore, int appId){
    // 
    // 3. method addApplication( appStore , appId ) here:
    // NIM : 1301150012
    // NAMA : Yusuf Yunadian
    //
      
      
        appListS[appId] =  appStore.getApp(appId);
        this.memory = this.memory - appStore.getApp(appId).getAppSize();
        totalApp++;
    }
    // 
    // 2. Declare your Setter and Getter method here:
    // NIM : 1301150012
    // NAMA : Yusuf Yunadian 
    // 
    public Application getApp(int id){
        return appListS[id];
    }
    
    public int getTotalApp(){
        return totalApp;
    }
    
    public int getRemainingSize(){
        return memory;
    }
    // 
    // 5. Create method toString() : String here:
    // NIM : 1301150012
    // NAMA : Yusuf Yunadian 
    // 
    public String toString(){
        return "This Smartphone has " + totalApp + " of total App and " + getRemainingSize() + " MB of memory.";
    }
    
}
