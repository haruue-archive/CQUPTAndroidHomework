package moe.haruue.helloworld.adapter

import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import moe.haruue.helloworld.R
import moe.haruue.helloworld.model.Chat

/**
 *
 * @author Haruue Icymoon haruue@caoyue.com.cn
 */
class ChatAdapter : RecyclerView.Adapter<ChatAdapter.ChatItemViewHolder>() {

    val chatData = arrayOf(
            Chat(R.drawable.avatar1, "你好呀"),
            Chat(R.drawable.avatar2, "你好"),
            Chat(R.drawable.avatar1, "天气好棒棒")
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatItemViewHolder {
        return ChatItemViewHolder(parent, viewType)
    }

    override fun onBindViewHolder(holder: ChatItemViewHolder, position: Int) {
        holder.avatarView.setImageResource(chatData[position].avatarRes)
        holder.messageView.text = chatData[position].text
    }

    override fun getItemCount(): Int {
        return chatData.size
    }

    override fun getItemViewType(position: Int): Int {
        return when (position) {
            0 -> R.layout.item_chat_left
            1 -> R.layout.item_chat_right
            2 -> R.layout.item_chat_left
            else -> R.layout.item_chat_right
        }
    }

    class ChatItemViewHolder(parent: ViewGroup, @LayoutRes res: Int)
        : RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(res, parent, false)) {
        val avatarView = itemView.findViewById<ImageView>(R.id.avatarView)
        val messageView = itemView.findViewById<TextView>(R.id.messageView)
    }


}