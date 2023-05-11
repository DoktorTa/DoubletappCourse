package course.doubletapp.habittracker.ui

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupWithNavController
import com.bumptech.glide.Glide
import course.doubletapp.habittracker.R
import androidx.navigation.ui.setupActionBarWithNavController
import course.doubletapp.habittracker.databinding.ActivityCentralBinding

class CentralActivity: AppCompatActivity() {

    private lateinit var binding: ActivityCentralBinding
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCentralBinding.inflate(layoutInflater)

        val havHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment

        val navController = havHostFragment.navController

        appBarConfiguration = AppBarConfiguration(
            navController.graph, binding.drawerLayout
        )
        binding.navView.setupWithNavController(navController)
        setupActionBarWithNavController(navController, appBarConfiguration)

        setContentView(binding.root)

        loadAvatarImage(this)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) ||
                super.onSupportNavigateUp()
    }

    private fun loadAvatarImage(activity: Activity){
//        lifecycleScope.launch {
        Glide.with(activity)
            .load(urlImage)
            .centerCrop()
            .override(50, 50)
            .placeholder(R.drawable.ic_baseline_account_circle_24)
            .into(binding.navView.getHeaderView(0).findViewById(R.id.avatar))
//        }
    }

    companion object {
        private const val urlImage = "https://kartinkof.club/uploads/posts/2022-03/1648694684_8-kartinkof-club-p-kartinki-smeshnie-stikmen-8.jpg"
    }

}