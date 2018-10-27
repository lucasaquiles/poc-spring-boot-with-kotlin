package organization

import com.samskivert.mustache.Mustache
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean


@SpringBootApplication
class OrganizationApplication {

    @Bean
    fun mustacheCompiler(loader: Mustache.TemplateLoader?) =
            Mustache.compiler().escapeHTML(false).withLoader(loader)

    @Bean
    fun databaseInitializer(companyRepository: CompanyRepository) = CommandLineRunner {

        companyRepository.save(Company(
                "Reactor Bismuth is out",
                1
        ))
        companyRepository.save(Company(
                "Reactor Aluminium has landed",
                2
        ))
    }
}
fun main(args: Array<String>){

    runApplication<OrganizationApplication>(*args)
}