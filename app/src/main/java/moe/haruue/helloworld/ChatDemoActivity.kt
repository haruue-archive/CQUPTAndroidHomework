package moe.haruue.helloworld

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_chat_demo.*
import moe.haruue.helloworld.adapter.ChatAdapter

class ChatDemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_demo)
        chatRecyclerView.layoutManager = LinearLayoutManager(this@ChatDemoActivity)
        chatRecyclerView.adapter = ChatAdapter()
    }
}
