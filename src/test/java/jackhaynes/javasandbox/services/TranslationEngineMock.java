package jackhaynes.javasandbox.services;

import jackhaynes.javasandbox.dtos.Translation;
import jackhaynes.javasandbox.infrastructure.TranslationEngine;

public class TranslationEngineMock implements TranslationEngine {
    @Override
    public String translate(String text, String languageFrom, String languageTo) {
        return "Translated";
    }
}
