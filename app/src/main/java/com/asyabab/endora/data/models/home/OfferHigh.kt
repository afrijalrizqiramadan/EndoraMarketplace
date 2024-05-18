package com.asyabab.endora.data.models.home

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class OfferHigh : Serializable {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("cover")
    @Expose
    var cover: String? = null

    @SerializedName("type")
    @Expose
    var type: String? = null

    @SerializedName("start_offer")
    @Expose
    var startOffer: String? = null

    @SerializedName("end_offer")
    @Expose
    var endOffer: String? = null

    @SerializedName("is_active")
    @Expose
    var isActive: String? = null

    @SerializedName("created_at")
    @Expose
    var createdAt: String? = null

    @SerializedName("updated_at")
    @Expose
    var updatedAt: String? = null

}