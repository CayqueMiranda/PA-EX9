package com.example.ex9.Services;

import com.example.ex9.Models.ProjetoModel;
import com.example.ex9.Repositories.ProjetoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoService {

    private ProjetoRepository projetoRepository;

    public ProjetoService(ProjetoRepository projetoRepository) {
        this.projetoRepository = projetoRepository;
    }

    public ProjetoModel criar(ProjetoModel projeto) {
        return projetoRepository.save(projeto);
    }

    public List<ProjetoModel> listar() {
        return projetoRepository.findAll();
    }

    public ProjetoModel buscarPorId(Long id) {
        return projetoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Projeto não encontrado"));
    }

    public void deletar(Long id) {
        projetoRepository.deleteById(id);
    }

}
