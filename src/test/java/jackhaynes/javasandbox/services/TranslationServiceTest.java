package jackhaynes.javasandbox.services;

import jackhaynes.javasandbox.dtos.Translation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TranslationServiceTest {

    @Test
    void translate() {
        TranslationEngineMock engineMock = new TranslationEngineMock();
        TranslationService service = new TranslationService(engineMock);
        Translation actual = service.translate("Hello", "en", "es");
        Translation expected = new Translation("en", "es", "Hello", "Translated");

        assertEquals(expected, actual);
    }
}