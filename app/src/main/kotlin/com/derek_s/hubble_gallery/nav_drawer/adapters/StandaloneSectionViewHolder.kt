package com.derek_s.hubble_gallery.nav_drawer.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder
import com.derek_s.hubble_gallery.R
import com.derek_s.hubble_gallery.nav_drawer.model.SectionObject
import com.derek_s.hubble_gallery.utils.ui.FontFactory

class StandaloneSectionViewHolder private constructor(itemView: View) : ParentViewHolder(itemView) {

 // @Bind(R.id.tv_title)
  lateinit var tvTitle: TextView

  init {
    tvTitle = itemView.findViewById(R.id.tv_title) as TextView
    //ButterKnife.bind(this, itemView)
    beautifyViews()
  }

  fun beautifyViews() {
    tvTitle.typeface = FontFactory.getMedium(itemView.context)
  }

  fun onBind(item: NavigationAdapterItem<SectionObject>) {
    var section: SectionObject = item.`object` as SectionObject

    tvTitle.setText(section.sectionTitle)
  }

  companion object {
    fun create(context: Context, viewGroup: ViewGroup): StandaloneSectionViewHolder {
      return StandaloneSectionViewHolder(LayoutInflater.from(context).inflate(R.layout.item_section,
          viewGroup, false))
    }
  }
}