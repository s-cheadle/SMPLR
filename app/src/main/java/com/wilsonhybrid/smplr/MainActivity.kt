package com.wilsonhybrid.smplr

import android.media.AudioAttributes
import android.media.SoundPool
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    var ACTIVITY_CHOOSE_FILE:Int = 1

    lateinit var soundPool:SoundPool

    /**
     * URI of the sample - used to get file
     */
    var uri:Uri = Uri.EMPTY

    /**
     * File path to sample
     */
    var samplePath:String = ""

    /**
     * Maximum number of sounds that can occur at once in the SoundPool
     */
    val maxStreams = 4

    /**
     * A master volume for both left and right channels
     */
    var masterVolume = 0.9f

    /**
     * Independent volume for the left channel
     */
    var leftVolume = 0.9f

    /**
     * Independent volume for the right channel
     */
    var rightVolume = 0.9f

    /**
     * Panning control
     * Pan is the location of sound in stereo.
     * 0 is hard left 100 is hard right.
     */
    var pan = 50

    /**
     * Soundpool audio priority
     */
    private val priority = 1

    /**
     * Variables for the ID numbers used for the soundpool to identify the samples
     */
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

        /**
         * AudioAttributes for the Soundpool
         */
        val audioAttributes = AudioAttributes.Builder()
                .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                .setFlags(AudioAttributes.FLAG_AUDIBILITY_ENFORCED)
                .setUsage(AudioAttributes.USAGE_MEDIA)
                .build()

        /**
         * SoundPool is used to trigger the samples
         */
        soundPool = SoundPool.Builder()
                .setMaxStreams(maxStreams)
                .setAudioAttributes(audioAttributes)
                .build()

        /**
         * OnLoadCompleteListener - displays a toast when a sample is loaded into the SoundPool
         */
        var listener:SoundPool.OnLoadCompleteListener = SoundPool.OnLoadCompleteListener(function = { sp: SoundPool, i: Int, i1: Int ->
            Toast.makeText(this.applicationContext, "Loaded!", Toast.LENGTH_SHORT).show()
        })
        soundPool.setOnLoadCompleteListener(listener)


        val trigger1: Button = findViewById(R.id.trigger1)
        /**
         * Long press to change sample
         */
        trigger1.setOnLongClickListener {
            //TODO Load samples
            return@setOnLongClickListener true
        }


        /**
         * Tap to trigger sample
         */
        trigger1.setOnClickListener()
    }

    private fun playSample(id:Int) {
        Toast.makeText(this.applicationContext,"Playing " + id, Toast.LENGTH_SHORT).show()
        soundPool.play(id, leftVolume, rightVolume, priority, 0, 1f)
    }

    private fun loadSample():Int{
        return soundPool.load(samplePath,priority)
    }

    class Trigger(id:Int, sp:SoundPool):View.OnClickListener{
        val ident:Int = id
        val pool:SoundPool = sp
        override fun onClick(v: View?) {
                pool.play(ident,0.9f,0.9f,1,0,1f)
        }

    }

}
