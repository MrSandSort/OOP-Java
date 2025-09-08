public class Threading {


    public static void printNumbers(String taskName) {  
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " is running: " + i);
            try {
                Thread.sleep(500); // simulate work
            } catch (InterruptedException e) {
                System.out.println(taskName + " interrupted.");
            }
        }
        System.out.println(taskName + " finished.");
    }
    public static void main(String[] args) {
        Thread t1= new Thread(()-> printNumbers("task1"));
        Thread t2= new Thread(()-> printNumbers("task-2"));
        Thread t3= new Thread(()->printNumbers("task-3"));
        t1.start();
        t2.start();
        t3.start();

        System.out.println("Main thread finished launching threads.");
;    }
}
