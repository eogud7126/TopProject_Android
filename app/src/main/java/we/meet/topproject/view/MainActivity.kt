package we.meet.topproject.view

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.add_board.view.*
import we.meet.topproject.R
import we.meet.topproject.model.BoardModel
import we.meet.topproject.view.adapter.BoardListAdapter
import java.util.Date

class MainActivity : AppCompatActivity() {

    private lateinit var mBoardListAdapter: BoardListAdapter
    private val mBoardItems: ArrayList<BoardModel> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mBoardItems.run {
            add(BoardModel("1제목이에옹","상세 내용입니다.", Date().time,3,""))
            add(BoardModel("2제목이에옹","상세 내용입니다.",202005261111,3,""))
            add(BoardModel("3제목이에옹","상세 내용입니다.",202005261111,3,""))
            add(BoardModel("4제목이에옹","상세 내용입니다.",202005261111,3,""))
        }

        initRecyclerView()
        initAddButton()
    }
    private fun initRecyclerView(){
        mBoardListAdapter = BoardListAdapter(mBoardItems){
            //클릭이벤트
//            val intent = Intent(this,)
            Toast.makeText(this,"${it.title} 클릭됨",Toast.LENGTH_LONG).show()
        }

        boardRL.run{
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter  = mBoardListAdapter
        }
    }
    private fun initAddButton(){
        newFAB.setOnClickListener {
            openAddBoardDialog()
        }
    }

    private fun openAddBoardDialog() {
        val dialogView = layoutInflater.inflate(R.layout.add_board,null)
        val dialog = AlertDialog.Builder(this)
            .setTitle("추가하기")
            .setView(dialogView)
            .setPositiveButton("확인",{dialogInterface, i ->
                val title = dialogView.et_title.text.toString()
                val description = dialogView.et_description.text.toString()
                val createdDate = Date().time

                val boardModel = BoardModel(title,description,createdDate,0,"")
                mBoardListAdapter.addItem(boardModel)
                mBoardListAdapter.notifyDataSetChanged()
            })
            .setNegativeButton("취소",null)
            .create()
        dialog.show()
    }
}
