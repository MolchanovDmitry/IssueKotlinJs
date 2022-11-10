package com.example.log

@JsExport
actual external interface LogDestination {
    actual fun send(message: String, tag: String, logLevel: LogLevel)
}