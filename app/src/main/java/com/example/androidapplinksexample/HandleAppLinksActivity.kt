package com.example.androidapplinksexample

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class HandleAppLinksActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_handle_app_links)

        //Handing incoming data
        val action: String? = intent?.action
        val data: Uri? = intent?.data
    }
}