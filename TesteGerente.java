public class TesteGerente {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.setNome("Mariana Pellin");
        f.setSalario(3000.0);

        Gerente g = new Gerente();
        g.setNome("Gabriela Pellin");
        g.setSalario(8000.0);
        g.setSenha(3733);

        System.out.println("Funcionário: " + f.getNome());
        System.out.println("Salário Funcionário: " + f.getSalario());
        
        System.out.println("Gerente: " + g.getNome());
        System.out.println("Salário Gerente: " + g.getSalario());
        System.out.println("Bonificação Gerente: " + g.getBonificacao());
    }
}