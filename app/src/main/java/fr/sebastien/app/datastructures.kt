package fr.sebastien.app

data class Parent(
    val id: String,
    val name: String,
    val email: String,
    val password: String,
    val children: List<Student>
)

data class Student(
    val id: String,
    val name: String,
    val relationshipToParent: String,
    val gradeLevel: String,
    val schoolYear: List<String>
)

data class Course(
    val id: String,
    val title: String,
    val description: String,
    val format: CourseFormat,
    val year: String
)

enum class CourseFormat {
    DOCUMENTS_ONLY,
    TEACHER_SUPPORT
}

data class CourseDetail(
    val id: String,
    val title: String,
    val description: String,
    val content: List<String>,
    val exercises: List<String>,
    val format: CourseFormat,
    val year: String
)

data class PaymentOption(
    val id: String,
    val type: PaymentType,
    val details: String
)

enum class PaymentType {
    CREDIT_CARD,
    DIRECT_DEBIT
}

data class User(
    val id: String,
    val userType: UserType,
    val login: String,
    val password: String
)

enum class UserType {
    PARENT,
    STUDENT
}

data class ActivityLog(
    val studentId: String,
    val activityType: ActivityType,
    val timestamp: Long
)

enum class ActivityType {
    COURSE_VIEW,
    EXERCISE_COMPLETION,
    LOGIN
}

data class Recommendation(
    val studentId: String,
    val advice: String,
    val timestamp: Long
)
