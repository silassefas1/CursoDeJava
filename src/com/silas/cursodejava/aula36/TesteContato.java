package com.silas.cursodejava.aula36;

public class TesteContato {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Tyrion");
		//contato.setEndereco("Kings Landing");
		//contato.setTelefone("11 99999-9999");
		
		//relacionamente tem um endereco
		
		Endereco end = new Endereco();
		end.setNomeRua("Game Of Thrones");
		end.setNumeroCasa("n/a");
		end.setCidade("Kings Landing");
		end.setEstado("Westeros");
		end.setComplemento("Castelo Extravagante");
		end.setCep("9999999");
		
		contato.setEndereco(end);
		
		//relacionamente tem um telefone
		
		Telefone telefone = new Telefone();
		telefone.setTipo("Celulcar");
		telefone.setNumero("9999-9999");
		telefone.setDdd("11");
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("Casa");
		telefone2.setNumero("8888-8888");
		telefone2.setDdd("11");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		
		contato.setTelefones(telefones);
		

		//contato.setTelefone(telefone);
		
		// teste saida no console

		System.out.println(contato.getNome());
		//System.out.println(contato.getEndereco().getCidade()); trecho de codigo nao seguro
		//pode dar erro por nao ter o set end
		//System.out.println(contato.getTelefone());
		
		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		/*if (contato != null && contato.getTelefone() != null) {
			System.out.println(contato.getTelefone().getDdd() + contato.getTelefone().getNumero());
		}*/
		
		if (contato != null && contato.getTelefones() != null) {
			for(Telefone t: contato.getTelefones()) {
				System.out.println(t.getNumero());
				
			}

		}
		
	}

}
