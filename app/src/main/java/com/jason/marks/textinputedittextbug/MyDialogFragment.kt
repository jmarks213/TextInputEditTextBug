package com.jason.marks.textinputedittextbug

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.DialogFragment
import com.google.android.material.textfield.TextInputLayout

class MyDialogFragment: DialogFragment() {


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val dialogBuilder = AlertDialog.Builder(context)
        val view = layoutInflater.inflate(R.layout.my_dialog_fragment_layout, null)
        dialogBuilder.setView(view)

        val til = view.findViewById<TextInputLayout>(R.id.my_dialog_fragment_text_input_layout)
        til.editText?.addTextChangedListener(object: TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

            override fun afterTextChanged(s: Editable?) {}
        })

        return dialogBuilder.create()
    }
}