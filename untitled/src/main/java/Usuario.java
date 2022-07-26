 public class Usuario {
    private String nome;
    private String CPF;
    private String RG;
    private String STG;
    private int RM;
    private String Nacionalidade;
     public Usuario() {


     }
     public String getNome() {
         return nome;
     }

     public void setNome(String nome) {
         this.nome = nome;
     }

     public String getCPF() {
         return CPF;
     }

     public void setCPF(String CPF) {
         this.CPF = CPF;
     }

     public String getRG() {
         return RG;
     }

     public void setRG(String RG) {
         this.RG = RG;
     }

     public String getSTG() {
         return STG;
     }

     public void setSTG(String STG) {
         this.STG = STG;
     }

     public int getRM() {
         return RM;
     }

     public void setRM(int RM) {
         this.RM = RM;
     }

     public String getNacionalidade() {
         return Nacionalidade;
     }

     public void setNacionalidade(String nacionalidade) {
         Nacionalidade = nacionalidade;
     }
 }




//Os usuários devem possuir os atributos privados: nome, CPF, RG, situação
//com o governo(OK - Para regular ou Pendente - Para irregular), renda
//mensal e nacionalidade. Já os veículos devem possuir os atributos:
//marca, modelo, número de registro, cor e disponibilidade.