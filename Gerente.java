public class Gerente extends Funcionario {
    private int senha;

    public void setSenha(int senha){
        this.senha = senha;
    }public int getSenha(){
        return this.senha;
    }
    
    public double getBonificacao(){
        return super.getSalario() + 1000.0;
    }
}