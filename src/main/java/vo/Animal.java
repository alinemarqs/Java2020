package main.java.vo;

import java.math.BigDecimal;
import java.util.Date;

public class Animal {

    private String especie;
    private String cor;
    private String genero;
    private String alimento;
    private Date dataNascimento;
    private Long peso;

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Long getPeso() {
        return peso;
    }

    public void setPeso(Long peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", cor='" + cor + '\'' +
                ", genero='" + genero + '\'' +
                ", alimento='" + alimento + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", peso=" + peso +
                '}';
    }
}
