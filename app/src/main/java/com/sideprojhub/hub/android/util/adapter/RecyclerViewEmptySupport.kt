package com.sideprojhub.hub.android.util.adapter

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewEmptySupport : RecyclerView {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle)

    private var emptyView: View? = null

    private val emptyObserver = object : AdapterDataObserver() {
        override fun onChanged() {
            updateEmptyViewVisibility()
        }
    }


    override fun setAdapter(adapter: Adapter<*>?) {
        super.setAdapter(adapter)
        adapter?.registerAdapterDataObserver(emptyObserver)
        updateEmptyViewVisibility()
    }

    fun setEmptyView(emptyView: View) {
        this.emptyView = emptyView
        updateEmptyViewVisibility()
    }

    private fun updateEmptyViewVisibility() {
        emptyView?.let {
            val isEmpty = adapter?.itemCount == 0
            it.visibility = if (isEmpty) View.VISIBLE else View.GONE
            visibility = if (isEmpty) View.GONE else View.VISIBLE
        }
    }

}