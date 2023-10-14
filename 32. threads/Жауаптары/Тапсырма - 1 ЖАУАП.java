public class ThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new NumberPrinter("Ағын 1"));
        Thread thread2 = new Thread(new NumberPrinter("Ағын 2"));

        thread1.start();
        thread2.start();
    }
}

class NumberPrinter implements Runnable {// Өзіміздің ағынды классымыз
    private final String threadName;

    public NumberPrinter(String threadName) { // Конструктор арқылы қай ағын екенін білу мақсатында ат беру
        this.threadName = threadName;
    }

    @Override // Runnable деп аталатын интерфейсымызден мұрагерлікпен қабыл алатын әдісімізді жаңадан басып жазу.
    public void run() {
        for (int i = 1; i <= 10; i++) { // 1ден 10-ға дейін итерация жасайтын бөлік
            System.out.println(threadName + ": " + i);
            try {
                Thread.sleep(100); // 0,1 секунд күтеді, тек одан кейін жалғасады
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
