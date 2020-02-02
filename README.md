# Carousel-Banner

```
maven { url 'https://jitpack.io' }

implementation 'com.github.kaju02525:Carousel-Banner:1.0.0'

```

```

Please don't forgot LinearLayout viewGroup

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:orientation="vertical"
    android:layout_height="match_parent">

    <com.popwoot.carouselbanner.CoolCarouselBanner
        android:id="@+id/banner"
        android:layout_width="match_parent"
        android:layout_height="200dp"
        app:autoPlaying="true"
        app:indicatorGravity="center"
        app:orientation="horizontal"
        app:speedPerPixelMillisecond="0.8" />
 </LinearLayout>
        
        fun banner(){
        
        val list = ArrayList<String>()
        Banner.init(ImageFactory())

        list.add("https://cdn.dnaindia.com/sites/default/files/styles/full/public/2019/06/30/842662-katrinakaif-offbeat-films.jpg")
        list.add("https://akm-img-a-in.tosshub.com/indiatoday/images/story/201905/AKSHAY1.jpeg?HAKoXX_ba8nMjk4Vo.AOXOxLFBo7E6oY")
        list.add("https://en.janbharattimes.com/wp-content/uploads/2019/01/salman-khan-movies.jpg")
        list.add("https://static.asianetnews.com/images/01dax9bpf2hyymhqtbbst7p7tm/--15--1967------------_710x400xt.jpg")
        list.add("https://www.itl.cat/pngfile/big/86-867177_south-indian-heroine-wallpaper-sabse-badhkar-hum-2.jpg")
        list.add("https://qph.fs.quoracdn.net/main-qimg-a92551a9b90b6a9df5150157f4ef9ac5.webp")

        banner.setOnCarouselItemChangeListener {
                //                Toast.makeText(MainActivity.this, String.valueOf(position), Toast.LENGTH_LONG).show();
            }


        banner.setOnCarouselItemClickListener { position, url ->
                Toast.makeText(this@MainActivity, url, Toast.LENGTH_LONG).show()
            }

        banner.initBanner(list)
        banner2.initBanner(list) //Full screen banner no 2
        
        }
        
        
        class ImageFactory : CarouselImageFactory {
    override fun onLoadFactory(url: String, view: ImageView) {
        Glide.with(view).load(url).into(view)
    }
}
```

[![](https://jitpack.io/v/kaju02525/Carousel-Banner.svg)](https://jitpack.io/#kaju02525/Carousel-Banner)




## Screenshots
<img alt="NewsApp Main Page" height="450px" src="https://raw.githubusercontent.com/kaju02525/Carousel-Banner/master/art/pic1.png" />
