package id.ac.unhas.infocovid19

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import id.ac.unhas.infocovid19.ui.harian.HarianListFragment
import id.ac.unhas.infocovid19.ui.perkasus.PerkasusListFragment
import id.ac.unhas.infocovid19.ui.provinsi.ProvinsiListFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        Log.d("MainActivity", "Test2")

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, ProvinsiListFragment.newInstance())
                .commitNow()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.provinsi -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container, ProvinsiListFragment.newInstance())
                    .commitNow()
            }
            R.id.perkasus -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container, PerkasusListFragment.newInstance())
                    .commitNow()
            }
            R.id.harian -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container, HarianListFragment.newInstance())
                    .commitNow()
            }
        }
    }
}
