package Aula03.Exercicios.Exercicio01;

public class Conta {

    private String nome;
    private String cpf;
    private int identificadorConta;
    private String nomeBanco;
    private String endereco;
    private double saldo;
    private int horarioAtual;
    private double manutencaoMensalConta = 15;
    private boolean contaAberta;

    //Construtor
    public Conta(String nome, String cpf, int identificadorConta, String nomeBanco, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
//        this.identificadorConta = (int) ((Math.random() * 100) + 1);
        this.contaAberta = true;
        this.saldo = 0;
    }


    public void saque(double valor) {

        if (contaAberta == true) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
            } else System.out.println("Saldo insuficiente.");
        } else System.out.println("Não é possível fazer saques, a conta está fechada");
    }

    public void deposito(double valor) {
        if (contaAberta == true) {
            this.saldo += valor;
        } else System.out.println("Não é possível fazer depositos, a conta está fechada");
    }

    public void pix(double valor, Conta destino, int hora) {
        if (contaAberta == true) {
            if (horarioAtual == hora && this.saldo >= valor && destino.contaAberta) {
                destino.saldo += valor;
                this.saldo -= valor;
            } else System.out.println("Não foi possível realizar o pix");
        } else System.out.println("Não é possível fazer pix, a conta está fechada");
    }

    public void transferencia(Conta destino, double valor) {
        if (contaAberta = true) {
            if (horarioAtual >= 8 && horarioAtual <= 19 && this.saldo >= valor && destino.contaAberta) {
                destino.saldo += valor;
                this.saldo -= valor;
            } else System.out.println("Não foi possível realizar a transferencia");
        } else System.out.println("Não é possível fazer transferencia, a conta está fechada");
    }

    public void verificarSaldo() {
        if (contaAberta) {
            System.out.println("Saldo atual R$: " + this.saldo);
        } else System.out.println("Não foi possivel, a conta está fechada");
    }

    public void verificarHorario() {
        if (contaAberta == true) {
            System.out.println("Horario atual " + this.horarioAtual + "h");
        } else System.out.println("Não foi possivel, a conta está fechada");
    }

    public void verificarInformacoes() {
        if (contaAberta == true) {
            System.out.println(this.nome);
            System.out.println(this.cpf);
            System.out.println(this.identificadorConta);
            System.out.println(this.nomeBanco);
            System.out.println(this.endereco);
            System.out.println(this.saldo);
            System.out.println(this.horarioAtual);
        } else System.out.println("Não foi possivel, a conta está fechada");
    }

    //tarefas adicionais

    public void alterarEndereco(String novoEndereco) {
        if (contaAberta == true) {
            this.endereco = novoEndereco;
        } else System.out.println("Não foi possivel, a conta está fechada");
    }

    public void manutencaoMensal(int dia) {
        if (contaAberta == true) {
            if (dia == 1) {
                this.saldo -= manutencaoMensalConta;
            }
        } else System.out.println("Não foi possivel, a conta está fechada");
    }

    public void fecharConta() {
        if (contaAberta = true) {
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

    public int getHorarioAtual() {
        return horarioAtual;
    }

    public double getManutencaoMensalConta() {
        return manutencaoMensalConta;
    }

    public boolean isContaAberta() {
        return contaAberta;
    }

    //  setter
    public void setHorarioAtual(int horarioAtual) {
        this.horarioAtual = horarioAtual;
    }
}

