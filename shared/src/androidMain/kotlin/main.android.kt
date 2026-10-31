import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalContext
import com.jlpt.n5.data.JLPTRepository
import com.jlpt.n5.data.PlatformStorage

actual fun getPlatformName(): String = "Android"

@Composable
fun MainView() {
    val context = LocalContext.current.applicationContext
    LaunchedEffect(context) {
        PlatformStorage.init(context)
        JLPTRepository.loadFromStorage()
    }
    App()
}
