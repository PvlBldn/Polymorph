package com.example.polymorph

class EmailService: MessageService2() {

    override fun sendMessage2(sender: String, receiver: String, message: String) {
        if (sender.contains("@") && receiver.contains("@"))
        super.sendMessage2(sender, receiver, message)
    }
}