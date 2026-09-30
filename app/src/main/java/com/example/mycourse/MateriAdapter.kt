package com.example.mycourse

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MateriAdapter(private val listMateri: List<Materi>) :
    RecyclerView.Adapter<MateriAdapter.MateriViewHolder>() {

    class MateriViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvNumber: TextView = itemView.findViewById(R.id.tv_modul_number)
        val tvTitle: TextView = itemView.findViewById(R.id.tv_materi_title)
        val tvDate: TextView = itemView.findViewById(R.id.tv_materi_date)
        val tvStatus: TextView = itemView.findViewById(R.id.tv_materi_status)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MateriViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_materi, parent, false)
        return MateriViewHolder(view)
    }

    override fun onBindViewHolder(holder: MateriViewHolder, position: Int) {
        val materi = listMateri[position]
        holder.tvNumber.text = "Pertemuan ${position + 1}"
        holder.tvTitle.text = materi.title
        holder.tvDate.text = "${materi.date}"
        holder.tvStatus.text = if (materi.isCompleted) "Selesai" else "Belum Selesai"
    }

    override fun getItemCount(): Int = listMateri.size
}
