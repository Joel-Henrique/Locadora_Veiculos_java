import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LocadoraControle {
    public static List<Cliente> clientes = new ArrayList<>();

    public static void main(String[] args) {
        int x = 0;
        for (;x != 4;) {
            System.out.println("o 1 – Login funcionário.\n" +
                    "o 2 – Cadastrar funcionário.\n" +
                    "o 3 – Relatório de locação.\n" +
                    "o 4 – Sair.");
            System.out.println("Digite um numero de 1 a 4: ");
            x = Lerint();
            switch (x) {
                case 1: //Login funcionário.
                    System.out.println("Digite seu CPF: ");
                    String CPF = LerSring();
                    for (Funcionario f: Funcionario.getFuncionarios()){
                        if(f.getCPF().equals(CPF)) {
                            try {
                                System.out.println("Digite sua senha: ");
                                String senha = LerSring();
                                if(f.getSenha().equals(senha)){
                                    MenuCarro();
                                }
                            }catch (Exception e){
                                System.out.println("Login Invalido! ");
                            }
                        }
                    }
                    break;
                case 2: //Cadastrar funcionário.
                    String nome,cpf,RG,STG,Nacionalidade,senha;
                    int rm;
                    System.out.println("Digite um nome: ");
                    nome = LerSring();
                    System.out.println("Digite um cpf: ");
                    cpf = LerSring();
                    System.out.println("Digite um RG: ");
                    RG = LerSring();
                    System.out.println("Digite um situação com o governo(OK - Para regular ou Pendente - Para irregular), ");
                    STG = LerSring();
                    System.out.println("Digite um Nacionalidade: ");
                    Nacionalidade = LerSring();
                    System.out.println("Digite uma renda mensal: ");
                    rm = Lerint();
                    System.out.println("Digite uma senha: ");
                    senha = LerSring();
                    Funcionario funcionario = new Funcionario(nome,cpf,RG,Nacionalidade,rm,STG,senha);

                    Funcionario.RegistraFuncionarios(funcionario);

                    break;
                case 3: //Relatório de locação.
                    for (Cliente c: clientes){
                        if(c.getJadevolveu().equals("N")){
                            System.out.println("Cliente " + c.getNome() + "CPF: "+ c.getCPF()+ " ainda não devolveu o veiculo!");
                        }else
                            System.out.println("Cliente " + c.getNome() + "CPF: "+ c.getCPF()+ " ainda já devolveu o veiculo!");
                    }

                    break;
                case 4: //Sair.
                    break;
                default:
                    System.out.println("Numero não corresponde a nenhum valor no menu! ");
            }
        }
    }
    public static void MenuCarro() {
        int x = 0;
        for (; x != 4; ) {
            System.out.println("o 1 – Cadastrar veículos.\n" +
                    "o 2 – Ver lista de veículos.\n" +
                    "o 3 – Alugar um veículo.\n" +
                    "o 4 – Devolver veículo.");
            System.out.println("Digite um numero de 1 a 4: ");
            x = Lerint();

            switch (x) {
                case 1: //Cadastrar veículos.
                    for (; x != 4; ) {
                        System.out.println("o 1 – Veiculo Pequeno.\n" +
                                "o 2 – Veiculo Medio.\n" +
                                "o 3 – Veiculo Grande.\n" +
                                "o 4 – Menu.");
                        System.out.println("Digite um numero de 1 a 4: ");
                        x = Lerint();
                        switch (x) {
                            case 1: //Veiculo Pequeno.
                                CarroP mini = new CarroP();
                                Veiculos.RegistraVeiculos(mini);
                                break;
                            case 2: //Veiculo Medio
                                CarroM med = new CarroM();
                                Veiculos.RegistraVeiculos(med);
                                break;
                            case 3: //Veiculo Grande.
                                CarroG grd = new CarroG();
                                Veiculos.RegistraVeiculos(grd);
                                break;
                            case 4: //Menu
                                break;
                            default:
                                System.out.println("Numero não corresponde a nenhum valor no menu! ");
                        }
                    }
                    break;
                case 2: //Ver lista de veículos.
                    for (Veiculos v: Veiculos.getVeiculos()){
                        System.out.println("Marca: "+ v.getMarca() + " Cor "+ v.getCor() + " Modelo "+ v.getModelo());
                    }
                    break;
                case 3: //Alugar um veículo.
                    String nome,cpf,RG,STG,Nacionalidade;
                    int rm;
                    System.out.println("Digite um nome: ");
                    nome = LerSring();
                    System.out.println("Digite um cpf: ");
                    cpf = LerSring();
                    System.out.println("Digite um RG: ");
                    RG = LerSring();
                    System.out.println("Digite um situação com o governo(OK - Para regular ou Pendente - Para irregular), ");
                    STG = LerSring();
                    System.out.println("Digite um Nacionalidade: ");
                    Nacionalidade = LerSring();
                    System.out.println("Digite uma renda mensal: ");
                    rm = Lerint();
                    Cliente cliente = new Cliente(nome,cpf,RG,Nacionalidade,rm,STG);
                    clientes.add(cliente);
                    if(cliente.getSTG().equals("Pendente")){
                        System.out.println("irregularidade, ou seja, sua relação com o governo não está regularizada.");
                    }else{
                        List<Veiculos> Disp = new ArrayList<>();
                        int car = 0;
                        for (Veiculos v: Veiculos.getVeiculos()){
                            if(v.getDisponibilidade().equals("S")) {
                                Disp.add(v);
                                car++;
                                System.out.print(car+"a Carro : ");
                                System.out.println("Marca: " + v.getMarca() + " Cor " + v.getCor() + " Modelo " + v.getModelo());
                            }
                            System.out.println("Escolha entre um Deles! ");
                            car = Lerint();
                            cliente.setVeiculo(Disp.get(car));
                            cliente.setJadevolveu("N");
                            Disp.get(car).setDisponibilidade("N");
                        }
                    }

                    break;
                case 4: //Devolver veículo.
                    System.out.println("Digite seu cpf: ");
                    cpf = LerSring();
                    for (Cliente c: clientes){
                        if(c.getCPF().equals(cpf)){
                            System.out.println("Veiculo Devolvido! ");
                            c.setJadevolveu("S");
                            c.getVeiculo().setDisponibilidade("S");
                        }
                    }
                    break;
                default:
                    System.out.println("Numero não corresponde a nenhum valor no menu! ");
            }
        }
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
    public static String LerSring(){
        Scanner Teclado = new Scanner(System.in);
        return Teclado.nextLine().trim();
    }

}
