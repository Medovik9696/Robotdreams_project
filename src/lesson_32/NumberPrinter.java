package lesson_32;

public class NumberPrinter implements Runnable{
    @Override
    public void run() {
            try {
            for(int i=1;i<11;i++){
            System.out.println("i= "+i+", threads number is: " + Thread.currentThread().getName());
            Thread.sleep(300);}
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }
}
