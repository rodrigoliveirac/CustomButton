package com.rodcollab.custombutton

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.rodcollab.custombutton.ui.theme.CustomButtonTheme

private val alphabet = mutableListOf(
    'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
    'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CustomButtonTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
                        Column(
                            Modifier
                                .padding(16.dp)
                                .fillMaxWidth()
                        ) {
                            Spacer(modifier = Modifier.height(16.dp))

                            alphabet.chunked(10).forEach { chars ->
                                Row(
                                    modifier = Modifier.align(Alignment.CenterHorizontally),
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    chars.forEach { char ->
                                        Card(
                                            modifier = Modifier
                                                .padding(4.dp),
                                            colors = CardDefaults.cardColors(
                                                Color(
                                                    255,
                                                    255,
                                                    255,
                                                    255
                                                )
                                            ),
                                            shape = RoundedCornerShape(12.dp),
                                            border = BorderStroke(
                                                2.dp, Color(
                                                    250,
                                                    128,
                                                    46
                                                )
                                            ),
                                            elevation = CardDefaults.cardElevation(4.dp)
                                        ) {
                                            Text(
                                                text = char.toString(),
                                                maxLines = 1,
                                                modifier = Modifier
                                                    .padding(12.dp)
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}