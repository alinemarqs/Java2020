package main.java;

import main.java.vo.Animal;
import main.java.vo.Automovel;
import main.java.vo.Pessoa;

import java.util.Date;

public class Main {
    //PRIMEIRO PROJETO JAVA
    public static void main(String[] args) {

        //CONSTRUTOR SEM PARAMETROS
        Pessoa p = new Pessoa(); // instanciando a pessoa

        p.setNome("Aline Marques");
        p.setCpf("333.555.888-33");
        p.setDataNascimento(new Date(1991,07,20)); // instanciar para importar a data
        p.setRg("33.777.244-55");
        p.setIdade(29L); //O "L" força para entender que é um long

        System.out.println("A idade da " + p.getNome() + " é: " + p.getIdade());
        System.out.println(p.getNome() + " nasceu em: " + p.getDataNascimento());
        System.out.println(p);

        Pessoa p2 = new Pessoa("Claudia","555.444.666-37");
        System.out.println(p2);


        Automovel a = new Automovel();

        a.setMarca("Hunday");
        a.setModelo("HB20");
        a.setDataLancamento(new Date(2020,11,16));

        System.out.println(a);

        Animal an = new Animal();

        an.setEspecie("Dogzinho");
        an.setCor("Branco e caramelo");
        an.setAlimento("Ração");
        an.setDataNascimento(new Date(2020,11,16));

        System.out.println(an);
    }
}
