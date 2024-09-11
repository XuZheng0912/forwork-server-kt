package tech.xuzheng.forwork.domain

import org.babyfish.jimmer.sql.GeneratedValue
import org.babyfish.jimmer.sql.Id
import org.babyfish.jimmer.sql.MappedSuperclass
import org.babyfish.jimmer.sql.meta.UUIDIdGenerator
import java.util.*

@MappedSuperclass
interface Persistent {
    @Id
    @GeneratedValue(generatorType = UUIDIdGenerator::class)
    val id: UUID

    val metadata: Metadata
}
