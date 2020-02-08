package com.crowleysimon.presentation.ui.list.view

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import com.airbnb.epoxy.ModelView
import com.airbnb.epoxy.TextProp
import com.crowleysimon.presentation.R
import kotlinx.android.synthetic.main.epoxy_view.view.title

@ModelView(defaultLayout = R.layout.epoxy_view)
class EpoxyView : FrameLayout {

  constructor(context: Context) : super(context)
  constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
  constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
    context,
    attrs,
    defStyleAttr
  )

  @TextProp
  fun setTitle(text: CharSequence?) {
    title.text = text
  }
}