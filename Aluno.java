public class Aluno {

    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setidade(int idade) {
        if (idade>0 && idade<110) {
            this.idade = idade;
            System.out.println("Idade cadastrada com sucesso!");
        }
        else {
            System.out.println("Error 404");
        }
        this.idade = idade;
    }
    
    public int getidade() {
        return idade;
    }
}
