package fr.sebastien.app.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun UserSelectionScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Choisissez votre profil", fontSize = 24.sp)

        Button(
            modifier = Modifier.padding(top = 16.dp),
            onClick = { navController.navigate("registration/Parent") }
        ) {
            Text(text = "Parent")
        }

        Button(
            modifier = Modifier.padding(top = 16.dp),
            onClick = { navController.navigate("registration/Élève") }
        ) {
            Text(text = "Élève")
        }
    }
}