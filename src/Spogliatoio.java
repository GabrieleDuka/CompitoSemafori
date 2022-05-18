public class Spogliatoio {
    Semaforo semaforo;
    public Spogliatoio(Semaforo s) {
        semaforo = s;
    }

    public void cambia(String nome) {
        semaforo.p();
        System.out.println(nome + " è entrato nello spogliatoio");
        
        try {
            Thread.sleep((long)Math.random() * 1000);
        } catch (InterruptedException e) {}

        System.out.println(nome + " è uscito dallo spogliatoio");
        semaforo.v();
    }
}
