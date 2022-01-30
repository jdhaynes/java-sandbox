package jackhaynes.javasandbox.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TranslationController {
    @GetMapping("/heartbeat")
    public String heartbeat() {
        return "Service OK.";
    }
}
