package edu.infnet.Joao_Ramos_TP1_OlaService;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaController {
    
    @Value("${default_lang:sinadrin}")
    private String default_lang;

    private static final Map<String, String> OLA_MUNDO_MAP = Map.of(
        "pt", "Olá Mundo",          // portugues
        "en", "Hello World",        // ingles
        "es", "Hola Mundo",         // espanhol
        "de", "Hallo Welt",         // alemao
        "it", "Ciao Mondo",         // italiano
        "zu", "Sawubona Mhlaba",    // zulu
        "jv", "Halo Donya",         // javanes
        "sinadrin", "Suilad ambar"  // sinadrin
    );

    @GetMapping("/")
    public String olaMundo() {
        return OLA_MUNDO_MAP.get(default_lang);
    }

    @GetMapping("/{lang}")
    public String olaMundo(@PathVariable String lang) {
        return OLA_MUNDO_MAP.getOrDefault(lang.toLowerCase(), OLA_MUNDO_MAP.get(default_lang));
    }
}
