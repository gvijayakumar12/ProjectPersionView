package vijay.android.projectpersonview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import vijay.android.personview.ToastViewer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvHelloWorld.setOnClickListener {
            ToastViewer.showSimpleToast(this, "Library Sync Success")
        }
    }
}