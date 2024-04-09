package com.sideprojhub.hub.android.util

import android.content.res.Resources


fun Int.dpToPx(): Int {
    return (this * Resources.getSystem().displayMetrics.density).toInt()
}

fun Float.dpToPx():Float  {
    return (this * Resources.getSystem().displayMetrics.density)
}