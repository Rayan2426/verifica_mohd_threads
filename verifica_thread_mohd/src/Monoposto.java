public class Monoposto extends Thread{
    private String id;
    private String scuderia;
    private String pilota;
    private static Box box = new Box();
    private static Semaforo semaforo = new Semaforo();

    /** Instantiates the Monoposto with an id, Scuderia and a pilot
     * @param String id
     * @param String scuderia
     * @param String pilota
     */
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
                sleep((int)(Math.random() * 4 + 1) * 1);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            if(i % 3 == 0 && i != 0){
                semaforo.P();
                box.cambioGomme();
                semaforo.V();
            }

            System.out.println("GIRO-" + (i+1) + ": " + pilota + " COMPLETATO");
        }

    }

    /** Getter method
     * @return the name of the pilot
     */
    public String getPilota(){
        return pilota;
    }

    /** Getter method
     * @return the id of the Monoposto
     */
    public String getID(){
        return id;
    }
    /** Getter method
     * @return the name of the Scuderia
     */
    public String getScuderia(){
        return scuderia;
    }
    
}