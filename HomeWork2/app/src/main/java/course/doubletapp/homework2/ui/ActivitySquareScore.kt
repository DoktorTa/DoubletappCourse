package course.doubletapp.homework2.ui

import android.app.Activity
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.view.View
import course.doubletapp.homework2.databinding.ActivitySquareScoreBinding

class ActivitySquareScore: Activity() {
    private lateinit var binding: ActivitySquareScoreBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("ActivitySquareScore", "Start method 'onCreate()'")
        super.onCreate(savedInstanceState)
        binding = ActivitySquareScoreBinding.inflate(layoutInflater)

        setObservers()

        val arg = intent.extras
        if (arg != null) {
            setSquareScore(arg.get("squareScore").toString())
        }

        setContentView(binding.root)
    }

    private fun setSquareScore(squareScore: String) {
        binding.squareScore.text = squareScore
    }

    private fun setObservers(){
        binding.goToScore.setOnClickListener {
                view -> goToActivityScore(view)
        }
    }

    private fun goToActivityScore(view: View){
        val intent: Intent = Intent(this, ActivityScore::class.java)
        startActivity(intent)
    }

    override fun onStart() {
        Log.i("ActivitySquareScore", "Start method 'onStart()'")
        super.onStart()
    }

    override fun onResume() {
        Log.i("ActivitySquareScore", "Start method 'onResume()'")
        super.onResume()
    }

    override fun onPause() {
        Log.i("ActivitySquareScore", "Start method 'onPause()'")
        super.onPause()
    }

    override fun onStop() {
        Log.i("ActivitySquareScore", "Start method 'onStop()'")
        super.onStop()
    }

    override fun onRestart() {
        Log.i("ActivitySquareScore", "Start method 'onRestart()'")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.i("ActivitySquareScore", "Start method 'onDestroy()'")
        super.onDestroy()
    }

}