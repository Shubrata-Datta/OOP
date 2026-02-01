class ResultCalculation extends Thread {

    @Override
    public void run() {

        try {
            System.out.println("Result calculation started");

            Thread.sleep(2000);

            System.out.println("Result calculation completed");

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class ReportGeneration extends Thread {

    @Override
    public void run() {
        System.out.println("Report generation started");
        System.out.println("Final report generated");
    }
}

public class Main_Q3 {

    public static void main(String[] args) throws InterruptedException {

        
        ResultCalculation t1 = new ResultCalculation();
        ReportGeneration t2 = new ReportGeneration();

        t1.start();

        t1.join();

        t2.start();
    }
}
