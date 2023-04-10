package com.example.polymorph

class SMSService: MessageService2() {

    override fun sendMessage2(sender: String, receiver: String, message: String) {
        if (sender.toString().length == 9 && receiver.toString().length == 9)
            super.sendMessage2(sender, receiver, message)
    }
}