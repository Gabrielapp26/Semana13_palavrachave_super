public class Funcionario {
    private String cpf;
    private String nome;
    private double salario;

    public void setCpf(String cpf){
        this.cpf = cpf;
    }public String getCpf(){
        return this.cpf;
    }

    public void setNome(String nome){
        this.nome = nome;
    }public String getNome(){
        return this.nome;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }public double getSalario(){
        return this.salario;
    }


    public double getBonificacao(){
        return this.salario*0.10;
    }
}