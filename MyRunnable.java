class Main {
  public static void main(String[] args){
    Thread thread = new Thread(new MyRunnable());
    thread.start();
  }
}

public class MyRunnable implements Runnable{
  public void run(){
    //will have tasks that are still in the queue
    System.out.println("MyRunnable");
  }
}
