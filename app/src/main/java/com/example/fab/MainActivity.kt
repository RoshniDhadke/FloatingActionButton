package com.example.fab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    lateinit var addfab: FloatingActionButton
    lateinit var alarmfab: FloatingActionButton
    lateinit var taskfab: FloatingActionButton
    lateinit var alarmtext: TextView
    lateinit var tasktext: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addfab = findViewById(R.id.add_fab)
        alarmfab = findViewById(R.id.alarm_fab)
        taskfab = findViewById(R.id.task_fab)
        alarmtext = findViewById(R.id.alarm_text)
        tasktext = findViewById(R.id.task_text)
        alarmfab.visibility = View.GONE
        alarmtext.visibility = View.GONE
        taskfab.visibility = View.GONE
        tasktext.visibility = View.GONE
        var fabVisible = false
        addfab.setOnClickListener(View.OnClickListener {
            ( if (!fabVisible!!) {
                alarmfab.show()
                alarmtext.visibility = View.VISIBLE
                taskfab.show()
                tasktext.visibility = View.VISIBLE
                true
            } else {
                alarmfab.hide()
                alarmtext.visibility = View.GONE
                taskfab.hide()
                tasktext.visibility = View.GONE
                false
            }).also { fabVisible=it }
        })
    }
}