package vijay.android.personview

import android.content.Context
import android.widget.Toast

class ToastViewer {
    companion object {
        fun showSimpleToast(context: Context, message: String) {
            Toast.makeText(context,message,Toast.LENGTH_LONG).show()
        }
    }
}