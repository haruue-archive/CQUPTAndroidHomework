package moe.haruue.helloworld

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonIntentExtraDemo.setOnClickListener {
            startActivity(Intent(this@MainActivity, SecondActivity::class.java))
        }
        buttonLinearLayoutDemo.setOnClickListener {
            startActivity(Intent(this@MainActivity, LinearLayoutDemoActivity::class.java))
        }
        buttonCustomizeViewDemo.setOnClickListener {
            startActivity(Intent(this@MainActivity, CustomizeViewDemoActivity::class.java))
        }
        buttonChatDemo.setOnClickListener {
            startActivity(Intent(this@MainActivity, ChatDemoActivity::class.java))
        }
        buttonFragmentDemo.setOnClickListener {
            startActivity(Intent(this@MainActivity, FragmentDemoActivity::class.java))
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return when (item?.itemId) {
            R.id.item_add -> {
                Toast.makeText(this@MainActivity, "You selected Add", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.item_remove -> {
                Toast.makeText(this@MainActivity, "You selected Remove", Toast.LENGTH_SHORT).show()
                true
            }
            else -> false
        }
    }

}
