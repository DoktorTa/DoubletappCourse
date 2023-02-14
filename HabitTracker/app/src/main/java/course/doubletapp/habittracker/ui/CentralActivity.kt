package course.doubletapp.habittracker.ui

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.bumptech.glide.Glide
import course.doubletapp.habittracker.R
import course.doubletapp.habittracker.databinding.ActivityCentralBinding
import kotlinx.coroutines.launch

class CentralActivity: AppCompatActivity() {

    private lateinit var binding: ActivityCentralBinding
    private lateinit var appBar: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCentralBinding.inflate(layoutInflater)

        appBar = ActionBarDrawerToggle(
            this, binding.drawerLayout, R.string.open_drawer, R.string.close_drawer)
        binding.drawerLayout.addDrawerListener(appBar)
        setContentView(binding.root)

        loadAvatarImage(this)
    }

    private fun loadAvatarImage(activity: Activity){
        lifecycleScope.launch {
            Glide.with(activity)
                .load(urlImage)
                .centerCrop()
                .override(50, 50)
                .placeholder(R.drawable.ic_baseline_account_circle_24)
                .into(binding.navView.getHeaderView(0).findViewById(R.id.avatar))
        }
    }

    companion object {
        private const val urlImage = "https://kartinkof.club/uploads/posts/2022-03/1648694684_8-kartinkof-club-p-kartinki-smeshnie-stikmen-8.jpg"
    }

}