import java.util.ArrayList;
import java.util.List;
public class Registro {

private static List<Funcionario> listafuncionarios = new ArrayList<>();
        public static void registrar(Funcionario funcionario) {
            listafuncionarios.add(funcionario);
        }
  public static List<Funcionario> getListaFuncionarios() {
            return listafuncionarios;
  }

    public static void setListafuncionarios(List<Funcionario> listafuncionarios) {
        Registro.listafuncionarios = listafuncionarios;
    }

        public static Funcionario buscarFuncionario(int cpf) {
            for (Funcionario funci : listafuncionarios) {
                if (funci.getCpf() == cpf) {
                    return funci;
                }
            }
                   return null;
        }
    public static boolean apagarFunci(int cpf) {
        Funcionario funcionario = buscarFuncionario(cpf);
        if (funcionario != null) {
            listafuncionarios.remove(funcionario);
            return true; // Funcionário removido com sucesso
        }
        return false; // Funcionário não encontrado na lista
    }

}




