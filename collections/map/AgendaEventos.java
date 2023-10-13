package collections.map;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventoTreeMap);
    }

    public void obterProximoEvento() {
        // Set<LocalDate> keySet = eventosMap.keySet();
        // Collection<Evento> values = eventosMap.values();
        // eventosMap.get();
        LocalDate dataAtual = LocalDate.now();
        for (Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("O próximo evento: " + entry.getValue() + " acontecera na data " + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.OCTOBER, 15), "Evento 1", "Atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.OCTOBER, 17), "Evento 2", "Atracao 2");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.OCTOBER, 18), "Evento 3", "Atracao 3");
        agendaEventos.exibirAgenda();
        System.out.println();
        agendaEventos.obterProximoEvento();
    }
}
