package Aula03.Exercicios.Exercicio01;

public class Conta {

    private String nome;
    private String cpf;
    private int identificadorConta;
    private String nomeBanco;
    private String endereco;
    private double saldo;
    private int horarioAtual;

    private double manutencaoMensalConta = 14.50;

    //Construtor
    public Conta(String nome, String cpf, int identificadorConta){
        this.nome = nome;
        this.cpf = cpf;
        this.identificadorConta =identificadorConta;
    }


    public void saque(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
        }
    }

    public void deposito(double valor) {
        this.saldo = this.saldo + valor;
    }

    public void pix(double valor , int hora , Conta destino){
        if (horarioAtual == hora && this.saldo>= valor){
            destino.saldo = valor;
        }
    }
    public void transferencia(Conta destino, double valor) {
        if (horarioAtual > 8 && horarioAtual < 19 && this.saldo >= valor) {
            destino.saldo = valor;
        }else System.out.println("Nao tem saldo suficiente");
    }

    public double verificarSaldo() {
        return this.saldo;
    }

    public void verificarHorario(){
            System.out.println("Horario atual " + horarioAtual+"h");
    }

    public void verificarInformacoes(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.identificadorConta);
        System.out.println(this.nomeBanco);
        System.out.println(this.endereco);
        System.out.println(this.saldo);
        System.out.println(this.horarioAtual);
    }

    //tarefas adicionais

    public void alterarEndereco(String novoEndereco){
        this.endereco = novoEndereco;
    }

    public void manutencaoMensal(int dia){
        if (dia == 1 ){
            this.saldo = this.saldo - manutencaoMensalConta;
        }
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

    //  setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdentificadorConta(int identificadorConta) {
        this.identificadorConta = identificadorConta;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setHorarioAtual(int horarioAtual) {
        this.horarioAtual = horarioAtual;
    }
}

