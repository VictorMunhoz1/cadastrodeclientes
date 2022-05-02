package repositories;

import java.io.File;
import java.io.PrintWriter;

import entities.Cliente;

public class ClienteRepository {

	//método para gravar os dados do cliente em um arquivo
	public void exportarDados(Cliente cliente) throws Exception {
		
		//Criando um arquivo na máquina do usuário
		PrintWriter print = new PrintWriter(new File("c:\\temp\\cliente.txt"));
		
		//escrever os dados do arquivo
		print.write("\nID......: " + cliente.getIdCliente());
		print.write("\nNOME....: " + cliente.getNome());
		print.write("\nCPF.....: " + cliente.getCpf());
		print.write("\nEMAIL...: " + cliente.getEmail());
		
		//salvando e fechando o arquivo..
		print.flush();
		print.close();
	}
	
}


