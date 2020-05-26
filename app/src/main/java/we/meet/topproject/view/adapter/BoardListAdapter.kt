package we.meet.topproject.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import we.meet.topproject.R
import we.meet.topproject.model.BoardModel

class BoardListAdapter (val boarditem: ArrayList<BoardModel>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun getItemCount(): Int {
        return boarditem.size
    }

    class BoardViewHolder(view: View): RecyclerView.ViewHolder(view) {
        fun bind(boardModel: BoardModel){

        }
    }//class BoardViewHolder

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_board, parent, false)
        val viewHolder = BoardViewHolder(view)

        return viewHolder
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val boardModel = boarditem[position]

        val boardViewHolder = holder as BoardViewHolder
        boardViewHolder.bind(boardModel)
    }

}