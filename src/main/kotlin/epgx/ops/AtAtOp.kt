package epgx.ops

import org.jetbrains.exposed.sql.ComparisonOp
import org.jetbrains.exposed.sql.Expression

class AtAtOp(
        vector: Expression<*>,
        query: Expression<*>
) : ComparisonOp(vector, query, "@@")
