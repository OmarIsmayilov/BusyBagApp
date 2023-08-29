package com.omarismayilov.busybag.data.remote.service

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class FirebaseMessagingService : FirebaseMessagingService() {

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        //
    }

    override fun onNewToken(token: String) {
        //
    }

}