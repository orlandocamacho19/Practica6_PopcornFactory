package orlando.camacho.popcornfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonP: Button = findViewById(R.id.buttonP)

        buttonP.setOnClickListener(){
            var intent: Intent = Intent(this, Catalog::class.java)
            startActivity(intent)
        }
    }
}