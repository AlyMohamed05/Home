package com.silverbullet.home.bluetooth

import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothManager
import android.content.Context
import androidx.core.content.ContextCompat
import javax.inject.Inject

class BluetoothHandlerImpl @Inject constructor(
    appContext: Context
) : BluetoothHandler {

    private var _bluetoothAdapter: BluetoothAdapter? = null
    private val bluetoothAdapter: BluetoothAdapter
        get() = _bluetoothAdapter!!

    override val isInitialized: Boolean
        get() = _bluetoothAdapter != null

    override val isEnabled: Boolean
        get() = _bluetoothAdapter?.isEnabled ?: false

    init {
        val bluetoothManager: BluetoothManager? =
            ContextCompat.getSystemService(appContext, BluetoothManager::class.java)
        _bluetoothAdapter = bluetoothManager?.adapter
    }

}