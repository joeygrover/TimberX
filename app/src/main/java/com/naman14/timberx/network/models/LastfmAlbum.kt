package com.naman14.timberx.network.models

import com.google.gson.annotations.SerializedName

data class LastfmAlbum(@SerializedName("image") val artwork: List<Artwork>)