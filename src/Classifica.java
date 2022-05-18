import java.util.ArrayList;

public class Classifica {

    public class Tempo {
        private String nome;
        private double tempo;

        public Tempo(String nome, double tempo) {
            this.nome = nome;
            this.tempo = tempo;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getTempo() {
            return tempo;
        }

        public void setTempo(double tempo) {
            this.tempo = tempo;
        }

        
    }

    ArrayList<Tempo> tempi;

    public Classifica() {
        tempi = new ArrayList<>();
    }

    public void addTempo(String nome, double tempo) {
        if(tempi.size() == 0) tempi.add(new Tempo(nome, tempo));
        else {
            for(int i = 0; i < tempi.size() - 1; i++) {
                if(tempi.get(i).getTempo() > tempo) {
                    tempi.add(i, new Tempo(nome, tempo));
                    return;
                }
            }
            tempi.add(new Tempo(nome, tempo));
        }
    }

    public void stampaClassifica() {
        int x;
        for(int i = 0; i < tempi.size(); i++) {
            x = i + 1;
            System.out.println(x + " posto: " + tempi.get(i).getNome());
        }
    }
}
