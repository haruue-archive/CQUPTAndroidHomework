package moe.haruue.helloworld

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_fragment_demo.*
import moe.haruue.helloworld.fragment.NewsContentFragment
import moe.haruue.helloworld.model.News

/**
 *
 * @author Haruue Icymoon haruue@caoyue.com.cn
 */
class FragmentDemoActivity : AppCompatActivity() {

    val tabletMode: Boolean
        get() = newsContentContainer != null

    val newsContentFragment = NewsContentFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_demo)
        if (tabletMode) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.newsContentContainer, newsContentFragment)
                    .commit()
        }
    }

    fun onNewsItemClick(news: News) {
        if (tabletMode) {
            newsContentFragment.changeNews(news)
        } else {
            NewsContentActivity.startActivity(this, news)
        }
    }

}