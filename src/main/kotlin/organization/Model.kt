package organization

import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class Company(
        val name : String,
        @Id @GeneratedValue val id : Long? = null,
        val addedAt: LocalDateTime = LocalDateTime.now()
)

@Entity
data class Employer(

        @Id @GeneratedValue val id: Long? = null
)
