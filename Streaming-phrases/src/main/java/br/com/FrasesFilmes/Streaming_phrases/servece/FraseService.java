package br.com.FrasesFilmes.Streaming_phrases.servece;

import br.com.FrasesFilmes.Streaming_phrases.Dto.FraseDTO;
import br.com.FrasesFilmes.Streaming_phrases.model.Frase;
import br.com.FrasesFilmes.Streaming_phrases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repository;

    public FraseDTO obterfaseAleatoria() {
        Frase frase = repository.buscaFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
