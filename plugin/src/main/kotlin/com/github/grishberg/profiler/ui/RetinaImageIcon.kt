package com.github.grishberg.profiler.ui

import com.intellij.util.ui.UIUtil
import java.awt.Component
import java.awt.Graphics
import java.awt.Image
import javax.swing.ImageIcon

class RetinaImageIcon(image: Image) : ImageIcon(image, "") {

    @Synchronized
    override fun paintIcon(c: Component, g: Graphics, x: Int, y: Int) {
        UIUtil.drawImage(g, this.image, x, y, null)
    }
}