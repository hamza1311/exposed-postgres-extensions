package epgx.functions

import epgx.ops.AtAtOp
import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.CustomFunction

@Suppress("FunctionName")
infix fun <T> Column<T>.`@@`(tsQuery: CustomFunction<*>): AtAtOp =
        AtAtOp(this, tsQuery)
