package au.com.tilbrook.kaito

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import android.support.annotation.ColorInt
import android.support.annotation.ColorRes
import android.support.annotation.DrawableRes
import android.support.v4.content.ContextCompat
import android.support.v4.content.PermissionChecker


@ColorInt
fun Context.getColorInt(@ColorRes colorRes: Int): Int =
    ContextCompat.getColor(this, colorRes)

fun Context.getDrawableCompat(@DrawableRes drawableRes: Int): Drawable =
    ContextCompat.getDrawable(this, drawableRes)

fun Context.getColorStateListCompat(@DrawableRes drawableRes: Int): ColorStateList =
    ContextCompat.getColorStateList(this, drawableRes)

@PermissionChecker.PermissionResult
fun Context.checkPermission(permission: String): Int =
    ContextCompat.checkSelfPermission(this, permission)