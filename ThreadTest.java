class Download extends Thread {
    String name;

    Download(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(name + " downloading item " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Download d1 = new Download("A");
        Download d2 = new Download("B");

        d1.start();
        d2.start();

        d1.join();
        d2.join();

        System.out.println("It's time for watching!");
    }
}
