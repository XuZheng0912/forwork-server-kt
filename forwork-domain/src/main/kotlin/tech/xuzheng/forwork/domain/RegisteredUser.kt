package tech.xuzheng.forwork.domain

import org.babyfish.jimmer.sql.*
import org.babyfish.jimmer.sql.meta.UUIDIdGenerator

@Entity
interface RegisteredUser : Persistent {

    @Key
    val username: String

    val password: String
}


