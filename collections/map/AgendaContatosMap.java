package collections.map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatosMap {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatosMap() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarContatoPorNome(String nome) {
        Integer contatoPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            contatoPorNome = agendaContatoMap.get(nome);

        }
        return contatoPorNome;
    }

    public static void main(String[] args) {
        AgendaContatosMap agendaContatos = new AgendaContatosMap();

        agendaContatos.adicionarContato("Glauber", 12456566);
        agendaContatos.adicionarContato("Roger", 1234534534);
        agendaContatos.adicionarContato("Gilson", 129857485);

        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarContatoPorNome("Glauber"));
        agendaContatos.removerContato("Gilson");
        agendaContatos.exibirContatos();
    }
}
