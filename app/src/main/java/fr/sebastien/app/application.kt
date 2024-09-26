package fr.sebastien.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import fr.sebastien.app.component.RegistrationScreen
import fr.sebastien.app.component.UserSelectionScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainApp()
        }
    }
}

@Composable
fun MainApp() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "userSelection") {
        composable("userSelection") { UserSelectionScreen(navController) }
        composable("registration/{userType}") { backStackEntry ->
            RegistrationScreen(
                navController,
                backStackEntry.arguments?.getString("userType") ?: "Unknown"
            )
        }
    }
}

