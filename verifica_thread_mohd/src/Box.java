public class Box {
    

    public Box(){}

    public void cambioGomme(){
        System.out.println(Thread.currentThread().getName() + " sta cambiando le gomme");
        try {
            Thread.sleep((int)(Math.random() * 5 + 1) * 1000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
