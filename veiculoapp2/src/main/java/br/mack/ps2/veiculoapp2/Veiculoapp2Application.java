package br.mack.ps2.veiculoapp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Veiculoapp2Application {

	@Autowired
	private ProprietarioDAO propDAO;

	public static void main(String[] args) {
		SpringApplication.run(Veiculoapp2Application.class, args);
	}

	public void run(String... args) throws Exception {
		Proprietario p = new Proprietario();
		p.setCpf("888888888");
		p.setNome("Joana");
		//this.proprietarioDAO

	}

}
