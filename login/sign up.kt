import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_welcome.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        // Create an instance of your listener class
        val myButtonListener = MyButtonListener()

        // Set the listener for the login_button
        login_button.setOnClickListener(myButtonListener)

        // Set the listener for the signup_button
        signup_button.setOnClickListener(myButtonListener)
    }
}
