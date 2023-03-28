package course.doubletapp.habittracker.ui

import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView
import course.doubletapp.habittracker.R
import course.doubletapp.habittracker.databinding.ActivityCentralBinding


class CentralActivity: AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var binding: ActivityCentralBinding
//    private lateinit var appBar: ActionBarDrawerToggle

    private lateinit var appBarConfiguration: AppBarConfiguration


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCentralBinding.inflate(layoutInflater)

//        appBar = ActionBarDrawerToggle(
//            this, binding.drawerLayout, R.string.open_drawer, R.string.close_drawer)
//
//        binding.drawerLayout.addDrawerListener(appBar)

        val havHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment

        val navController = havHostFragment.navController

        appBarConfiguration = AppBarConfiguration(
            navController.graph, binding.drawerLayout
        )
        binding.navView.setupWithNavController(navController)
        setupActionBarWithNavController(navController, appBarConfiguration)

        setContentView(binding.root)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) ||
                super.onSupportNavigateUp()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        Log.d("ACTIVITY", "${id}, ${R.id.navigation_info_fragment}")
        if (id == R.id.navigation_info_fragment){
            findNavController(R.id.nav_host_fragment).navigate(R.id.infoFragment)
        } else {
            findNavController(R.id.nav_host_fragment).navigate(R.id.CentralFragment)
        }
        binding.drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

}