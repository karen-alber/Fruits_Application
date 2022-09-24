package com.example.fruitsapplication


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


class CharactersAdapter(private val characterlist: List<Character>): RecyclerView.Adapter<CharactersAdapter.CharacterViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
            val itemCharacterView = LayoutInflater.from(parent.context).inflate(R.layout.character_item, parent, false)
            return CharacterViewHolder(itemCharacterView)
        }

        override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
            val currentCharacter = characterlist[position]
            holder.bindCharacter(currentCharacter)
        }

        override fun getItemCount(): Int {
            return characterlist.size
        }

inner class CharacterViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val charName: TextView
    private val charImage: ImageView

    init {
        charName = itemView.findViewById(R.id.char_name_label)
        charImage = itemView.findViewById(R.id.char_image)

        itemView.setOnClickListener() {
            val currentCharacter = characterlist[layoutPosition]
            Toast.makeText(itemView.context, currentCharacter.characterName, Toast.LENGTH_SHORT).show()

        }
    }
    fun bindCharacter(character: Character) {
        charName.text = character.characterName
        charImage.setImageResource(character.characterImage)
    }
 }
}


