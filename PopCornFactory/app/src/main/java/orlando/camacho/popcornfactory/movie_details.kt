package orlando.camacho.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class movie_details : AppCompatActivity() {

    val tv_movie_img: ImageView = findViewById(R.id.iv_movie_img)
    val tv_movie_name: TextView = findViewById(R.id.tv_movie_name)
    val tv_movie_desc: TextView = findViewById(R.id.tv_movie_desc)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)

        val bundle = intent.extras

        if(bundle != null){
            tv_movie_img.setImageResource(bundle.getInt("header"))
            tv_movie_name.setText(bundle.getString("title"))
            tv_movie_desc.setText(bundle.getString("synopsis"))
        }
    }
}