package we.meet.topproject.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import we.meet.topproject.R
import we.meet.topproject.model.BoardModel
import we.meet.topproject.view.adapter.BoardListAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var mBoardListAdapter: BoardListAdapter
    private val mBoardItems: ArrayList<BoardModel> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mBoardItems.run {
            add(BoardModel("1제목이에옹","상세 내용입니다.","2020-05-26",3,""))
            add(BoardModel("2제목이에옹","상세 내용입니다.","2020-05-26",3,""))
            add(BoardModel("3제목이에옹","상세 내용입니다.","2020-05-26",3,""))
            add(BoardModel("4제목이에옹","상세 내용입니다.","2020-05-26",3,""))
            add(BoardModel("5제목이에옹","상세 내용입니다.","2020-05-26",3,""))
            add(BoardModel("6제목이에옹","상세 내용입니다.","2020-05-26",3,""))
            add(BoardModel("7제목이에옹","상세 내용입니다.","2020-05-26",3,""))
            add(BoardModel("8제목이에옹","상세 내용입니다.","2020-05-26",3,""))
            add(BoardModel("9제목이에옹","상세 내용입니다.","2020-05-26",3,""))
            add(BoardModel("10제목이에옹","상세 내용입니다.","2020-05-26",3,""))
            add(BoardModel("11제목이에옹","상세 내용입니다.","2020-05-26",3,""))
            add(BoardModel("12제목이에옹","상세 내용입니다.","2020-05-26",3,""))
            add(BoardModel("13제목이에옹","상세 내용입니다.","2020-05-26",3,""))
            add(BoardModel("14제목이에옹","상세 내용입니다.","2020-05-26",3,""))
            add(BoardModel("15제목이에옹","상세 내용입니다.","2020-05-26",3,""))
            add(BoardModel("16제목이에옹","상세 내용입니다.","2020-05-26",3,""))
//https://doitddo.tistory.com/53?category=855312
        }


        initRecyclerView()
    }
    private fun initRecyclerView(){
        mBoardListAdapter = BoardListAdapter(mBoardItems)

        boardRL.run{
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter  = mBoardListAdapter
        }
    }
}
