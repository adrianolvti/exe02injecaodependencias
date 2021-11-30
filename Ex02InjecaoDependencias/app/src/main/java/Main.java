public class Main {
  
  public static void main(String[] args) {
  
    Cliente joao = new Cliente("Joao", "joao@xyz.com", "1111111");
    Cliente maria = new Cliente( "Maria", "maria@abc.com", "2222222");
    
    AtivacaoClienteServico ativacaoCliente = new AtivacaoClienteServico();
    ativacaoCliente.ativar(joao);
    ativacaoCliente.ativar(maria);
  }
}