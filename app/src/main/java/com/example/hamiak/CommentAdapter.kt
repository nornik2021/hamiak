package com.example.hamiak

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CommentAdapter(
    private val comments: List<Comment>
) : RecyclerView.Adapter<CommentAdapter.CommentViewHolder> () {

    class CommentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) { // создаем вьюхолдер

        private val userNumberView: TextView
        private val commentTextView: TextView

        init {
            userNumberView = itemView.findViewById(R.id.userNumber)
            commentTextView = itemView.findViewById(R.id.commentText)
        }
        @SuppressLint("SetTextI18n")
        fun bind(model: Comment) {
            userNumberView.text = "#${model.userNumber}"
            commentTextView.text = model.commentText
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.comment_view, parent, false)
        return CommentViewHolder(view)
    }

    override fun onBindViewHolder(holder: CommentViewHolder, position: Int) {
        holder.bind(comments[position])
    }

    override fun getItemCount() = comments.size
}


