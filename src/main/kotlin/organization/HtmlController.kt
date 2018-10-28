package organization

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HtmlController(private val repository: CompanyRepository){

    @GetMapping("/organization")
    fun organization(model:Model): Model {
        model["title"] = "Organization"
        model["companies"] = repository.findAllByOrderByAddedAtDesc().map { it.name }
        return model;
    }
}