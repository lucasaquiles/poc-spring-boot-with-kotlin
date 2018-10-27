package organization

import org.springframework.data.repository.CrudRepository


interface CompanyRepository : CrudRepository<Company, Long> {
    fun findAllByOrderByAddedAtDesc(): Iterable<Company>
}

interface EmployerRepository : CrudRepository<Employer, Long>

