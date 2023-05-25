public class Monoposto extends Thread{
    private String id;
    private String scuderia;
    private String pilota;
    private static Box box = new Box();
    private static Semaforo semaforo = new Semaforo();

    public Monoposto(String id, String scuderia, String pilota){
        this.id = id;
        this.scuderia = scuderia;
        this.pilota = pilota;
        super.setName(pilota);
    }

    @Override
    public void run(){
        System.out.println(pilota + " ha iniziato la gara");

        for(int i = 0; i < 10; i++){

            try {
                sleep((int)(Math.random() * 4 + 1) * 1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            if(i % 3 == 0 && i != 0){
                semaforo.P();
                box.cambioGomme();
                semaforo.V();
            }

            System.out.println(pilota + " ha completato il giro numero " + (i+1));
        }

    }
}
