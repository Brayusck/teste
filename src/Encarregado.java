public class Encarregado extends Funcionario {
   // Definindo variaveis;
     private String setorSupervisionado;

        public Encarregado(){}
    public Encarregado(String nome, int cpf, String setorSupervisionado){
            super(nome, cpf);
            this.setorSupervisionado = setorSupervisionado;
        }
    // Definindo Getters e Setter
    public String getSetorSupervisionado() {
        return setorSupervisionado;
    }

    public void setSetorSupervisionado(String setorSupervisionado) {
        this.setorSupervisionado = setorSupervisionado;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSetorSupervisionado: " + setorSupervisionado;
    }
}
