public class Setor extends Funcionario {
    // Declarando variaveis;

    private String nomeSetor;
    private String cargo;
    public Setor() {}

public Setor(String nome, int cpf, String nomeSetor, String cargo) {
        super(nome, cpf);
        this.nomeSetor = nomeSetor;
        this.cargo = cargo;
}
    // Definindo Getters e Setter
    public String getNomeSetor() {
        return nomeSetor;
    }
        public void setNomeSetor(String nomeSetor) {
            this.nomeSetor = nomeSetor;
        }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSetor de Operação: " + nomeSetor +
                "\nCargo: " + cargo;
    }
}
