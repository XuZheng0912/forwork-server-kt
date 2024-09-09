package tech.xuzheng.forwork

import org.babyfish.jimmer.sql.kt.KSqlClient
import org.babyfish.jimmer.sql.kt.ast.expression.eq
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import tech.xuzheng.forwork.domain.RegisteredUser

@SpringBootTest
class ForworkServerKtApplicationTests(
    @Autowired private val sqlClient: KSqlClient
) {

    @Test
    fun contextLoads() {
    }
}
