package main.java;

import main.java.vo.Imovel;


public class MainPolimorfismo {
    public static void main(String[] args) {

        Imovel imovel1 = new Imovel("Rua dos bobos, nro 0",150L);

        System.out.println(imovel1.calculaValor());

        System.out.println(imovel1.calculaValor(200L));
    }
}
