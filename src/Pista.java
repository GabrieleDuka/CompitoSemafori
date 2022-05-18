public class Pista{
    Semaforo semaforo;
    long start;
    long stop;
    long tempo;

    public Pista(Semaforo s) {
        semaforo = s;
    }

    public double gareggia(String nome) {
        semaforo.p();
        System.out.println(nome + " è entrato in pista");
        start = System.nanoTime();
        for(int i = 0; i < 15; i++) {
            try {
                Thread.sleep((long)Math.random() * 1000);
            } catch (InterruptedException e) {}
        }
        tempo = ((stop - start) / 1000000);
        System.out.println(nome + " è uscito dalla pista");
        semaforo.v();
        return tempo;
    }
}
