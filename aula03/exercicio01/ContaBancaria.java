package aula03.exercicio01;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContaBancaria {
    private String nome;
    private String cpf;
    private int identificadorConta;
    private String nomeBanco;
    private String endereco;
    private double saldo;
    private LocalTime horarioAtual; // = LocalTime.now(); -> horario real atual
    private double manutencaoMensalConta = 15;
    private boolean contaAberta;
    private List<Transacao> historicoDeTransacoes;

    //Construtor
    public ContaBancaria(String nome, String cpf, int identificadorConta, String nomeBanco, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
//        this.identificadorConta = (int) ((Math.random() * 100) + 1);
        this.identificadorConta = identificadorConta;
        this.contaAberta = true;
        this.saldo = 0;
        this.historicoDeTransacoes = new ArrayList<>();
        this.nomeBanco = nomeBanco;
    }


    public void saque(double valor) {

        if (contaAberta) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                historicoDeTransacoes.add(new Transacao(new Date(), "Saque", valor));
            } else System.out.println("Saldo insuficiente.");
        } else System.out.println("Não é possível fazer saques, a conta está fechada");
    }

    public void deposito(double valor) {
        if (contaAberta) {
            this.saldo += valor;
            historicoDeTransacoes.add(new Transacao(new Date(), "Depósito", valor));
        } else System.out.println("Não é possível fazer depositos, a conta está fechada");
    }

    public void pix(double valor, ContaBancaria destino, LocalTime hora) {
        if (contaAberta) {
//            horarioAtual = horarioAtual.withSecond(0); em caso de ser hor real usar
//            horarioAtual = horarioAtual.withNano(0); em caso de ser hor real usar

            if (horarioAtual.equals(hora) && this.saldo >= valor && destino.contaAberta) {
                destino.saldo += valor;
                this.saldo -= valor;
                historicoDeTransacoes.add(new Transacao(new Date(), "Pix", valor));

            } else System.out.println("Não foi possível realizar o pix");
        } else System.out.println("Não é possível fazer pix, a conta está fechada");
    }

    public void transferencia(ContaBancaria destino, double valor) {
        if (contaAberta) {
            LocalTime inicioIntervalo = LocalTime.of(8, 0);
            LocalTime fimIntervalo = LocalTime.of(19, 0);
            if (horarioAtual.isAfter(inicioIntervalo) && horarioAtual.isBefore(fimIntervalo) && this.saldo >= valor && destino.contaAberta) {
                destino.saldo += valor;
                this.saldo -= valor;
                historicoDeTransacoes.add(new Transacao(new Date(), "Tranferencia", valor));
            } else System.out.println("Não foi possível realizar a transferencia");
        } else System.out.println("Não é possível fazer transferencia, a conta está fechada");
    }

    public void verificarSaldo() {
        if (contaAberta) {
            System.out.println("Saldo atual R$: " + this.saldo);
        } else System.out.println("Não foi possivel, a conta está fechada");
    }

    public void verificarHorario() {
        if (contaAberta) {
            System.out.println("Horario atual " + this.horarioAtual + "h");
        } else System.out.println("Não foi possivel, a conta está fechada");
    }

    public void verificarInformacoes() {
        if (contaAberta) {
            System.out.println("Nome: " + this.nome);
            System.out.println("CPF: " + this.cpf);
            System.out.println("Indentificador da conta: " + this.identificadorConta);
            System.out.println("Banco: " + this.nomeBanco);
            System.out.println("Endereço: " + this.endereco);
            System.out.println("Saldo: " + this.saldo);
            System.out.println("Horario: " + this.horarioAtual);
        } else System.out.println("Não foi possivel, a conta está fechada");
    }

    //Tarefas adicionais

    public void verificarTransacoes() {
        if (contaAberta) {
            System.out.println("Histrico Da Conta:");
            System.out.println("#Identificador Conta:" + "[" + getIdentificadorConta() + "]" + " #Nome Do titular:" + getNome());
            for (Transacao transacao : historicoDeTransacoes) {
                System.out.println(transacao);
            }
        } else System.out.println("Não foi possivel, a conta está fechada");
    }

    public void alterarEndereco(String novoEndereco) {
        if (contaAberta) {
            this.endereco = novoEndereco;
        } else System.out.println("Não foi possivel, a conta está fechada");
    }

    public void manutencaoMensal(int dia) {
        if (contaAberta) {
            if (dia == 1) {
                this.saldo -= manutencaoMensalConta;
            }
        } else System.out.println("Não foi possivel, a conta está fechada");
    }

    public void calcularJuros(double taxa) {
        if (contaAberta) {
            double jurosMensais = this.saldo * (taxa / 100);
            this.saldo += jurosMensais;
            System.out.println("Juros mensais: " + jurosMensais);
        } else System.out.println("Não foi possivel, a conta está fechada");
    }

    public void fecharConta() {
        if (contaAberta) {
            this.saldo = 0;
            contaAberta = false;
            System.out.println("Conta fechada com sucesso.");
        } else System.out.println("Esta conta já esta fechada");
    }

    //getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdentificadorConta() {
        return identificadorConta;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getSaldo() {
        return saldo;
    }

    public LocalTime getHorarioAtual() {
        return horarioAtual;
    }

    public double getManutencaoMensalConta() {
        return manutencaoMensalConta;
    }

    public boolean isContaAberta() {
        return contaAberta;
    }

    public List<Transacao> getHistorico() {
        return historicoDeTransacoes;
    }

    //  setter
    public void setHorarioAtual(LocalTime horarioAtual) {
        this.horarioAtual = horarioAtual;
    }
}