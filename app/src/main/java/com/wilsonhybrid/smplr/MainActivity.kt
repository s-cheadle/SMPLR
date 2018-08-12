package com.wilsonhybrid.smplr

import android.app.Activity
import android.content.Context
import android.media.AudioAttributes
import android.media.SoundPool
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import android.content.Intent
import android.database.Cursor
import android.util.Log
import java.io.File
import java.net.URISyntaxException


class MainActivity : AppCompatActivity() {

    /**
     * Soundpool loads samples and triggers the identified sample when commanded
     */
    private lateinit var soundPool: SoundPool

    /**
     * Maximum number of sounds that can occur at once in the SoundPool
     */
    private val maxStreams = 4

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
     * Soundpool priority
     * Apparently has no effect and should be 1 for compatability reasons...
     */
    private val priority = 1

    /**
     * File select code - for the file chooser
     */
    private val fileSelectCode = 0

    /**
     * Buttons to be used for the triggers
     */
    lateinit var trigger1: Button
    lateinit var trigger2: Button
    lateinit var trigger3: Button
    lateinit var trigger4: Button
    lateinit var trigger5: Button
    lateinit var trigger6: Button
    lateinit var trigger7: Button
    lateinit var trigger8: Button
    lateinit var trigger9: Button
    lateinit var trigger10: Button
    lateinit var trigger11: Button
    lateinit var trigger12: Button
    lateinit var trigger13: Button
    lateinit var trigger14: Button
    lateinit var trigger15: Button
    lateinit var trigger16: Button

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
         * SoundPool is built with 4 maximum streams
         */
        soundPool = SoundPool.Builder()
                .setMaxStreams(maxStreams)
                .setAudioAttributes(audioAttributes)
                .build()

        /**
         * OnLoadCompleteListener - displays a toast when a sample is loaded into the SoundPool
         */
        soundPool.setOnLoadCompleteListener { sp: SoundPool, i: Int, i1: Int ->
            Toast.makeText(this.applicationContext, "Sample loaded!", Toast.LENGTH_SHORT).show()
        }


        /**
         * Trigger button for ID1
         */
        trigger1 = findViewById(R.id.trigger1)

        /**
         * Long press to change ID1
         */
        trigger1.setOnLongClickListener {
            //TODO Load samples
            ID1 = soundPool.load(applicationContext, R.raw.clap, priority)
            return@setOnLongClickListener true
        }

        /**
         * Tap to trigger ID1
         */
        trigger1.setOnClickListener {
            playSample(ID1)
        }

        /**
         * Trigger button for ID2
         */
        trigger2 = findViewById(R.id.trigger2)

        /**
         * Long press to change ID2
         */
        trigger2.setOnLongClickListener {
            //TODO Load samples
            ID2 = soundPool.load(applicationContext, R.raw.kick, priority)
            return@setOnLongClickListener true
        }

        /**
         * Tap to trigger ID2
         */
        trigger2.setOnClickListener {
            playSample(ID2)
        }

        /**
         * Trigger button for ID3
         */
        trigger3 = findViewById(R.id.trigger3)

        /**
         * Long press to change ID3
         */
        trigger3.setOnLongClickListener {
            //TODO Load samples
            ID3 = soundPool.load(applicationContext, R.raw.clap, priority)
            return@setOnLongClickListener true
        }

        /**
         * Tap to trigger ID3
         */
        trigger3.setOnClickListener {
            playSample(ID3)
        }

        /**
         * Trigger button for ID4
         */
        trigger4 = findViewById(R.id.trigger4)

        /**
         * Long press to change ID4
         */
        trigger4.setOnLongClickListener {
            //TODO Load samples
            ID4 = soundPool.load(applicationContext, R.raw.clap, priority)
            return@setOnLongClickListener true
        }

        /**
         * Tap to trigger ID4
         */
        trigger4.setOnClickListener {
            playSample(ID4)
        }

        /**
         * Trigger button for ID5
         */
        trigger5 = findViewById(R.id.trigger5)

        /**
         * Long press to change ID5
         */
        trigger5.setOnLongClickListener {
            //TODO Load samples
            ID5 = soundPool.load(applicationContext, R.raw.clap, priority)
            return@setOnLongClickListener true
        }

        /**
         * Tap to trigger ID5
         */
        trigger5.setOnClickListener {
            playSample(ID5)
        }

        /**
         * Trigger button for ID6
         */
        trigger6 = findViewById(R.id.trigger6)

        /**
         * Long press to change ID6
         */
        trigger6.setOnLongClickListener {
            //TODO Load samples
            ID6 = soundPool.load(applicationContext, R.raw.clap, priority)
            return@setOnLongClickListener true
        }

        /**
         * Tap to trigger ID6
         */
        trigger6.setOnClickListener {
            playSample(ID6)
        }

        /**
         * Trigger button for ID7
         */
        trigger7 = findViewById(R.id.trigger7)

        /**
         * Long press to change ID7
         */
        trigger7.setOnLongClickListener {
            //TODO Load samples
            ID7 = soundPool.load(applicationContext, R.raw.clap, priority)
            return@setOnLongClickListener true
        }

        /**
         * Tap to trigger ID7
         */
        trigger7.setOnClickListener {
            playSample(ID7)
        }

        /**
         * Trigger button for ID8
         */
        trigger8 = findViewById(R.id.trigger8)

        /**
         * Long press to change ID8
         */
        trigger8.setOnLongClickListener {
            //TODO Load samples
            ID8 = soundPool.load(applicationContext, R.raw.clap, priority)
            return@setOnLongClickListener true
        }

        /**
         * Tap to trigger ID8
         */
        trigger8.setOnClickListener {
            playSample(ID8)
        }

        /**
         * Trigger button for ID9
         */
        trigger9 = findViewById(R.id.trigger9)

        /**
         * Long press to change ID9
         */
        trigger9.setOnLongClickListener {
            //TODO Load samples
            ID9 = soundPool.load(applicationContext, R.raw.clap, priority)
            return@setOnLongClickListener true
        }

        /**
         * Tap to trigger ID9
         */
        trigger9.setOnClickListener {
            playSample(ID9)
        }

        /**
         * Trigger button for ID10
         */
        trigger10 = findViewById(R.id.trigger10)

        /**
         * Long press to change ID10
         */
        trigger10.setOnLongClickListener {
            //TODO Load samples
            ID10 = soundPool.load(applicationContext, R.raw.clap, priority)
            return@setOnLongClickListener true
        }

        /**
         * Tap to trigger ID
         */
        trigger10.setOnClickListener {
            playSample(ID10)
        }

        /**
         * Trigger button for ID11
         */
        trigger11 = findViewById(R.id.trigger11)

        /**
         * Long press to change ID11
         */
        trigger11.setOnLongClickListener {
            //TODO Load samples
            ID11 = soundPool.load(applicationContext, R.raw.clap, priority)
            return@setOnLongClickListener true
        }

        /**
         * Tap to trigger ID11
         */
        trigger11.setOnClickListener {
            playSample(ID11)
        }

        /**
         * Trigger button for ID12
         */
        trigger12 = findViewById(R.id.trigger12)

        /**
         * Long press to change ID12
         */
        trigger12.setOnLongClickListener {
            //TODO Load samples
            ID12 = soundPool.load(applicationContext, R.raw.clap, priority)
            return@setOnLongClickListener true
        }

        /**
         * Tap to trigger ID12
         */
        trigger12.setOnClickListener {
            playSample(ID12)
        }

        /**
         * Trigger button for ID13
         */
        trigger13 = findViewById(R.id.trigger13)

        /**
         * Long press to change ID13
         */
        trigger13.setOnLongClickListener {
            //TODO Load samples
            ID13 = soundPool.load(applicationContext, R.raw.clap, priority)
            return@setOnLongClickListener true
        }

        /**
         * Tap to trigger ID13
         */
        trigger13.setOnClickListener {
            playSample(ID13)
        }

        /**
         * Trigger button for ID14
         */
        trigger14 = findViewById(R.id.trigger14)

        /**
         * Long press to change ID14
         */
        trigger14.setOnLongClickListener {
            //TODO Load samples
            ID14 = soundPool.load(applicationContext, R.raw.clap, priority)
            return@setOnLongClickListener true
        }

        /**
         * Tap to trigger ID14
         */
        trigger14.setOnClickListener {
            playSample(ID14)
        }

        /**
         * Trigger button for ID15
         */
        trigger15 = findViewById(R.id.trigger15)

        /**
         * Long press to change ID15
         */
        trigger15.setOnLongClickListener {
            //TODO Load samples
            ID15 = soundPool.load(applicationContext, R.raw.clap, priority)
            return@setOnLongClickListener true
        }

        /**
         * Tap to trigger ID
         */
        trigger15.setOnClickListener {
            playSample(ID15)
        }

        /**
         * Trigger button for ID16
         */
        trigger16 = findViewById(R.id.trigger16)

        /**
         * Long press to change ID16
         */
        trigger16.setOnLongClickListener {
            //TODO Load samples
            ID16 = soundPool.load(applicationContext, R.raw.clap, priority)
            return@setOnLongClickListener true
        }

        /**
         * Tap to trigger ID16
         */
        trigger16.setOnClickListener {
            playSample(ID16)
        }

    }

    private fun playSample(id: Int) {
        soundPool.play(id, leftVolume, rightVolume, priority, 0, 1f)
    }

    private fun loadSample() {
        //TODO Get the loading to work
    }

    /**
     * Opens the File manager
     */
    private fun showFileChooser() {
        val intent = intent
        intent.type = "audio/*"
        intent.addCategory(Intent.CATEGORY_OPENABLE)
        setResult(Activity.RESULT_OK,intent)

        try {
            startActivityForResult(Intent.createChooser(intent, "Choose Sample"), fileSelectCode)
        } catch (ex: android.content.ActivityNotFoundException) {
            Toast.makeText(this, "Please install a File Manager.", Toast.LENGTH_SHORT).show()
        }
    }

    /**
     *
     */
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent) {
        if (resultCode != Activity.RESULT_CANCELED && requestCode == Activity.RESULT_OK && data != null) {
            //data.extras!!.get("data")
            val uri = data.data
            //getPath(applicationContext,uri)
            Toast.makeText(applicationContext, "sample: " + uri.toString(), Toast.LENGTH_SHORT).show()
        }else{
            return
        }
    }

    /**
     *
     */
    @Throws(URISyntaxException::class)
    private fun getPath(context: Context, uri: Uri): String? {
        if ("content".equals(uri.scheme, ignoreCase = true)) {
            val projection = arrayOf("_data")
            val cursor: Cursor?

            try {
                cursor = context.contentResolver.query(uri, projection, null, null, null)
                val columnIndex = cursor!!.getColumnIndexOrThrow("_data")
                if (cursor.moveToFirst()) {
                    return cursor.getString(columnIndex)
                }
            } catch (e: Exception) {
                Log.e(null,"Something went wrong")
            }
        } else if ("file".equals(uri.scheme, ignoreCase = true)) {
            return uri.path
        }
        return null
    }

    /**
     *Returns a File object for the given file
     */
    private fun getFile(deviceFolderPath: String, dbFilePath: String): File? {

        val path = deviceFolderPath + File.separator + dbFilePath

        return getExternalFilesDir(path)
    }

}
