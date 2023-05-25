public class Semaforo {
    private int valore;

    public Semaforo(){
        this.valore = 1;
    }

    public synchronized void P(){
        System.out.println(Thread.currentThread().getName() + " si sta dirigendo ai box");
        while(valore == 0){
            System.out.println(Thread.currentThread().getName() + " e' in attesa di usare il box");
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        valore--;
    }

    public synchronized void V(){
        System.out.println(Thread.currentThread().getName() + " e' uscito dai box");
        valore++;
        notify();
    }
}
