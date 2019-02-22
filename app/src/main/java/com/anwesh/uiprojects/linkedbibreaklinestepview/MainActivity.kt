package com.anwesh.uiprojects.linkedbibreaklinestepview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.bibreaklinestepview.BiBreakLineStepView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BiBreakLineStepView.create(this)
    }
}
