public class Main {
    public static void main(String[] args) {
        // Criando um objeto Cliente
        Cliente cliente1 = new Cliente("João", "Silva", 30, "Rua A", "joao@example.com");
        
        // Instanciando a classe CadastroCliente
        CadastroCliente<Cliente> cadastro = new CadastroCliente<>();
        
        // Cadastrando o cliente
        cadastro.cadastrarCliente(cliente1);
    }
}
