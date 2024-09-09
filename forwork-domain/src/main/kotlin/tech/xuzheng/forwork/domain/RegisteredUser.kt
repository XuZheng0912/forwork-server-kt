package tech.xuzheng.forwork.domain

import org.babyfish.jimmer.sql.Entity
import org.babyfish.jimmer.sql.Id
import org.babyfish.jimmer.sql.Key

@Entity
interface RegisteredUser {
    @Id
    val id: Long

    @Key
    val username: String

    @Key
    val password: String
}