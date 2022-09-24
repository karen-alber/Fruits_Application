package com.example.fruitsapplication

import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity: AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerview)

        if (resources.configuration.smallestScreenWidthDp < 300) {
            recyclerView.layoutManager = GridLayoutManager(this, 2)
        } else {
            recyclerView.layoutManager = GridLayoutManager(this, 3)
        }

        val listOfCharacters = getListOfCharacters()
        val charactersAdapter = CharactersAdapter(listOfCharacters)

        recyclerView.adapter = charactersAdapter
    }

    private fun getListOfCharacters(): List<Character>{
        val characters = mutableListOf<Character>()
        characters.add(Character("Apple", R.drawable.apple, "Apple is one of the pome (fleshy) fruits. Apples at harvest vary widely in size, shape, colour, and acidity, but most are fairly round and some shade of red or yellow."))
        characters.add(Character("Banana", R.drawable.banana, "Bananas are variable in size, color, and firmness, but is usually elongated and curved, with soft flesh rich in starch covered with a rind, which may be green, yellow, red, purple, or brown when ripe."))
        characters.add(Character("Avocado", R.drawable.avocado, "Avocado fruits have greenish or yellowish flesh with a buttery consistency and a rich nutty flavour."))
        characters.add(Character("Carrot", R.drawable.carrot, "Carrots are firm and crisp. The skin is mostly smooth, but it may have wrinkles that go from side to side. Among common varieties root shapes range from globular to long, with lower ends blunt to pointed. Besides the orange-coloured roots, white-, yellow-, and purple-fleshed varieties are known."))
        characters.add(Character("Blueberry", R.drawable.blueberry, "Blueberries are small round berries about 0.2 to 0.6 inches across. Their color can range from blue to purple. "))
        characters.add(Character("Coconut", R.drawable.coconut, "Coconut is a round and elongate fruit of white, fibrous and oily meat covered by a thick, brown and hairy shell. Coconuts are surrounded by a fibrous kernel, inside which is a white meat called copra. When the fruit is still tender it yields a milky fluid that is commonly used as basic food in some zones."))
        characters.add(Character("Grapes", R.drawable.grapes, "Grapes are a type of fruit that grow in clusters of 15 to 300, and can be crimson, black, dark blue, yellow, green, orange, and pink."))
        characters.add(Character("Guava", R.drawable.guava, "Guava produces solitary white flowers and a berry fruit. The fruit is oval in shape and green to yellow in color. The flesh inside can be white, yellow, pink or red in color and contains numerous yellowish seeds. Guava can reach grow to 10 m (33 ft) in height and lives for approximately 40 years. "))
        characters.add(Character("Mango", R.drawable.mango, "Mangoes vary greatly in size and character. Its form is oval, round, heart-shaped, kidney-shaped, or long and slender. The smallest mangoes are no larger than plums, while others may weigh 1.8 to 2.3 kg (4 to 5 pounds). Some varieties are vividly coloured with shades of red and yellow, while others are dull green."))
        characters.add(Character("Orange", R.drawable.orange, "Orange is a usually round or oval citrus; its rind and flesh are generally orange, except the varieties of red pulp. The edible part of the orange is the flesh, consumed in fresh or in juice."))
        characters.add(Character("Pineapple", R.drawable.pineapple, "Pineapple has a tough rind made up of hexagonal units and a fibrous, juicy flesh which may be yellow to white in color. Pineapple may reach 1.5–1.8 m (5–6 ft) in height and some varieties can grow for in excess of 20 years."))
        characters.add(Character("Pomegranate", R.drawable.pomegranate, "Pomegranates are round, red fruits. They feature a white inner flesh that’s densely packed with crunchy, juicy edible seeds called arils."))
        characters.add(Character("Strawberry", R.drawable.strawberry, "Strawberries are soft, sweet, bright red berries. They're also delicious. Strawberries have tiny edible seeds, which grow all over their surface."))
        characters.add(Character("Watermelon", R.drawable.watermelon, "Watermelon is a large fruit of a more or less spherical shape. It is usually eaten raw as table dessert. It has a sweet reddish or yellowish flesh."))

        return characters
    }
}