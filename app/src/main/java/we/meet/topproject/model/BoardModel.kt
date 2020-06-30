package we.meet.topproject.model

import java.sql.Timestamp

data class BoardModel (
    var num: Int,
    var name: String,
    var passwd: String,
    var subject: String,
    var content: String,
    var ip: String,
    var reg_date: Timestamp,
    var readcount: Int,
    var filename: String)
{
}
