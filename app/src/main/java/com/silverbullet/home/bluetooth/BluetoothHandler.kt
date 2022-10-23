package com.silverbullet.home.bluetooth

import android.bluetooth.BluetoothAdapter
import android.content.Intent

interface BluetoothHandler {

    /**
     * Indicates if the Bluetooth Adapter is initialized or not, if not then the app is not able to access
     * Bluetooth Service.
     * Don't conflict isInitialized with isEnabled which indicated the state of bluetooth is turned on or off.
     */
    val isInitialized: Boolean

    val isEnabled: Boolean

    companion object{

        fun getEnableBluetoothIntent() = Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE)

    }
}