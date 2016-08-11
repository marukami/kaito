package au.com.tilbrook.kaito

import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.ViewGroup

fun ViewGroup.inflate(@LayoutRes layoutId: Int, attach: Boolean = false) =
    LayoutInflater.from(context).inflate(layoutId, this, attach)