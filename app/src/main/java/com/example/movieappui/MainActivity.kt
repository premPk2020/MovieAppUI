package com.example.movieappui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.movieappui.navigation.MovieNavigation
import com.example.movieappui.navigation.screens.home.MainContent
import com.example.movieappui.ui.theme.MovieAppUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                MovieNavigation()
            }
        }
    }
}


@Composable
fun MyApp(content: @Composable () -> Unit) {
    MovieAppUITheme {
        content()
    }
}

@Preview(showBackground = true)
@Composable
fun MainContentPreview() {
    MyApp {
        MovieNavigation()
    }
}

