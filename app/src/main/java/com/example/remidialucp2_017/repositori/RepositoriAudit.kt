package com.example.remidialucp2_017.repositori

import com.example.remidialucp2_017.modeldata.LogAudit
import com.example.remidialucp2_017.modeldata.enum.AksiAudit

class RepositoriAudit {

    private val logs = mutableListOf<LogAudit>()

    fun catat(
        entity: String,
        entityId: Long,
        aksi: AksiAudit,
        sebelum: String?,
        sesudah: String
    ) {
        logs.add(
            LogAudit(
                id = logs.size.toLong(),
                entity = entity,
                entityId = entityId,
                aksi = aksi,
                sebelum = sebelum,
                sesudah = sesudah
            )
        )
    }
}
