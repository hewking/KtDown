package com.hewking.rtdown.internal

interface DownloadListener {

    fun onStart()

    fun onDownloadError()

    fun onDownloadSuccess()

    fun onDownloadProgress(progress : Int)

}