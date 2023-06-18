public class CadastroCliente<T extends Cliente> {
    private T cliente;
    
    public void cadastrarCliente(T cliente) {
        this.cliente = cliente;
        // Realiza ações de cadastro, como inserir o cliente em um banco de dados
        // ...
        
        // Chama o método de impressão do objeto na tela
        cliente.imprimir();
    }
}
