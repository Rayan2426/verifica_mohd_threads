public class App {
    public static void main(String[] args) throws Exception {
        Monoposto m1,m2,m3,m4;
        m1 = new Monoposto("1", "Ferrari", "Martinez");
        m2 = new Monoposto("2", "Lamborghini", "Rossi");
        m3 = new Monoposto("3", "Bugatti", "Trump");
        m4 = new Monoposto("4", "Mercedes", "Schumacher");
        m1.start();
        m2.start();
        m3.start();
        m4.start();

        m1.join(); m2.join(); m3.join(); m4.join();
        System.out.println("FINE GARA");
    }
}
