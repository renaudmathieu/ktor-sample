package com.innovorder.model

import kotlinx.serialization.Serializable

@Serializable
data class PostRandomRequest(
    val names: List<String>
)
