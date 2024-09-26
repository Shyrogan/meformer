package fr.sebastien.app.component

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import fr.sebastien.app.Course
import fr.sebastien.app.CourseFormat

@Composable
fun StudentCoursesScreen(courses: List<Course>) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text(text = "Cours de l'Étudiant", fontSize = 24.sp)

        Spacer(modifier = Modifier.height(16.dp))

        for (course in courses) {
            CourseItem(course = course)
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}

@Composable
fun CourseItem(course: Course) {
    Column(modifier = Modifier.padding(8.dp)) {
        Text(text = course.title, fontSize = 20.sp)
        Text(text = course.description)
        Text(text = "Format: ${course.format}", fontSize = 12.sp)
        Text(text = "Année: ${course.year}", fontSize = 12.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewStudentCoursesScreen() {
    val sampleCourses = listOf(
        Course("1", "Mathématiques", "Cours sur les nombres et les opérations.", CourseFormat.DOCUMENTS_ONLY, "2024"),
        Course("2", "Physique", "Introduction à la physique moderne.", CourseFormat.TEACHER_SUPPORT, "2024"),
        Course("3", "Chimie", "Principes de base de la chimie.", CourseFormat.DOCUMENTS_ONLY, "2024")
    )

    StudentCoursesScreen(courses = sampleCourses)
}