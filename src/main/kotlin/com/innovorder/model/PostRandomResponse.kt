package com.innovorder.model

import kotlinx.serialization.Serializable

@Serializable
data class PostRandomResponse(
    val random: String
)
