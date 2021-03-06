package vic.sample.chatuisample.mvvm.rxprovide

import io.reactivex.Scheduler

interface SchedulerProvider {
    fun ui(): Scheduler

    fun io(): Scheduler

    fun computation(): Scheduler
}