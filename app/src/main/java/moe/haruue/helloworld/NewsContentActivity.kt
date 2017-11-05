package moe.haruue.helloworld

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import moe.haruue.helloworld.fragment.NewsContentFragment
import moe.haruue.helloworld.model.News

/**
 *
 * @author Haruue Icymoon haruue@caoyue.com.cn
 */
class NewsContentActivity : AppCompatActivity() {

    companion object {
        fun startActivity(context: Context, news: News) {
            val intent = Intent(context, NewsContentActivity::class.java)
            intent.putExtra(NewsContentFragment.EXTRA_TITLE, news.title)
            intent.putExtra(NewsContentFragment.EXTRA_CONTENT, news.content)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_content)
        val fragment = NewsContentFragment()
        val bundle = Bundle()
        bundle.putString(NewsContentFragment.EXTRA_TITLE, intent.getStringExtra(NewsContentFragment.EXTRA_TITLE))
        bundle.putString(NewsContentFragment.EXTRA_CONTENT, intent.getStringExtra(NewsContentFragment.EXTRA_CONTENT))
        fragment.arguments = bundle
        supportFragmentManager.beginTransaction()
                .replace(R.id.newsContentContainer, fragment)
                .commit()
    }


}