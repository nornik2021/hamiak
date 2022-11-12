package com.example.hamiak

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random

class CommentsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comments)

        val recycler = findViewById<RecyclerView>(R.id.commentsList)
        val comments = listOf(
            "Вот так новость!",
            "Мне эта новость очень понравилась",
            "Отстой, хомячьи новости уже не те!",
            "Супер!",
            "Когда уже следующий выпуск?",
            "Верните стену!",
            "Приятно читать, благодарю!",
            "Сала уронили, хероям Сала"
        )
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = CommentAdapter(
            comments = List(100) {
                Comment(
                    Random.nextInt(1, 10_000),
                    comments[Random.nextInt(0, comments.size)]
                )
            }
        )
    }
}
