package assignment_2;


public class Runnable_Thread implements Runnable{
 
    public static int myCount = 0;
    public Runnable_Thread(){
         
    }
    public void run() {
        while(Runnable_Thread.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++Runnable_Thread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        Runnable_Thread mrt = new Runnable_Thread();
        Thread t = new Thread(mrt);
        t.start();
        while(Runnable_Thread.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++Runnable_Thread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}