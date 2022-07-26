import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Usuario{
    private static List<Funcionario> funcionarios = new ArrayList<>();
    public static List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public static void RegistraFuncionarios(Funcionario fn) {
        for (Funcionario f: funcionarios){
            if(f.getCPF().equals(fn.getCPF())  || f.getRG().equals(fn.getRG())){
                System.out.println("Funcionario já Cadastrado! ");
            }else
                funcionarios.add(fn);
        }
    }

    private String senha;
    public Funcionario(String nome,String cpf, String rg, String nac, int rm, String stg, String senha) {
        setNome(nome);
        setCPF(cpf);
        setRG(rg);
        setSenha(senha);
        setNacionalidade(nac);
        setRM(rm);
        setSTG(stg);
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    public String getSenha() {
        return senha;
    }





}
