package Modelo;

import java.time.LocalDate;
import java.util.List;

public class Evento {
    String titulo; 
    Integer codigo;
    LocalDate data, sorteio;
    List<Participante> participantes;

    public Evento(String titulo, Integer codigo, LocalDate data, LocalDate sorteio) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.data = data;
        this.sorteio = sorteio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getSorteio() {
        return sorteio;
    }

    public void setSorteio(LocalDate sorteio) {
        this.sorteio = sorteio;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Participante> participantes) {
        this.participantes = participantes;
    }
    
    
    
    public void sorteia(){}
}
