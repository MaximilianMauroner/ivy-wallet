package com.ivy.data

import java.util.*

@Deprecated("should not be in :core")
data class Budget(
    val name: String,
    val amount: Double,

    val categoryIdsSerialized: String?,
    val accountIdsSerialized: String?,

    val isSynced: Boolean = false,
    val isDeleted: Boolean = false,

    val orderId: Double,
    val id: UUID = UUID.randomUUID()
)