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

    public Double getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(Double valorMinimo) {
        this.valorMinimo = valorMinimo;
    }
    List<Participante> participantes;

    public Evento(String titulo, Integer codigo, LocalDate data, LocalDate sorteio) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.dataEvento = data;
        this.dataSorteio = sorteio;
    }
    
     public Evento(Integer codigo,String titulo, Double valorMinimo, String data, String sorteio) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.valorMinimo = valorMinimo;
        this.dataEvento = LocalDate.parse(data, DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        this.dataSorteio = LocalDate.parse(sorteio, DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
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

    public String getSorteio() {
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
    
    
    
    public void sorteia(){}
}
