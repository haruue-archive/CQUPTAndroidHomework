package moe.haruue.helloworld.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_news_list.*
import moe.haruue.helloworld.FragmentDemoActivity
import moe.haruue.helloworld.R
import moe.haruue.helloworld.adapter.NewsAdapter
import moe.haruue.helloworld.model.News

/**
 *
 * @author Haruue Icymoon haruue@caoyue.com.cn
 */
class NewsListFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_news_list, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = NewsAdapter(this::onNewsItemClick)
        newsListRecycler.layoutManager = LinearLayoutManager(activity)
        newsListRecycler.adapter = adapter
    }

    fun onNewsItemClick(news: News) {
        (activity as FragmentDemoActivity).onNewsItemClick(news)
    }

}