class Main {
  public static void main(String[] args){
    MyThread myThread = new MyThread();
    myThread.start();
  }
}

public class MyThread extends Thread {
  //overriding the Tread's run class
  public void run(){
    //specifying the task this worker should execute in his own stack
    System.out.println("Doing task X");
  }
}
