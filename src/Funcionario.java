public class Funcionario {
// Definindo variaveis;

    private String nome;
    private int cpf;

    public Funcionario(){};

   public Funcionario(String nome, int cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    // Definindo Getters e Setter
    public String getNome() {
        return nome;
    }
        public void setNome(String nome) {
            this.nome = nome;
        }

    // Definindo Getters e Setter
    public int getCpf() {return cpf;}
        public void setCpf(int cpf) {this.cpf = cpf; }

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nMatricula: " + cpf;
    }
}
