package com.example.tablelayouttest

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableRow
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.widget.Space


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener {
            val tableRow = TableRow(applicationContext)
            val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
            layoutParams.setMargins(0,4,0,4)
//            tableRow.layoutParams = layoutParams

            if (!txtVersion.text.isEmpty() and !txtCode.text.isEmpty()){

                val textView1 = TextView(applicationContext)
                textView1.layoutParams=layoutParams
                textView1.setBackgroundColor(Color.parseColor("#D81B60"))
                textView1.setText(txtVersion.text)
                val textView2 = TextView(applicationContext)
                val space=Space(applicationContext)
                textView2.setText(txtCode.text)

                textView2.layoutParams=layoutParams
                textView2.setBackgroundColor(Color.parseColor("#D81B60"))
                tableRow.addView(textView1,0)
                tableRow.addView(textView2,1)
                layoutId.addView(tableRow,layoutParams)
                layoutId.addView(space)
            }

        }
    }
}
