package com.example.e_itmedi.Login

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class Success {
    @SerializedName("status")
    @Expose
    var token: String? = null
}