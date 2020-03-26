package com.example.profilfakultasupn

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ProfilData(
    var fakultas: String? = "",
    var poster: Int? = 0,
    var penjelasan:String? = "",
    var jurusan: String? = "",
    var webfak :String? = "",
    var webjur : String? ="",
    var profil : String? = "",
    var ttl : String? = "",
    var alamat : String? = "",
    var hp : String? = "",
    var email : String? = "",
    var url : String? = "",
    var riwayat : String? = ""
) : Parcelable