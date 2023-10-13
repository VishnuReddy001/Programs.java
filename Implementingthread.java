class MyRunnable implements Runnable 
{
    public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Thread " + Thread.currentThread().getId() + " - count: " + i);
        }
    }
}
public class Implementingthread 
{
    public static void main(String[] args) 
    {
        MyRunnable r = new MyRunnable();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
    }
}