package br.edu.utfpr.cp.espjava.crudcidades.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CidadeController {

    @GetMapping("/")
    public String listar() {
        return "crud.html";
    }
}
