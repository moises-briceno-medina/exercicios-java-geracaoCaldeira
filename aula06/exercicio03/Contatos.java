
package aula06.exercicio03;

public class Contatos {
    private String numeroDeTelefone;
    private String nome;
    private String endereco;
    private String localidade;

    public Contatos( String nome,String numeroDeTelefono, String endereco, String localDaCidade) {
        this.numeroDeTelefone = numeroDeTelefono;
        this.nome = nome;
        this.endereco = endereco;
        this.localidade = localDaCidade;
    }

    public String getNumeroDeTelefone() {
        return numeroDeTelefone;
    }

    public String getNome() {
        return nome;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return  "Nome: " + nome + ", Telefone: " + numeroDeTelefone + ", Endereco: " + endereco + ", localidade: " + localidade;
    }
}
