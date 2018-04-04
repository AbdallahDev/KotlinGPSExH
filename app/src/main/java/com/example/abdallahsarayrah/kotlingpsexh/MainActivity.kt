package com.example.abdallahsarayrah.kotlingpsexh

import android.content.Context
import android.content.Intent
import android.location.LocationManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_gps.setOnClickListener {
            val manager = getSystemService(Context.LOCATION_SERVICE) as LocationManager

            if (manager.isProviderEnabled(LocationManager.GPS_PROVIDER))
                button_gps.text = "is enabled"
            else {
                val i = Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS)
                startActivity(i)
            }
        }

        button.setOnClickListener {
            val i = Intent(this, Main2Activity::class.java)
            startActivity(i)
        }
    }
}
