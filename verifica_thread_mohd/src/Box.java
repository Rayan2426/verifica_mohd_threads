public class Box {
    

    /**
     * Instantiates the Box object
     */
    public Box(){}

    /**
     * Changes the tire of a Monoposto, the process takes from 1 to 5 seconds to execute
     */
    public void cambioGomme(){
        System.out.println(Thread.currentThread().getName() + " sta cambiando le gomme");
        try {
            Thread.sleep((int)(Math.random() * 5 + 1) * 1000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
