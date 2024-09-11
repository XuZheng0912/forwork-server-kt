package tech.xuzheng.forwork

import org.babyfish.jimmer.sql.kt.KSqlClient
import org.babyfish.jimmer.sql.kt.ast.expression.eq
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import tech.xuzheng.forwork.domain.*
import java.time.LocalDateTime

@SpringBootTest
class ForworkServerKtApplicationTests(
    @Autowired private val sqlClient: KSqlClient
) {

    @Test
    fun contextLoads() {
        val now = LocalDateTime.now()
        val registeredUser = RegisteredUser {
            username = "admin"
            password = "admin"
            metadata {
                createTime = now
                updateTime = now
            }
        }
        sqlClient.save(registeredUser)
    }
}
