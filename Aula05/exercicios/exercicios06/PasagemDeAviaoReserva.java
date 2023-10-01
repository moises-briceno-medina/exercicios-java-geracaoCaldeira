package Aula05.exercicios.exercicios06;

import Aula05.exercicios.utils.ScanUtils;

import java.util.LinkedList;

public class PasagemDeAviaoReserva {
    public static void main(String[] args) {
        ScanUtils scan = new ScanUtils();
        LinkedList<Reserva> reservasPasagemList = new LinkedList<>();
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("""
                     Escolha uma das opcoes!
                    1 -> Reservar pasagem.
                    2 -> Cancelar reserva
                    3 -> Exibir todas as reservas.
                    4 -> Fechar o programa
                    """);
            opcao = scan.coletaInt("");

            switch (opcao) {
                case 1:
                    reservarPasagem(reservasPasagemList, scan);
                    break;
                case 2:
                    if (verificarReserva(reservasPasagemList)) {
                        cancelarReserva(reservasPasagemList, scan);
                    } else System.out.println("Lista de reserva vazia");
                    break;
                case 3:
                    if (verificarReserva(reservasPasagemList)) {
                        exibirReserva(reservasPasagemList);
                    } else System.out.println("Lista de reserva vazia");
                    break;
                case 4:
                    System.out.println("fechando programa");
                default:
                    System.out.println("Opção inválida.");
            }
        }


    }

    public static void reservarPasagem(LinkedList<Reserva> reservasPasagem, ScanUtils scan) {
        String nome = scan.coletaTexto("Digite o seu nome para a reserva");
        String local = scan.coletaTexto("Digite o local da reserva");
        String cpf = scan.coletaTexto("Digite o seu cpf para a reserva");
        String dataEntrada = scan.coletaTexto("Digite a data de entrada da reserva");
        String dataSaida = scan.coletaTexto("Digite a data de saida da reserva");

        Reserva novaReserva = new Reserva(nome, local, cpf, dataEntrada, dataSaida);
        reservasPasagem.add(novaReserva);
        System.out.println("Seu id de reserva é :  " + (reservasPasagem.getLast().getIdReserva()));
    }

    public static void cancelarReserva(LinkedList<Reserva> reservasCacela, ScanUtils scan) {
        int id = scan.coletaInt("informe o codigo de reserva");

        for (Reserva objeto : reservasCacela) { //for percorre a lista de objetos e pegar o valor do id de reserva
            if (id == objeto.getIdReserva()) {
                reservasCacela.remove();
                System.out.println("Reserva cancelada com sucesso");
            }
        }
        System.out.println("Não Tem nenhuma reserva com esse cpf");
    }

    public static void exibirReserva(LinkedList<Reserva> reservas) {
        System.out.println("Lista de reservas de pasagens");
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
    }

    public static boolean verificarReserva(LinkedList<Reserva> reservaVerifica) {
        if (!reservaVerifica.isEmpty()) {
            return true;
        } else return false;
    }
}
