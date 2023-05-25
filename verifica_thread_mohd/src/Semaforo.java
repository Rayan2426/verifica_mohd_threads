public class Semaforo {
    private int valore;

    public Semaforo(){
        this.valore = 1;
    }

    public synchronized void P(){

        while(valore == 0){
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        valore--;
    }

    public synchronized void V(){
        valore++;
        notify();
    }
}
