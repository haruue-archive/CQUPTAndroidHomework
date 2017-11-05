package moe.haruue.helloworld.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_news_content.*
import moe.haruue.helloworld.R
import moe.haruue.helloworld.model.News

/**
 *
 * @author Haruue Icymoon haruue@caoyue.com.cn
 */
class NewsContentFragment : Fragment() {

    companion object {
        const val EXTRA_TITLE = "title"
        const val EXTRA_CONTENT = "content"
    }

    val titleText by lazy { arguments?.getString(EXTRA_TITLE) }

    val contentText by lazy { arguments?.getString(EXTRA_CONTENT) }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_news_content, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (titleText != null) {
            title.text = titleText
            text1.text = contentText
        } else {
            title.text = ""
            text1.text = "请在左侧选择想要查看的新闻标题"
        }
    }

    fun changeNews(news: News) {
        title.text = news.title
        text1.text = news.content
    }

}