package com.example.remidialucp2_017.uicontroller.pekerja

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class MigrasiDataWorker(
    context: Context,
    params: WorkerParameters
) : Worker(context, params) {

    override fun doWork(): Result {
        // simulasi migrasi data besar
        Thread.sleep(2000)
        return Result.success()
    }
}
