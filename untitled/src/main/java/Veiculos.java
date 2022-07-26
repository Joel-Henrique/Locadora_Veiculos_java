import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Veiculos { //marca, modelo, número de registro, cor e disponibilidade.
    private String númeroregistro;
    private  String Disponibilidade;
    private String Modelo;
    private String Cor;

    public void setNúmeroregistro(String númeroregistro) {
        this.númeroregistro = númeroregistro;
    }

    public void setDisponibilidade(String disponibilidade) {
        Disponibilidade = disponibilidade;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public static void setVeiculos(List<Veiculos> veiculos) {
        Veiculos.veiculos = veiculos;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public String getMarca() {
        return Marca;
    }
    public String getCor() {
        return Cor;
    }
    private String Marca;

    private static List<Veiculos> veiculos = new ArrayList<>();

    public static void RegistraVeiculos(Veiculos vc) {
        for (Veiculos v: veiculos){
            if(vc.getNúmeroregistro().equals(v.getNúmeroregistro())){
                System.out.println("Veiculo já Cadastrado! ");
            }else
                veiculos.add(v);
        }
    }
    public static boolean Disponibilidade(Veiculos vc) {
        for (Veiculos v: veiculos){
            if(vc.getNúmeroregistro().equals(v.getNúmeroregistro()) && v.Disponibilidade.equals("N")){
                System.out.println("Veiculo Indisponivel! ");
                return false;
            }else {
                System.out.println("Veiculo Disponivel");
                return true;
            }
        }
        System.out.println("Veiculo não encontrado! ");
        return false;
    }

    public String getDisponibilidade() {
        return Disponibilidade;
    }

    public String getNúmeroregistro() {
        return númeroregistro;
    }

    public String getModelo() {
        return Modelo;
    }
    public static List<Veiculos> getVeiculos() {
        return veiculos;
    }


    public static String LerSring(){
        Scanner Teclado = new Scanner(System.in);
        return Teclado.nextLine().trim();
    }
    public static int Lerint(){
        try {
            Scanner Teclado = new Scanner(System.in);
            return Teclado.nextInt();

        }catch (Exception e){
            System.out.println("Numero invalido!Digite novamente:  ");
            return Lerint();
        }
    }

}
