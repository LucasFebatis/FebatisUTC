package com.febatis.febatisutc.activity

import me.dm7.barcodescanner.zxing.ZXingScannerView
import android.os.Bundle
import android.app.Activity
import android.content.Intent
import com.google.zxing.Result


class SimpleScannerActivity : Activity(), ZXingScannerView.ResultHandler {
    private var mScannerView: ZXingScannerView? = null

    public override fun onCreate(state: Bundle?) {
        super.onCreate(state)
        mScannerView = ZXingScannerView(this)   // Programmatically initialize the scanner view
        setContentView(mScannerView)                    // Set the scanner view as the content view
    }

    public override fun onResume() {
        super.onResume()
        mScannerView!!.setResultHandler(this) // Register ourselves as a handler for scan results.
        mScannerView!!.startCamera()          // Start camera on resume
    }

    public override fun onPause() {
        super.onPause()
        mScannerView!!.stopCamera()           // Stop camera on pause
    }

    override fun handleResult(rawResult: Result) {

        val intent = Intent()
        intent.putExtra("text", rawResult.text);
        intent.putExtra("barcodeFormat", rawResult.barcodeFormat.toString());

        setResult(RESULT_OK, intent)
        finish()

        // If you would like to resume scanning, call this method below:
        // mScannerView!!.resumeCameraPreview(this)
    }
}