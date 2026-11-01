import androidx.compose.runtime.*
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.platform.Font
import androidx.compose.ui.window.CanvasBasedWindow
import kotlinx.browser.window
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.await
import kotlinx.coroutines.launch
import org.jetbrains.skiko.wasm.onWasmReady
import org.khronos.webgl.ArrayBuffer
import org.khronos.webgl.Int8Array
import org.khronos.webgl.get

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    onWasmReady {
        val fontFamilyState = mutableStateOf<FontFamily?>(null)

        MainScope().launch {
            try {
                val response = window.fetch("NotoSansJP-Regular.otf").await()
                val buffer = response.arrayBuffer().await()
                val int8Array = Int8Array(buffer)
                val byteArray = ByteArray(int8Array.length) { index -> int8Array[index] }
                val font = Font(identity = "NotoSansJP", data = byteArray)
                fontFamilyState.value = FontFamily(font)
            } catch (e: Throwable) {
                console.error("Failed to load NotoSansJP font:", e)
            }
        }

        CanvasBasedWindow(
            title = "JLPT N5 Master",
            canvasElementId = "ComposeTarget"
        ) {
            val fontFamily by fontFamilyState
            App(fontFamily = fontFamily)
        }
    }
}
