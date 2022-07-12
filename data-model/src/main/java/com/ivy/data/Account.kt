package com.ivy.data

import java.util.*

data class Account(
    val name: String,
    val currency: String? = null,
    val color: Int,
    val icon: String? = null,
    val orderNum: Double = 0.0,
    val includeInBalance: Boolean = true,

    val isSynced: Boolean = false,
    val isDeleted: Boolean = false,

    val id: UUID = UUID.randomUUID()
)