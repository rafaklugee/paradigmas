import java.util.Comparator;

public class ComparadorDano implements Comparator<Personagem> {
    public int compare(Personagem p1, Personagem p2) {
        p1.calcularDano();
        p2.calcularDano();
        int cmp = Double.compare(p2.dano, p1.dano); // decrescente
        if (cmp != 0) return cmp;
        return p1.nome.compareTo(p2.nome); // desempate por nome
    }
}
