import {__doNotImplementIt, com} from './TestKmp2-log'
import LogLevel = com.example.log.LogLevel;
import LogDestination = com.example.log.LogDestination;
import LoggerArt = com.example.log.Logger

class MyCustomLogDestination implements LogDestination {
    
    send(message: string, tag: string, logLevel: LogLevel) {
        console.error('Test message:' + message)
    }

    // @ts-ignore
    readonly __doNotUseIt: __doNotImplementIt
}

// Логгер из артифакта
const logger = new LoggerArt()

// Кастомная реализация LogDestination
const destination = new MyCustomLogDestination()

// Добавляем Destination в Логгер
logger.addDestination(destination)


// Пишем сообщение
logger.e('TEST MESSAGE')
