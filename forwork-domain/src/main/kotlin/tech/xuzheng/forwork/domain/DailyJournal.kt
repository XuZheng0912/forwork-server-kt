package tech.xuzheng.forwork.domain

import org.babyfish.jimmer.sql.Entity
import org.babyfish.jimmer.sql.Key
import org.babyfish.jimmer.sql.OneToMany
import java.time.LocalDate

@Entity
interface DailyJournal : Persistent {

    @Key
    val user: RegisteredUser

    @Key
    val date: LocalDate

    @OneToMany(mappedBy = "journal")
    val events: List<DailyEvent>
}