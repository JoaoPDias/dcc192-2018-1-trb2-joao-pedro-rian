package Modelo;

import java.time.LocalDate;
import java.util.List;

public class Evento {
    String titulo, codigo;
    LocalDate data, sorteio;
    List<Participante> participantes;

    public Evento(String titulo, String codigo, LocalDate data, LocalDate sorteio) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.data = data;
        this.sorteio = sorteio;
    }
    
    public void sorteia(){}
}
