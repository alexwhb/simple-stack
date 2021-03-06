package com.zhuinden.simplestackdemoexamplefragments.util

import com.zhuinden.simplestack.Backstack

import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Zhuinden on 2018. 08. 20.
 */
@Singleton
@Deprecated(message = "Singleton global lives beyond the scope of the Activity.")
class BackstackHolder @Inject constructor() {
    lateinit var backstack: Backstack
}
