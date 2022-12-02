package course.doubletapp.homework2.ui

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import course.doubletapp.homework2.R
import course.doubletapp.homework2.databinding.ActivityScoreBinding
import course.doubletapp.homework2.vm.ScoreViewModel

class ActivityScore: AppCompatActivity() {
    private val scoreVM: ScoreViewModel = ScoreViewModel()
    private lateinit var binding: ActivityScoreBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("ScoreActivity", "Start method 'onCreate()'")
        super.onCreate(savedInstanceState)
        binding = ActivityScoreBinding.inflate(layoutInflater)

        setObservers()

        setContentView(binding.root)
    }

    private fun setObservers() {
        scoreVM.score.observe(this, Observer<Int>() {
                binding.score.text = scoreVM.score.value.toString()
        })

        binding.goToDoubleScore.setOnClickListener {
                view ->  goToActivitySquareScore(view)
        }
    }

    private fun goToActivitySquareScore(view: View){
        val intent: Intent = Intent(this, ActivitySquareScore::class.java)
        intent.putExtra("squareScore", scoreVM.squareScore.toString())
        startActivity(intent)
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        scoreVM.addScore()
        super.onConfigurationChanged(newConfig)
    }

    override fun onStart() {
        Log.i("ScoreActivity", "Start method 'onStart()'")
        super.onStart()
    }

    override fun onResume() {
        Log.i("ScoreActivity", "Start method 'onResume()'")
        super.onResume()
    }

    override fun onPause() {
        Log.i("ScoreActivity", "Start method 'onPause()'")
        super.onPause()
    }

    override fun onStop() {
        Log.i("ScoreActivity", "Start method 'onStop()'")
        super.onStop()
    }

    override fun onRestart() {
        Log.i("ScoreActivity", "Start method 'onRestart()'")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.i("ScoreActivity", "Start method 'onDestroy()'")
        super.onDestroy()
    }
}