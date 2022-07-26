public class Cliente extends Usuario{
    public Veiculos getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(Veiculos veiculo) {
        this.veiculo = veiculo;
    }
    private String jadevolveu;

    public String getJadevolveu() {
        return jadevolveu;
    }

    public void setJadevolveu(String jadevolveu) {
        this.jadevolveu = jadevolveu;
    }

    private Veiculos veiculo;
    public Cliente(String nome,String cpf, String rg, String nac, int rm, String stg) {
        setNome(nome);
        setCPF(cpf);
        setRG(rg);
        setNacionalidade(nac);
        setRM(rm);
        setSTG(stg);
    }

}
///o Ao selecionar essa opção, deve-se primeiro preencher os dados
//do cliente e salvá-lo no sistema.
//o Se o cliente não for inadimplente(situação com o governo),
//deve-se exibir uma lista de todos os carros disponíveis para
//aluguel, e pode-se selecionar um dentre eles.
//o Se for inadimplente, encerre essa sessão informando a
//irregularidade, ou seja, sua relação com o governo não está
//regularizada.