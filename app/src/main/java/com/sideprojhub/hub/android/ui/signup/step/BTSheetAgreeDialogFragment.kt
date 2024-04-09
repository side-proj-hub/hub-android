package com.sideprojhub.hub.android.ui.signup.step

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.sideprojhub.hub.android.R

class BTSheetAgreeDialogFragment: BottomSheetDialogFragment() {

    private var listener: BottomSheetListener? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_btsheet_agree, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val button = view.findViewById<Button>(R.id.btn_complete)
        button.setOnClickListener {
            listener?.onButtonClicked()
            dismiss()
        }
        super.onViewCreated(view, savedInstanceState)
    }
    companion object {
        const val TAG = "BTSheetAgreeDialog"
    }

    interface BottomSheetListener {
        fun onButtonClicked()
    }

    fun setBottomSheetListener(listener: BottomSheetListener) {
        this.listener = listener
    }

}