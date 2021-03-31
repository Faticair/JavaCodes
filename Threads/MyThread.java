class TestThread implements Runnable{
    private Integer name = 0;
    private Integer tickets = 20;
    
    public TestThread(Integer name){
        this.name = name;
    }

    public void run(){
        for ( int i = 0; i < 20; i++){
            synchronized(this){
                if (tickets > 0){
                    try{
                        Thread.sleep(100);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + this.name + " sell ticket, tickets left " + --tickets);
                    if (tickets == 0){
                        System.out.println(Thread.currentThread().getName() + this.name + " sold the last ticket!");
                    }
                }
            }
        }
        
    }
}

// class TryThread extends Thread{
//     private Integer id = 0;
    
//     public TryThread(Integer id){
//         this.id = id;
//     }

//     public void run(){
//         System.out.println(Thread.currentThread().getName() + this.id); 
//     }
// }

public class MyThread{
    public static void main(String[] args) {
        
        // TestThread mt1 = new TestThread(1);
        // TestThread mt2 = new TestThread(2);
        // Thread t1 = new Thread(mt1);
        // Thread t2 = new Thread(mt2);
        // // t1.setPriority(Thread.MAX_PRIORITY);
        // // t2.setPriority(Thread.MIN_PRIORITY);
        // t1.start();
        // t2.start();

        // Integer[] intlist = {1000, 1001, 1010, 1011, 1100, 1101, 1110, 1111};
        // TryThread mt3 = new TryThread(3);
        // TryThread mt4 = new TryThread(4);
        // mt3.start();
        // mt4.start();

        TestThread ticketseller = new TestThread(0);
        Thread t1 = new Thread(ticketseller);
        Thread t2 = new Thread(ticketseller);
        Thread t3 = new Thread(ticketseller);
        Thread t4 = new Thread(ticketseller);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}