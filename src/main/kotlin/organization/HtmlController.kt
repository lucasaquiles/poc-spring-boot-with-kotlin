package organization

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController(private val repository: CompanyRepository){

    @GetMapping("/")
    fun organization(model:Model):String {
        model["title"] = "Organization"
        model["companies"] = repository.findAllByOrderByAddedAtDesc().map { it.name }
        return "organization"
    }
}