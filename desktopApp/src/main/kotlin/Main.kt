import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.honya.kmp_demo.StartPoint

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KMP-demo",
        state = rememberWindowState(width = 720.dp, height = 480.dp)
    ) {
        StartPoint()
    }
}