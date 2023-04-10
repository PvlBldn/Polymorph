package com.example.polymorph

class MessageService {

    fun sendMessage(sender: String, receiver: String, message:String) {
        if (sender.contains("@") && receiver.contains("@")) {
            println("Send a message: $message from $sender to $receiver")
        }
    }

    fun sendMessage(sender: Long, receiver: Long, message:String) {
        if (sender.toString().length == 9 && receiver.toString().length == 9) {
            println("Send a message: $message from $sender to $receiver")
        }
    }
}