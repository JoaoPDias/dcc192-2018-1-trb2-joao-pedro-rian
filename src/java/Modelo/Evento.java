package Modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
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
    
     public Evento(String titulo, Integer codigo, String data, String sorteio) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.data = LocalDate.parse(data, DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        this.sorteio = LocalDate.parse(sorteio, DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
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

    public String getData() {
        return data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getSorteio() {
        return sorteio.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
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
