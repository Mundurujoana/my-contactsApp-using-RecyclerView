package dev.mundu.mycontacts

import android.provider.ContactsContract

data class Contact(
    var name:String,
    var phoneNumber: String,
    var email: String,
    var address: String,
    var image: String,

)
