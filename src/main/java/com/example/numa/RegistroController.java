package com.example.numa;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/registros")
@CrossOrigin(origins = {
        "http://localhost:5173",
        "https://numa-bogota-wellness.lovable.app"
})
public class RegistroController {

    private final RegistroRepository repository;

    public RegistroController(RegistroRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Registro> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Registro guardar(@RequestBody Registro registro) {
        return repository.save(registro);
    }
}
