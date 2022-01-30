package jackhaynes.javasandbox.services;

import jackhaynes.javasandbox.dtos.Translation;
import jackhaynes.javasandbox.infrastructure.TranslationEngine;

public class TranslationService {
    private final TranslationEngine engine;

    public TranslationService(TranslationEngine translationEngine) {
        engine = translationEngine;
    }

    public Translation translate(String text, String languageFrom, String languageTo) {
        return null;
    }
}
