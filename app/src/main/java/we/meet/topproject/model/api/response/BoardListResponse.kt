package we.meet.topproject.model.api

import com.google.gson.annotations.SerializedName
import we.meet.topproject.model.BoardModel
import java.sql.Timestamp

class BoardListResponse{
    @SerializedName("num")
    var num: Int = 0
    @SerializedName("list")
    val list: List<BoardModel> = listOf()
//    @SerializedName("name")
//    lateinit var name: String
//    @SerializedName("passwd")
//    lateinit var passwd: String
//    @SerializedName("subject")
//    lateinit var subject: String
//    @SerializedName("content")
//    lateinit var content: String
//    @SerializedName("ip")
//    lateinit var ip: String
//    @SerializedName("reg_date")
//    lateinit var reg_date: Timestamp
//    @SerializedName("readcount")
//    var readcount: Int = 0
//
//    @SerializedName("filename")
//    lateinit var filename: String
}