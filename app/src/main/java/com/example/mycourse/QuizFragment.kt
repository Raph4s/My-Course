package com.example.mycourse

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment

class QuizFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_quiz, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnCheckQuiz: View? = view.findViewById(R.id.btn_check_quiz)
        btnCheckQuiz?.setOnClickListener {
            Toast.makeText(
                requireContext(),
                "Belum ada quiz yang tersedia untuk saat ini.",
                Toast.LENGTH_SHORT,
            ).show()
        }
    }
}
