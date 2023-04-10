import com.example.polymorph.EmailService
import com.example.polymorph.MessageService
import com.example.polymorph.SMSService

fun main() {

    val messageService = MessageService()

    messageService.sendMessage("Kolya@", "Nina@", "Sdelai bochku")
    messageService.sendMessage(123456789, 987654321, " Sup")


    val emailService = EmailService()
    val smsService = SMSService()

    emailService.sendMessage2("Kolya@", "Nina@", "Sdelai bochku")
    smsService.sendMessage2("123456789", "987654321", " Sup")
}