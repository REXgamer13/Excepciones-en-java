public class E4_InterruptedException {
    public static void main(String[] args) {
        Thread longSleepingThread = new Thread(() -> {
            try {
                // Simular una tarea en un tiempo
                System.out.println("Going to sleep...");
                Thread.sleep(5000);  
                System.out.println("Woke up normally!");
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.err.println("I was rudely interrupted while sleeping!");
            }
        });

        
        Thread.sleep(2000);


    }
    }
    

