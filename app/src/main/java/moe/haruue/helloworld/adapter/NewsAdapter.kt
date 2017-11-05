package moe.haruue.helloworld.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import moe.haruue.helloworld.R
import moe.haruue.helloworld.model.News

/**
 *
 * @author Haruue Icymoon haruue@caoyue.com.cn
 */
class NewsAdapter(
        val onNewsItemClick: (news: News) -> Unit
) : RecyclerView.Adapter<NewsAdapter.NewsItemViewHolder>() {

    val newsList = listOf(
            News("大新闻", "你们不要总想搞个大新闻"),
            News("又是一个大新闻", "你们不能见得风是得雨"),
            News("还是一个大新闻", "报道出了偏差是要负责任的")
    )

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): NewsItemViewHolder {
        return NewsItemViewHolder(parent!!)
    }

    override fun onBindViewHolder(holder: NewsItemViewHolder, position: Int) {
        holder.title.text = newsList[position].title
        holder.itemView.setOnClickListener { onNewsItemClick(newsList[position]) }
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    class NewsItemViewHolder(parent: ViewGroup)
        : RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)) {
        val title = itemView.findViewById<TextView>(android.R.id.title)!!
    }

}