package com.zaimus.survey.constant.custom_view

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import com.zaimus.survey.R


class CustomFontBoldTextView:androidx.appcompat.widget.AppCompatTextView {

    constructor(context: Context) : super(context) {
        val type = Typeface.createFromAsset(context.assets, "fonts/Lato_Bold.ttf")
        this.typeface = type
        this.setTextColor(context.resources.getColor(R.color.black))
//        this.textSize = 26F
    }
    constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet) {
        val type = Typeface.createFromAsset(context.assets, "fonts/Lato_Bold.ttf")
        this.typeface = type
        this.setTextColor(context.resources.getColor(R.color.black))
//        this.textSize = 26F
    }
    constructor(context: Context, attributeSet: AttributeSet, defStyleAttr: Int) : super(context, attributeSet, defStyleAttr) {
        val type = Typeface.createFromAsset(context.assets, "fonts/Lato_Bold.ttf")
        this.typeface = type
        this.setTextColor(context.resources.getColor(R.color.black))
//        this.textSize = 26F
    }
}