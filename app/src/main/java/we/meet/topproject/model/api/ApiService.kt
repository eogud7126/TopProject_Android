package we.meet.topproject.model.api

import retrofit2.http.GET
import retrofit2.http.Query
import io.reactivex.Observable
import java.util.*

class ApiService{
    interface BoardListlmpl {
        @GET("/board/list")
        fun getBoardList(@Query("q") query: String): Observable<BoardListResponse>
    }
}