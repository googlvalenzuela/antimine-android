package dev.lucasnlm.antimine.licenses

import android.os.Bundle
import androidx.fragment.app.commit
import dev.lucasnlm.antimine.about.R
import dev.lucasnlm.antimine.about.databinding.ActivityContainerBinding
import dev.lucasnlm.antimine.licenses.views.LicensesFragment
import dev.lucasnlm.antimine.ui.ext.ThemedActivity

class LicenseActivity : ThemedActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityContainerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bindToolbar(binding.toolbar)
        binding.toolbar.setTitle(R.string.licenses)

        supportFragmentManager.commit(allowStateLoss = true) {
            replace(R.id.content, LicensesFragment())
        }
    }
}
