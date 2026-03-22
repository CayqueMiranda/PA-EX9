package com.example.ex9.Controller;

import com.example.ex9.Models.ProjetoModel;
import com.example.ex9.Services.ProjetoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {

    ProjetoService  projetoService;

    public ProjetoController(ProjetoService service) {
        this.projetoService = service;
    }

    @PostMapping
    public ProjetoModel criar(@RequestBody ProjetoModel projeto) {
        return projetoService.criar(projeto);
    }

    @GetMapping
    public List<ProjetoModel> listar() {
        return projetoService.listar();
    }

    @GetMapping("/{id}")
    public ProjetoModel buscar(@PathVariable Long id) {
        return projetoService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        projetoService.deletar(id);
    }

}
