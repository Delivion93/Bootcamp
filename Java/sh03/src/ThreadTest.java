import static java.lang.Thread.sleep;

public class ThreadTest {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            int counter =1;
            while (counter<=5){
                try {
                    System.out.println(counter);
                    counter++;
                    sleep(1000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }

        });
        thread.start();
    }
}
