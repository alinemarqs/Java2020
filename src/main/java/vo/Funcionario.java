package main.java.vo;

import java.util.Date;

public class Funcionario extends Pessoa {

    private Long salario;
    private String cargo;
    private Date dataFerias;

//    public void recebeSalario(Long salario) {
//        salario = salarioMes;
//    }
//
//    public void realizaAniversario(Long Bonus) {
//        salario = salario + bonus;
//    }


    public Long getSalario() {
        return salario;
    }

    public void setSalario(Long salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getDataFerias() {
        return dataFerias;
    }

    public void setDataFerias(Date dataFerias) {
        this.dataFerias = dataFerias;
    }

}
