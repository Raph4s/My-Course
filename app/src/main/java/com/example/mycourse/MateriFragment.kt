package com.example.mycourse

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MateriFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_materi, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rvMateri: RecyclerView = view.findViewById(R.id.rv_materi)
        rvMateri.layoutManager = LinearLayoutManager(requireContext())

        val listMateri = listOf(
            Materi(
                title = "Pengenalan Android Studio",
                date = "27 Agustus 2026"
            ),
            Materi(
                title = "CountApp",
                date = "27 Agustus 2026"
            ),
            Materi(
                title = "Constraint Layout",
                date = "3 September 2026"
            ),
            Materi(
                title = "Activity dan Intent",
                date = "9 September 2026"
            ),
            Materi(
                title = "Ui Component",
                date = "17 September 2026"
            ),
            Materi(
                title = "Style, Option Menu & Tabs Layout",
                date = "24 Sept 2026"
            )
        )

        val adapter = MateriAdapter(listMateri)
        rvMateri.adapter = adapter
    }
}
