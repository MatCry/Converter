package com.example.theconverter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.core.widget.doAfterTextChanged
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass.
 * Use the [WeightFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class WeightFragment : Fragment() {

    private var changedByApp: Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_weight, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.wButton_choose).setOnClickListener {
            val action = WeightFragmentDirections.actionSpeedFragmentToFirstFragment()
            findNavController().navigate(action)
        }

        view.findViewById<EditText>(R.id.editText_gr).doAfterTextChanged { content ->
            if (!changedByApp) {
                if (content.isNullOrEmpty())
                    clearEditTextViews(view)
                else
                    setFromgr(view, content.toString().toDouble())
            }
        }

        view.findViewById<EditText>(R.id.editText_kilo).doAfterTextChanged { content ->
            if (!changedByApp) {
                if (content.isNullOrEmpty())
                    clearEditTextViews(view)
                else
                    setFromkilo(view, content.toString().toDouble())
            }
        }

        view.findViewById<EditText>(R.id.editText_ton).doAfterTextChanged { content ->
            if (!changedByApp) {
                if (content.isNullOrEmpty())
                    clearEditTextViews(view)
                else
                    setFromton(view, content.toString().toDouble())
            }
        }

        view.findViewById<EditText>(R.id.editText_ib).doAfterTextChanged { content ->
            if (!changedByApp) {
                if (content.isNullOrEmpty())
                    clearEditTextViews(view)
                else
                    setFromib(view, content.toString().toDouble())
            }
        }

        view.findViewById<EditText>(R.id.editText_carat).doAfterTextChanged { content ->
            if (!changedByApp) {
                if (content.isNullOrEmpty())
                    clearEditTextViews(view)
                else
                    setFromcarat(view, content.toString().toDouble())
            }
        }
        view.findViewById<EditText>(R.id.editText_po).doAfterTextChanged { content ->
            if (!changedByApp) {
                if (content.isNullOrEmpty())
                    clearEditTextViews(view)
                else
                    setFrompo(view, content.toString().toDouble())
            }
        }
    }

    private fun setFromgr(view:View, gr: Double) {
        changedByApp = true

        view.findViewById<EditText>(R.id.editText_kilo).setText((gr * getString(R.string.gr_kilo).toDouble()).toString())

        view.findViewById<EditText>(R.id.editText_ton).setText((gr * getString(R.string.gr_ton).toDouble()).toString())

        view.findViewById<EditText>(R.id.editText_ib).setText((gr * getString(R.string.gr_ib).toDouble()).toString())

        view.findViewById<EditText>(R.id.editText_carat).setText((gr * getString(R.string.gr_carat).toDouble()).toString())

        view.findViewById<EditText>(R.id.editText_po).setText((gr * getString(R.string.gr_po).toDouble()).toString())

        changedByApp = false
    }

    private fun setFromkilo(view: View, kilo: Double) {
        changedByApp = true

        view.findViewById<EditText>(R.id.editText_gr).setText((kilo * getString(R.string.kilo_gr).toDouble()).toString())

        view.findViewById<EditText>(R.id.editText_ton).setText((kilo * getString(R.string.kilo_ton).toDouble()).toString())

        view.findViewById<EditText>(R.id.editText_ib).setText((kilo * getString(R.string.kilo_ib).toDouble()).toString())

        view.findViewById<EditText>(R.id.editText_carat).setText((kilo * getString(R.string.kilo_carat).toDouble()).toString())

        view.findViewById<EditText>(R.id.editText_po).setText((kilo * getString(R.string.kilo_po).toDouble()).toString())

        changedByApp = false
    }

    private fun setFromton(view: View, ton: Double) {
        changedByApp = true

        view.findViewById<EditText>(R.id.editText_gr).setText((ton * getString(R.string.ton_gr).toDouble()).toString())

        view.findViewById<EditText>(R.id.editText_kilo).setText((ton * getString(R.string.ton_kilo).toDouble()).toString())

        view.findViewById<EditText>(R.id.editText_ib).setText((ton * getString(R.string.ton_ib).toDouble()).toString())

        view.findViewById<EditText>(R.id.editText_carat).setText((ton * getString(R.string.ton_carat).toDouble()).toString())

        view.findViewById<EditText>(R.id.editText_po).setText((ton * getString(R.string.ton_po).toDouble()).toString())

        changedByApp = false
    }

    private fun setFromib(view: View, ib: Double) {
        changedByApp = true

        view.findViewById<EditText>(R.id.editText_gr).setText((ib * getString(R.string.ib_gr).toDouble()).toString())

        view.findViewById<EditText>(R.id.editText_kilo).setText((ib * getString(R.string.ib_kilo).toDouble()).toString())

        view.findViewById<EditText>(R.id.editText_ton).setText((ib * getString(R.string.ib_ton).toDouble()).toString())

        view.findViewById<EditText>(R.id.editText_carat).setText((ib * getString(R.string.ib_carat).toDouble()).toString())

        view.findViewById<EditText>(R.id.editText_po).setText((ib * getString(R.string.ton_po).toDouble()).toString())

        changedByApp = false
    }

    private fun setFromcarat(view: View, carat: Double) {
        changedByApp = true

        view.findViewById<EditText>(R.id.editText_gr).setText((carat * getString(R.string.carat_gr).toDouble()).toString())

        view.findViewById<EditText>(R.id.editText_kilo).setText((carat * getString(R.string.carat_kilo).toDouble()).toString())

        view.findViewById<EditText>(R.id.editText_ton).setText((carat * getString(R.string.carat_ton).toDouble()).toString())

        view.findViewById<EditText>(R.id.editText_ib).setText((carat * getString(R.string.carat_ib).toDouble()).toString())

        view.findViewById<EditText>(R.id.editText_po).setText((carat * getString(R.string.carat_po).toDouble()).toString())

        changedByApp = false
    }

    private fun setFrompo(view: View, po: Double) {
        changedByApp = true

        view.findViewById<EditText>(R.id.editText_gr).setText((po * getString(R.string.po_gr).toDouble()).toString())

        view.findViewById<EditText>(R.id.editText_kilo).setText((po * getString(R.string.po_kilo).toDouble()).toString())

        view.findViewById<EditText>(R.id.editText_ton).setText((po * getString(R.string.po_ton).toDouble()).toString())

        view.findViewById<EditText>(R.id.editText_ib).setText((po * getString(R.string.po_ib).toDouble()).toString())

        view.findViewById<EditText>(R.id.editText_carat).setText((po * getString(R.string.po_carat).toDouble()).toString())

        changedByApp = false
    }


    private fun clearEditTextViews(view: View) {
        changedByApp = true

        view.findViewById<EditText>(R.id.editText_gr).getText().clear()

        view.findViewById<EditText>(R.id.editText_kilo).getText().clear()

        view.findViewById<EditText>(R.id.editText_ton).getText().clear()

        view.findViewById<EditText>(R.id.editText_ib).getText().clear()

        view.findViewById<EditText>(R.id.editText_carat).getText().clear()

        view.findViewById<EditText>(R.id.editText_po).getText().clear()

        changedByApp = false
    }
}
