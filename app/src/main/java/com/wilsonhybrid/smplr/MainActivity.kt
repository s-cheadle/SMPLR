package com.wilsonhybrid.smplr

import android.media.AudioAttributes
import android.media.SoundPool
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.Toast
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    val maxStreams = 4
    var masterVolume = 0.9f
    var leftVolume = 0.9f
    var rightVolume = 0.9f
    var pan = 50 //50 is centre
    private val priority = 1

    var ID1 = 0
    var ID2 = 0
    var ID3 = 0
    var ID4 = 0
    var ID5 = 0
    var ID6 = 0
    var ID7 = 0
    var ID8 = 0
    var ID9 = 0
    var ID10 = 0
    var ID11 = 0
    var ID12 = 0
    var ID13 = 0
    var ID14 = 0
    var ID15 = 0
    var ID16 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val audioAttributes = AudioAttributes.Builder()
                .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                .setFlags(AudioAttributes.FLAG_AUDIBILITY_ENFORCED)
                .setUsage(AudioAttributes.USAGE_MEDIA)
                .build()

        val soundPool = SoundPool.Builder()
                .setAudioAttributes(audioAttributes)
                .build()

        var listener:SoundPool.OnLoadCompleteListener = SoundPool.OnLoadCompleteListener(function = { sp: SoundPool, i: Int, i1: Int ->
            Toast.makeText(this.applicationContext, "Loaded!", Toast.LENGTH_SHORT).show()
        })

        soundPool.setOnLoadCompleteListener(listener)

        val trigger1: Button = findViewById(R.id.trigger1)
        trigger1.setOnLongClickListener {
            ID1 = soundPool.load(applicationContext, R.raw.kick,priority); return@setOnLongClickListener true
        }
        trigger1.setOnClickListener { soundPool.play(ID1, leftVolume, rightVolume, 1, 0, 1f) }


        val trigger2: Button = findViewById(R.id.trigger2)
        val trigger3: Button = findViewById(R.id.trigger3)
        val trigger4: Button = findViewById(R.id.trigger4)
        val trigger5: Button = findViewById(R.id.trigger5)
        val trigger6: Button = findViewById(R.id.trigger6)
        val trigger7: Button = findViewById(R.id.trigger7)
        val trigger8: Button = findViewById(R.id.trigger8)
        val trigger9: Button = findViewById(R.id.trigger9)
        val trigger10: Button = findViewById(R.id.trigger10)
        val trigger11: Button = findViewById(R.id.trigger11)
        val trigger12: Button = findViewById(R.id.trigger12)
        val trigger13: Button = findViewById(R.id.trigger13)
        val trigger14: Button = findViewById(R.id.trigger14)
        val trigger15: Button = findViewById(R.id.trigger15)
        val trigger16: Button = findViewById(R.id.trigger16)

    }

}
