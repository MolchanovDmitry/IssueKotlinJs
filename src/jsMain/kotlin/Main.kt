import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable
import com.example.log.LogDestination
import com.example.log.LogLevel
import com.example.log.logger

fun main() {

    logger.addDestination(logDestination = object: LogDestination {
        override fun send(message: String, tag: String, logLevel: LogLevel) {
            println(message)
        }
    })
    logger.i("Log event")


    renderComposable(rootElementId = "root") {
        Text("Hello world")
    }
}

