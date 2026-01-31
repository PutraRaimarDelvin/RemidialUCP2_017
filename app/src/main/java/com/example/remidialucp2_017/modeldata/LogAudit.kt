package com.example.remidialucp2_017.modeldata

import com.example.remidialucp2_017.modeldata.enum.AksiAudit

data class LogAudit(
    val id: Long,
    val entity: String,
    val entityId: Long,
    val aksi: AksiAudit,
    val sebelum: String?,
    val sesudah: String
)
