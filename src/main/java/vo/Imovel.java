package main.java.vo;

public class Imovel {

    private double valor;
    private String localizacao;
    private Long areaConstruida;

    public Imovel(String localizacao, Long areaConstruida) {
        this.localizacao = localizacao;
        this.areaConstruida = areaConstruida;
    }

    //calculo da área construída
    public String calculaValor(Long areaConstruida) {
        double valor;
        if (areaConstruida<=0){
            valor = 0;
        } else {
            valor =  areaConstruida * 20000;
        }

        return  "O valor da área construída é: " + valor + " se área construída for " + areaConstruida;
    }

    //calculo da área construída
    public String calculaValor() {
        String retorno = null;

        if (this.areaConstruida<=0){
            this.valor = 0;
        } else {
            this.valor =  this.areaConstruida * 20000;
        }

        retorno = "O valor da área construída é: " + this.valor;

        return retorno;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Long getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(Long areaConstruida) {
        this.areaConstruida = areaConstruida;
    }
}
