package com.popwoot.carouselbanner

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

   // lateinit var banner1: CoolCarouselBanner
   // lateinit var banner22: CarouselBanner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = ArrayList<String>()
        Banner.init(ImageFactory())

        list.add("https://cdn.dnaindia.com/sites/default/files/styles/full/public/2019/06/30/842662-katrinakaif-offbeat-films.jpg")
        list.add("https://akm-img-a-in.tosshub.com/indiatoday/images/story/201905/AKSHAY1.jpeg?HAKoXX_ba8nMjk4Vo.AOXOxLFBo7E6oY")
        list.add("https://en.janbharattimes.com/wp-content/uploads/2019/01/salman-khan-movies.jpg")
        list.add("https://static.asianetnews.com/images/01dax9bpf2hyymhqtbbst7p7tm/--15--1967------------_710x400xt.jpg")
        list.add("https://resize.indiatvnews.com/en/resize/newbucket/715_-/2020/01/varun-shraddha-1579784741.jpg")
        list.add("https://qph.fs.quoracdn.net/main-qimg-a92551a9b90b6a9df5150157f4ef9ac5.webp")

        banner.setOnCarouselItemChangeListener {
                //                Toast.makeText(MainActivity.this, String.valueOf(position), Toast.LENGTH_LONG).show();
            }


        banner.setOnCarouselItemClickListener { position, url ->
                Toast.makeText(this@MainActivity, url, Toast.LENGTH_LONG).show()
            }

        banner.initBanner(list)
        banner2.initBanner(list)

    }
}
