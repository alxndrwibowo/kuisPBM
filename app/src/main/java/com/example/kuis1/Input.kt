package com.example.kuis1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class Input : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_input, container, false)

        val editNim = view.findViewById<EditText>(R.id.edNim)
        val editNama = view.findViewById<EditText>(R.id.edNama)
        val editProdi = view.findViewById<EditText>(R.id.edProdi)
        val rbAktif = view.findViewById<RadioButton>(R.id.rbAktif)
        val rbTidak = view.findViewById<RadioButton>(R.id.rbTidak)
        var sts = ""
        val buttonOk = view.findViewById<Button>(R.id.buttonOK)

        buttonOk.setOnClickListener(View.OnClickListener {

            val nim = editNim.text.toString()
            val nama = editNama.text.toString()
            val prodi = editProdi.text.toString()

            if (rbAktif.isChecked) {
                sts = "Aktif"
            } else if (rbTidak.isChecked){
                sts = "Tidak Aktif"
            }

            Toast.makeText(requireContext(), "NIM anda : " + nim + ", Nama anda : " + nama + "\nProdi anda : " + prodi + ", Status anda : " + sts, Toast.LENGTH_LONG).show()
        })

        return view
    }

    companion object {

    }
}