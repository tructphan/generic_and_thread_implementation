public class TestThread {
    public static void main(String[] args) {
        CounterClass thread1 = new CounterClass();
        thread1.startThread();
        CounterClass thread2 = new CounterClass();
        thread2.startThread();
        CounterClass thread3 = new CounterClass();
        thread3.startThread();
    }
}
class CounterClass implements Runnable {
    Thread thread;
    public static int count = 0;
    public void run() {
        System.out.println("Count = " + count++);
    }
    public void startThread() {
        thread = new Thread(this);
        thread.start();
    }
}