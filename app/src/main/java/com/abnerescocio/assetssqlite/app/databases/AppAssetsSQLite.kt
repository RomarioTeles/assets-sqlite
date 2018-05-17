package com.abnerescocio.assetssqlite.app.databases

import android.content.Context
import com.abnerescocio.assetssqlite.lib.AssetsSQLite

class AppAssetsSQLite(context: Context):
        AssetsSQLite(context, DATABASE_NAME) {

    companion object {
        const val DATABASE_NAME = "database.db"
    }
}