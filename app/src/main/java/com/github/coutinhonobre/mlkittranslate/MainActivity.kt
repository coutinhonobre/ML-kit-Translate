package com.github.coutinhonobre.mlkittranslate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.coutinhonobre.mlkittranslate.databinding.ActivityMainBinding
import com.github.coutinhonobre.mlkittranslate.main.MainFragment

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(binding.container.id, MainFragment.newInstance())
                .commitNow()
        }
    }
}
