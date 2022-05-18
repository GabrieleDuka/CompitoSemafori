public class Persona extends Thread{
    private String nome;
    private double tempo;
    Spogliatoio spogliatoio;
    Pista p;
    Classifica classifica;
    
    public Persona(String nome, Semaforo s1, Semaforo s2, Classifica c) {
        this.nome = nome;
        p = new Pista(s1);
        spogliatoio = new Spogliatoio(s2);
        classifica = c;
    }

    public String getNome() {
        return nome;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public void run() {
        spogliatoio.cambia(getNome());
        setTempo(p.gareggia(getNome()));
        spogliatoio.cambia(getNome());

        classifica.addTempo(getNome(), getTempo());
    }
}
