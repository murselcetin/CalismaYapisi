package com.example.calismayapisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.calismayapisi.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)


        tasarim.buttonBasla.setOnClickListener {
            //Snackbar.make(it, "Merhaba", Snackbar.LENGTH_SHORT).show()
            val intent = Intent(this@MainActivity, OyunEkraniActivity::class.java)
            intent.putExtra("ad", "Ahmet")
            intent.putExtra("yas", 23)
            intent.putExtra("boy", 1.78)
            intent.putExtra("bekar", true)

            val kisi = Kisiler("Mehmet", 34, 1.97, false)
            intent.putExtra("nesne", kisi)
            startActivity(intent)
        }

        Log.e("Yaşam Döngüsü", "onCreate Çalıştı")
    }

    override fun onStart() {
        super.onStart()
        Log.e("Yaşam Döngüsü", "onStart Çalıştı")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Yaşam Döngüsü", "onResume Çalıştı")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Yaşam Döngüsü", "onPause Çalıştı")
    }

    override fun onStop() {
        super.onStop()
        Log.e("Yaşam Döngüsü", "onStop Çalıştı")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Yaşam Döngüsü", "onDestroy Çalıştı")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("Yaşam Döngüsü", "onRestart Çalıştı")
    }

}