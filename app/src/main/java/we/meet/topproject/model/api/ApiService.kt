package we.meet.topproject.model.api

import retrofit2.http.GET
import retrofit2.http.Query
import io.reactivex.Observable
import we.meet.topproject.RetrofitCreator
import java.util.*

class ApiService{
    interface BoardListlmpl {
        @GET("list")
        fun getBoardList(): Observable<BoardListResponse>
    }
    companion object{
        fun getBoardList(): Observable<BoardListResponse>{
            return RetrofitCreator.create(BoardListlmpl::class.java).getBoardList()
        }
    }
}