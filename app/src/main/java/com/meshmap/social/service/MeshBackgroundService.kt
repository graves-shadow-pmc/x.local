package com.meshmap.social.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.meshmap.social.mesh.BluetoothMeshNetworkManager

// Background service for mesh/networking
class MeshBackgroundService : Service() {
    private lateinit var meshManager: BluetoothMeshNetworkManager

    override fun onCreate() {
        super.onCreate()
        meshManager = BluetoothMeshNetworkManager(applicationContext)
        meshManager.startDiscovery()
    }

    override fun onDestroy() {
        meshManager.stopDiscovery()
        super.onDestroy()
    }

    override fun onBind(intent: Intent?): IBinder? = null
}