package tech.xuzheng.forwork.domain

import org.babyfish.jimmer.sql.Embeddable
import java.time.LocalDateTime

@Embeddable
interface Metadata {
    val createTime: LocalDateTime

    val updateTime: LocalDateTime
}