package ado.com.myapplication

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

/**
 * Created by Ado on 12/01/2018.
 */
class SecondActivity : AppCompatActivity() {

    companion object {
        private const val INTENT_ACTION_NUM_CLICKS = "INTENT_ACTION_NUM_CLICKS"

        fun newIntent(context: Context, clickNumber: Int): Intent {
            val intent = Intent(context, SecondActivity::class.java)
            intent.putExtra(INTENT_ACTION_NUM_CLICKS, clickNumber)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second)
        var text = findViewById<TextView>(R.id.valueTxt);
        text.setText("" + intent.getIntExtra(INTENT_ACTION_NUM_CLICKS, 0))
    }
}