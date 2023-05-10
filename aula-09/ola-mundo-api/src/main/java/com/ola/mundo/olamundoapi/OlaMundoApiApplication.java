package com.ola.mundo.olamundoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OlaMundoApiApplication {

	public static void main(String[] args) {
    SpringApplication.run(OlaMundoApiApplication.class, args);
	}

	@GetMapping("/")
	public String olaMundo() {
		return "Olá, Mundo";
	}

  @GetMapping("/nome")
  public String olaFulano(@RequestParam(value = "name", defaultValue = "aluno") String nome) {
    return "Olá, " + nome;
  }

  @PostMapping("/")
  public String olaFulanoPost(@RequestParam(value = "name", defaultValue = "aluno") String nome) {
    return "Olá, " + nome;
  }

  @GetMapping("/{name}")
  public String olaFulanoPlaceholder(@PathVariable("name") String nome) {
    return "Olá, " + nome;
  }

  @PostMapping("/nomejson")
  public String olaFulanoJson(@RequestBody Pessoa dados) {
    return "Olá, " + dados.getNome();
  }

}
