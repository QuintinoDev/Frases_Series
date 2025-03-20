package br.com.FrasesFilmes.Streaming_phrases.controller;

import br.com.FrasesFilmes.Streaming_phrases.Dto.FraseDTO;
import br.com.FrasesFilmes.Streaming_phrases.servece.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    @Autowired
    private FraseService service;

    @GetMapping("/series/frases")
    public FraseDTO obterFraseAleatoria(){
        return service.obterfaseAleatoria();
    }
}
