public class Semaforo {
    private int valore;

    public Semaforo(){
        this.valore = 2;
    }

    public synchronized void P(){
        System.out.println("BOX: "+Thread.currentThread().getName() + " RICHIESTA");
        while(valore == 0){
            System.out.println("BOX: "+Thread.currentThread().getName() + " ATTESA");
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        valore--;
    }

    public synchronized void V(){
        System.out.println("BOX: "+Thread.currentThread().getName() + " USCITA");
        valore++;
        notify();
    }
}
