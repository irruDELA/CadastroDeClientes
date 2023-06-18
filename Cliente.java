public class Cliente {
    private String nome;
    private String sobrenome;
    private int idade;
    private String endereco;
    private String email;
    
    // Construtor
    public Cliente(String nome, String sobrenome, int idade, String endereco, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.endereco = endereco;
        this.email = email;
    }
    
    // Métodos getters e setters
    // ...
    
    // Método para impressão do objeto na tela
    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco);
        System.out.println("E-mail: " + email);
        System.out.println();
    }
}
