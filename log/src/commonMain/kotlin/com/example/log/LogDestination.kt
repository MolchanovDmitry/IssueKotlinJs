package com.example.log

/**
 * Интерфейс назначения лога
 */
expect interface LogDestination {

    fun send(message: String, tag: String = "", logLevel: LogLevel = LogLevel.INFO)
}

@JsExport
enum class LogLevel(val title: String) {
    DEBUG("d"),
    INFO("i"),
    WARNING("w"),
    ERROR("e")
}