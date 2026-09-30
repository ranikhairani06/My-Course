package com.example.mycourse

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment

class MateriFragment : Fragment(R.layout.fragment_materi) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val container = view.findViewById<LinearLayout>(R.id.materiContainer)

        val daftarMateri = listOf(
            Pair("Pertemuan 6: Style, Option Menu & Tabs Layout", "23 Sep"),
            Pair("Pertemuan 5: UI Component", "17 Sep"),
            Pair("Pertemuan 4: Activity & Intent", "9 Sep"),
            Pair("Pertemuan 3: ConstraintLayout", "3 Sep"),
            Pair("Pertemuan 3: RelativeLayout", "3 Sep"),
            Pair("Pertemuan 2: Linear Layout", "27 Agu"),
            Pair("Pertemuan 1: Android Studio", "27 Agu")
        )

        daftarMateri.forEach { (judul, tanggal) ->
            val kartu = LayoutInflater.from(requireContext())
                .inflate(R.layout.item_materi, container, false)

            val txtJudul = kartu.findViewById<TextView>(R.id.txtJudulMateri)
            val txtTanggal = kartu.findViewById<TextView>(R.id.txtTanggalMateri)

            txtJudul.text = "Materi baru: $judul"
            txtTanggal.text = tanggal

            val jarak = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                bottomMargin = 12.dp()
            }

            container.addView(kartu, jarak)
        }
    }

    private fun Int.dp(): Int =
        (this * resources.displayMetrics.density).toInt()
}