package servico;

import modelo.Cliente;

public class AtivacaoClienteServico {
	public  void ativar(Cliente cliente) {
		System.out.println(cliente.getNome() + "Seu cadastro esta ativo");
	}
}
