package ru.netology.statsview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.netology.statsview.ui.StatsView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<StatsView>(R.id.statsView).data = listOf(
            0.25f,
            0.25f,
            0.25f,
            0.25f,
        )
    }
}