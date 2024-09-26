package fr.sebastien.app.component

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import fr.sebastien.app.CourseDetail
import fr.sebastien.app.CourseFormat

@Composable
fun CourseDetailScreen(courseDetail: CourseDetail) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text(text = courseDetail.title, fontSize = 24.sp)

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "Description:", fontSize = 18.sp)
        Text(text = courseDetail.description)

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Contenu:", fontSize = 18.sp)
        courseDetail.content.forEach { item ->
            Text(text = "- $item")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Exercices:", fontSize = 18.sp)
        courseDetail.exercises.forEach { exercise ->
            Text(text = "- $exercise")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Format: ${courseDetail.format}", fontSize = 12.sp)
        Text(text = "Année: ${courseDetail.year}", fontSize = 12.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCourseDetailScreen() {
    val sampleCourseDetail = CourseDetail(
        id = "1",
        title = "Mathématiques",
        description = "Cours sur les nombres et les opérations.",
        content = listOf("Nombres entiers", "Nombres rationnels", "Opérations de base"),
        exercises = listOf("Exercice 1", "Exercice 2", "Exercice 3"),
        format = CourseFormat.DOCUMENTS_ONLY,
        year = "2024"
    )

    CourseDetailScreen(courseDetail = sampleCourseDetail)
}
