package gaur.himanshu.getstartedwithroom

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var customArrayAdapters: CustomArrayAdapters
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = mutableListOf<OurData>()
        list.add(OurData(R.drawable.kohli, "Kohli", "Best Batsman"))
        list.add(OurData(R.drawable.amla, "Amla", "Best Batsman of SA"))
        list.add(OurData(R.drawable.bairstow, "Bairstow", "Opener Batsman"))
        list.add(OurData(R.drawable.bales, "Bales", "Bales"))
        list.add(OurData(R.drawable.dhawan, "Shikhar Dhawan", "Indain Opener"))
        list.add(OurData(R.drawable.hardik, "Hardik", "All Rounder"))
        list.add(OurData(R.drawable.mahi, "Mahendra Singh Dhoni", "Former Indian Caption"))
        list.add(OurData(R.drawable.team, "Indain Team", "Men in Blue"))

        customArrayAdapters = CustomArrayAdapters(this, list)

        val listView = findViewById<ListView>(R.id.list)

        listView.adapter = customArrayAdapters


    }
}