package example.creational.singleton;


import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int numberOfThreads = 10;
        CountDownLatch readyLatch = new CountDownLatch(numberOfThreads);
        CountDownLatch startLatch = new CountDownLatch(1);

        for (int i = 0; i < numberOfThreads; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    readyLatch.countDown(); // Indica que a thread está pronta
                    try {
                        startLatch.await(); // Espera o sinal para iniciar
                        DatabaseConnection instance = DatabaseConnection.getInstance();
                        System.out.println("Instance: " + instance.hashCode());
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }).start();
        }

        readyLatch.await(); // Espera todas as threads ficarem prontas
        startLatch.countDown(); // Inicia todas as threads simultaneamente
    }
}


