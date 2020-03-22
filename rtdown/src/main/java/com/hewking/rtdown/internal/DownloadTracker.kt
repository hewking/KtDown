package com.hewking.rtdown.internal

class DownloadTracker {

    private val runningTasks = mutableListOf<AbstractTask>()

    fun download(task: AbstractTask,executor: Executor) {
        runningTasks.add(task)
        executor.exeuete(task)
    }

}