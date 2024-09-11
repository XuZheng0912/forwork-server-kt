package tech.xuzheng.forwork.domain

import org.babyfish.jimmer.sql.Entity
import org.babyfish.jimmer.sql.Key
import org.babyfish.jimmer.sql.ManyToOne
import java.time.LocalDateTime

@Entity
interface DailyEvent : Persistent {

    @Key
    val startTime: LocalDateTime

    @Key
    val endTime: LocalDateTime

    val content: String;

    @ManyToOne
    @Key
    val journal: DailyJournal
}