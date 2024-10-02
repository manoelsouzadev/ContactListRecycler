package br.edu.scl.ifsp.sdm.contactlist.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Contact(
    var id: Int = Constant.INVALID_CONTACT_ID,
    var name: String = "",
    var address: String = "",
    var phone: String = "",
    var email: String = ""
): Parcelable
