package com.assignment.simplenotess.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.assignment.simplenotess.R
import com.assignment.simplenotess.data.model.Note

class NotesAdapter(
    private var notes: List<Note> = listOf(),
    private val onItemClick: (Note) -> Unit,
    private val onItemLongClick: (Note) -> Unit
) : RecyclerView.Adapter<NotesAdapter.NoteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_note, parent, false)
        return NoteViewHolder(view)
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        holder.bind(notes[position])
    }

    override fun getItemCount(): Int {
        return notes.size
    }

    fun updateNotes(newNotes: List<Note>) {
        notes = newNotes
        notifyDataSetChanged()
       //notify that data has been changed
    }

    inner class NoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val noteContent: TextView = itemView.findViewById(R.id.tv_note_content)

        fun bind(note: Note) {
            noteContent.text = note.content
            itemView.setOnClickListener {
                onItemClick(note)
            }
            //delete item upon long click
            itemView.setOnLongClickListener {
                onItemLongClick(note)
                true
            }
        }
    }
}
