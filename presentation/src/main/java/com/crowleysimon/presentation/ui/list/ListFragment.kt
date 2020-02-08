package com.crowleysimon.presentation.ui.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.crowleysimon.presentation.R
import com.crowleysimon.presentation.ui.list.view.epoxyView
import kotlinx.android.synthetic.main.fragment_list.listView

class ListFragment : Fragment() {

  private val someList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    return inflater.inflate(R.layout.fragment_list, container, false)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    listView.withModels {
      someList.forEach {
        epoxyView {
          id(it)
          title(it.toString())
        }
      }
    }
  }
}