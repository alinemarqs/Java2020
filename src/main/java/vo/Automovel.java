package main.java.vo;

import java.math.BigDecimal;
import java.util.Date;

public class Automovel {

    private String marca;
    private String modelo;
    private String cor;
    private String combustivel;
    private Date dataLancamento;
    private Long numPortas;
    private BigDecimal valor;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Long getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(Long numPortas) {
        this.numPortas = numPortas;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Automovel{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", combustivel='" + combustivel + '\'' +
                ", dataLancamento=" + dataLancamento +
                ", numPortas=" + numPortas +
                ", valor=" + valor +
                '}';
    }
}
