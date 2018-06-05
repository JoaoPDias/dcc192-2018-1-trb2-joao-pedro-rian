package Modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;

public class Evento {

    String titulo;
    Integer codigo;
    LocalDate dataEvento, dataSorteio;
    Double valorMinimo;
    Participante criador;
    List<Participante> participantes;


    public Evento(String titulo, Integer codigo, LocalDate data, LocalDate sorteio) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.dataEvento = data;
        this.dataSorteio = sorteio;
    }

    public Evento(Integer codigo, String titulo, Double valorMinimo, String data, String sorteio, Participante criador) {
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.titulo = titulo;
        this.codigo = codigo;
        this.valorMinimo = valorMinimo;
        this.dataEvento = LocalDate.parse(data, dt);
        this.dataSorteio = LocalDate.parse(sorteio, dt);
    }

    public Evento(String titulo, Double valorMinimo, String data, String sorteio, Participante criador) {
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.titulo = titulo;
        this.valorMinimo = valorMinimo;
        this.dataEvento = LocalDate.parse(data, dt);
        this.dataSorteio = LocalDate.parse(sorteio, dt);
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

    public String getDataEvento() {
        return dataEvento.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getDataSorteio() {
        return dataSorteio.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
    }

    public void setDataSorteio(LocalDate dataSorteio) {
        this.dataSorteio = dataSorteio;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Participante> participantes) {
        this.participantes = participantes;
    }

    public Double getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(Double valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public Participante getCriador() {
        return criador;
    }

    public void setCriador(Participante criador) {
        this.criador = criador;
    }
    
    
    public void sorteia() {
    }
}
