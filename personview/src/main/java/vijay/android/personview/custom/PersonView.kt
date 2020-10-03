package vijay.android.personview.custom

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.view_person.view.*
import vijay.android.personview.R

class PersonView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
    defStyleRes: Int = 0
) : FrameLayout(context, attrs, defStyle, defStyleRes) {

    init {
        LayoutInflater.from(context)
            .inflate(R.layout.view_person, this, true)
    }

    fun setImageUrl(url: String) {
        Picasso.get().load(url).placeholder(R.drawable.ic_baseline_account_circle_24).into(ivPhoto)
        invalidate()
    }
}