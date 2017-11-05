package moe.haruue.helloworld

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    companion object {
        const val EXTRA = "extra"
        const val REQ_NEW = 23333
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        text.text = "this activity started with \"${intent?.getStringExtra(EXTRA) ?: ""}\""
        buttonStart.setOnClickListener {
            val intent = Intent(this@SecondActivity, SecondActivity::class.java)
            intent.putExtra(EXTRA, edit.text.toString())
            startActivityForResult(intent, REQ_NEW)
        }
        buttonClose.setOnClickListener {
            val intent = Intent()
            intent.putExtra(EXTRA, edit.text.toString())
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }

    @SuppressLint("SetTextI18n")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            REQ_NEW -> when (resultCode) {
                Activity.RESULT_OK -> text.text = "another activity result as \"${data?.getStringExtra(EXTRA) ?: ""}\""
            }
        }

    }
}
