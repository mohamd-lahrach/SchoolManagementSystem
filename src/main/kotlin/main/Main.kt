package main

import com.google.auth.oauth2.GoogleCredentials
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import java.io.FileInputStream

fun main(args: Array<String>) {
    val serviceAccount = FileInputStream("src/main.main/resource/student-management-syste-d1f7e-firebase-adminsdk-h198d-c07b43d10a.json")

    val options = FirebaseOptions.builder()
        .setCredentials(GoogleCredentials.fromStream(serviceAccount))
        .setDatabaseUrl("https://student-management-syste-d1f7e-default-rtdb.firebaseio.com/")
        .build()

    FirebaseApp.initializeApp(options)
}