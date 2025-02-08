package com.sample.orderingapp

import android.app.AlertDialog
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sample.orderingapp.ui.theme.OrderingAppTheme
import java.util.Locale
import kotlin.math.log

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val sharedPreferences = getSharedPreferences("AppPrefs", MODE_PRIVATE)
//        val langCode = sharedPreferences.getString("language", "en") ?: "en"
//        setAppLocale(langCode)

        setContentView(R.layout.activity_main)
        val enButton: LinearLayout = findViewById(R.id.ENButton)
        val elButton: LinearLayout = findViewById(R.id.ELButton)
        val zhButton: LinearLayout = findViewById(R.id.ZNButton)

        enButton.setOnClickListener {
            Log.i("test","english")
            setAppLocale("en")
        }
        elButton.setOnClickListener {
            Log.i("test","el")
            setAppLocale("el")
        }
        zhButton.setOnClickListener {
            Log.i("test","zh")
            setAppLocale("zh")
        }

    }
    private fun showLanguageDialog(sharedPreferences: SharedPreferences) {
        val languages = arrayOf("English", "Ελληνικά", "简体中文")
        val langCodes = arrayOf("en", "el", "zh")

        AlertDialog.Builder(this)
            .setTitle(getString(R.string.select_language))
            .setItems(languages) { _, which ->
                // 保存选择的语言
                sharedPreferences.edit().putString("language", langCodes[which]).apply()

                // 更新应用语言
                setAppLocale(langCodes[which])

                // 重新加载界面
                recreate()
            }
            .show()
    }


    private fun setAppLocale(langCode: String){
        val locale = Locale(langCode)
        Locale.setDefault(locale)
        val config = resources.configuration
        config.setLocale(locale)
        config.setLayoutDirection(locale)
        createConfigurationContext(config)
        resources.updateConfiguration(config,resources.displayMetrics)
        recreate()

        val intent = Intent(this, MenuActivity:: class.java)
        // 启动 SecondActivity
        startActivity(intent)
    }
}

