package collections.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarCondidadoSet(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerCondidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado convidado : convidadoSet) {
            if (convidado.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = convidado;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() +
                " convidado(s) dentro do set de Convidados");
        System.out.println();

        conjuntoConvidados.adicionarCondidadoSet("Convidado 1", 1234);
        conjuntoConvidados.adicionarCondidadoSet("Convidado 2", 4321);
        conjuntoConvidados.adicionarCondidadoSet("Convidado 3", 1243);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() +
                " convidado(s) dentro do set de Convidados");
        System.out.println();

    }
}
