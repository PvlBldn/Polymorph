package com.example.polymorph

abstract class MessageService2 {

    open fun sendMessage2(sender: String, receiver: String, message:String) {
        println("Send a message: $message from $sender to $receiver")
    }
}