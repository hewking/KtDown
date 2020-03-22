package com.hewking.rtdown.internal

import java.util.concurrent.Executors

class Executor{

    private val sExecutor = Executors.newFixedThreadPool(10)

    fun exeuete(job: Runnable){
        sExecutor.execute(job)
    }
}