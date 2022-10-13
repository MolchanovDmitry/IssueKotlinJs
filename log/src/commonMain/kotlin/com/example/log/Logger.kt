@file:Suppress("OPT_IN_USAGE", "NON_EXPORTABLE_TYPE")

package com.example.log

import kotlin.js.JsExport

@JsExport
val logger = Logger()

/**
 * Логер
 */
@JsExport
class Logger {

    private var destinations = mutableListOf<LogDestination>()

    fun addDestination(logDestination: LogDestination) {
        destinations.add(logDestination)
    }

    fun removeDestination(logDestination: LogDestination) {
        destinations.remove(logDestination)
    }

    fun i(message: String, tag: String = "") {
        destinations.forEach {logDestination: LogDestination ->
            logDestination.send(message = message, tag = tag, logLevel = LogLevel.INFO)
        }
    }

    fun d(message: String, tag: String = "") {
        destinations.forEach {logDestination: LogDestination ->
            logDestination.send(message = message, tag = tag, logLevel = LogLevel.DEBUG)
        }
    }

    fun e(message: String, tag: String = "") {
        destinations.forEach {logDestination: LogDestination ->
            logDestination.send(message = message, tag = tag, logLevel = LogLevel.ERROR)
        }
    }

    fun w(message: String, tag: String = "") {
        destinations.forEach {logDestination: LogDestination ->
            logDestination.send(message = message, tag = tag, logLevel = LogLevel.WARNING)
        }
    }
}