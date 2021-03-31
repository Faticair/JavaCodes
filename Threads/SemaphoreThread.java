import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/*** 
 * 背景：
 *     一共有4个厕所，现在有20人排队。
 * 模拟场景：
 *     只要有空厕所，就会有人进入。假设进入顺序与每个人的编号一致。
 * 使用模块：
 *     Semaphore    ExecutorService
***/

class SemaphoreThread {
    public class MyThread implements Runnable {
        private Semaphore s;
        private int man;

        public MyThread(Semaphore s, int man){
            this.s = s;
            this.man = man;
        }

        public void run(){
            try{
                s.acquire();
                System.out.println("user " + this.man + " enter the WC.");
                Thread.sleep((int)(Math.random()*1000));
                System.out.println("user " + this.man + " finished.");
                Thread.sleep(1);
                s.release();
            }
            catch(InterruptedException error){
                error.getStackTrace();
            }
        }
    }

    public void execute(){
        final Semaphore semaphore = new Semaphore(4);
        ExecutorService threadpool = Executors.newCachedThreadPool();
        for (int i = 1; i <= 20; i++){
            threadpool.execute(new MyThread(semaphore, i));
        }

        threadpool.shutdown();
    }
    
    public static void main(String[] args) {
        SemaphoreThread semaphoreThread = new SemaphoreThread();
        semaphoreThread.execute();
    }

}