import static java.lang.Thread.sleep;

public class thread implements Runnable{

        @Override
        public void run () {
            int time = 0;
            while (true) {
                try {
                    sleep(1000);
                } catch (InterruptedException exc) {
                    System.out.println("Wątek zliczania czasu zoostał przerwany.");
                    return;
                }
                time++;
                int minutes = time / 60;
                int sec = time % 60;
                if (time<10)
                System.out.println("0" + minutes + ":" + "0" + sec);
                if (time>=10)
                    System.out.println("0" + minutes + ":" + sec);
            }
        }
}
