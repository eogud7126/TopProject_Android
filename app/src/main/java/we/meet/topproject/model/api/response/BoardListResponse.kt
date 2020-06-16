package we.meet.topproject.model.api

import com.google.gson.annotations.SerializedName
import we.meet.topproject.model.BoardModel

class BoardListResponse{
    @SerializedName("list")
    val boarditems: List<BoardModel> = listOf()
}