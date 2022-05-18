public class App {
    public static void main(String[] args) throws Exception {
        Semaforo semaforoS = new Semaforo(2);
        Semaforo semaforoP = new Semaforo(4);

        Classifica classifica = new Classifica();

        Persona p1 = new Persona("Maurizio" , semaforoP, semaforoS, classifica);
        Persona p2 = new Persona("Giovanni" , semaforoP, semaforoS, classifica);
        Persona p3 = new Persona("Paolo" , semaforoP, semaforoS, classifica);
        Persona p4 = new Persona("Fabrizio" , semaforoP, semaforoS, classifica);
        Persona p5 = new Persona("Giacomo" , semaforoP, semaforoS, classifica);
        Persona p6 = new Persona("Matteo" , semaforoP, semaforoS, classifica);
        Persona p7 = new Persona("Andrea" , semaforoP, semaforoS, classifica);
        Persona p8 = new Persona("Davide" , semaforoP, semaforoS, classifica);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();

        p1.join();
        p2.join();
        p3.join();
        p4.join();
        p5.join();
        p6.join();
        p7.join();
        p8.join();

        classifica.stampaClassifica();
    }
}
