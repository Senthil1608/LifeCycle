package com.example.lifecycle

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lifecycle.ui.theme.LifeCycleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LifeCycleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                    Toast.makeText(applicationContext, "onCreate Called", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
    override fun onStart() {
        super.onStart()
        // Display a toast message when onStart is called
        Toast.makeText(applicationContext, "onStart Called", Toast.LENGTH_LONG).show()
    }
    override fun onRestart() {
        super.onRestart()
        // Display a toast message when onRestart is called
        Toast.makeText(applicationContext, "onRestart Called", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        // Display a toast message when onPause is called
        Toast.makeText(applicationContext, "onPause Called", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        // Display a toast message when onResume is called
        Toast.makeText(applicationContext, "onResume Called", Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        // Display a toast message when onStop is called
        Toast.makeText(applicationContext, "onStop Called", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        // Display a toast message when onDestroy is called
        Toast.makeText(applicationContext, "onDestroy Called", Toast.LENGTH_LONG).show()
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

