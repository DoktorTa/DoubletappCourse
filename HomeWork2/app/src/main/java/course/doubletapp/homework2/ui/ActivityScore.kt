package course.doubletapp.homework2.ui

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import course.doubletapp.homework2.R
import course.doubletapp.homework2.databinding.ActivityScoreBinding
import course.doubletapp.homework2.vm.ScoreViewModel

class ActivityScore: AppCompatActivity() {
    private val scoreVM: ScoreViewModel = ScoreViewModel()
    private lateinit var binding: ActivityScoreBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScoreBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun setObservers() {
        binding.score.text = scoreVM.score.toString()
    }
}