/*
 * The MIT License (MIT)
 *
 * FXGL - JavaFX Game Library
 *
 * Copyright (c) 2015 AlmasB (almaslvl@gmail.com)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.almasb.fxgl.settings;

import com.almasb.fxgl.app.ApplicationMode;
import com.almasb.fxgl.scene.menu.MenuStyle;
import javafx.scene.input.KeyCode;

/**
 * Data structure for variables that are
 * initialised before the application (game) starts.
 * <p>
 * Modifying any data after the start of the game has no effect.
 *
 * @author Almas Baimagambetov (AlmasB) (almaslvl@gmail.com)
 */
public final class GameSettings extends ReadOnlyGameSettings {

    /**
     * Set title of the game. This will be shown as the
     * window header if the game isn't fullscreen.
     *
     * @param title app title
     * @defaultValue "Untitled FXGL Game Application"
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Set target width. If the screen width is smaller,
     * the game will automatically scale down the image
     * while maintaining the aspect ratio.
     * <p>
     * All the game logic must use target width and height.
     *
     * @param width target width
     * @defaultValue 800
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Set target height. If the screen height is smaller,
     * the game will automatically scale down the image
     * while maintaining the aspect ratio.
     * <p>
     * All the game logic must use target width and height.
     *
     * @param height target height
     * @defaultValue 600
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Set version of the game.
     *
     * @param version app version
     * @defaultValue 0.0
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * If set to true, the intro video/animation will
     * be played before the start of the game
     *
     * @param b intro flag
     * @defaultValue true
     */
    public void setIntroEnabled(boolean b) {
        introEnabled = b;
    }

    /**
     * Setting to true enables main and game menu.
     *
     * @param b menu flag
     * @defaultValue true
     */
    public void setMenuEnabled(boolean b) {
        menuEnabled = b;
    }

    /**
     * Set file name of the icon to be used
     * as the application icon.
     * <p>
     * The file must be placed under /assets/ui/icons/ .
     * The name must be given in the form relative to that
     * path. E.g. "icon.png"
     *
     * @param iconFileName icon file name
     * @defaultValue fxgl_icon.png
     */
    public void setIconFileName(String iconFileName) {
        this.iconFileName = iconFileName;
    }

    /**
     * Setting to true will start the game in fullscreen mode.
     *
     * @param b fullscreen flag
     * @defaultValue false
     */
    public void setFullScreen(boolean b) {
        fullScreen = b;
    }

    /**
     * Setting to true will show render and performance FPS
     * in the bottom left corner.
     *
     * @param b show fps flag
     * @defaultValue true
     */
    public void setShowFPS(boolean b) {
        showFPS = b;
    }

    /**
     * Sets application run mode. See {@link ApplicationMode} for more info.
     *
     * @param mode app mode
     * @defaultValue {@link ApplicationMode#DEVELOPER}
     */
    public void setApplicationMode(ApplicationMode mode) {
        this.appMode = mode;
    }

    /**
     * Sets the name of the default font. The font file
     * must be located in assets/ui/fonts/
     *
     * @param name default font name to use
     * @defaultValue Copperplate_Gothic_Light_Regular.ttf
     */
    public void setDefaultFontName(String name) {
        this.defaultFontName = name;
    }

    /**
     * Set globally applied CSS. The CSS will be loaded from "/assets/ui/css/"
     *
     * @param name CSS file name
     */
    public void setCSS(String name) {
        this.css = name;
    }

    /**
     * Set the menu style to use.
     *
     * @param style menu style
     */
    public void setMenuStyle(MenuStyle style) {
        this.menuStyle = style;
    }

    public void setMenuKey(KeyCode menuKey) {
        this.menuKey = menuKey;
    }

    /**
     *
     * @return a read only copy of settings
     */
    public ReadOnlyGameSettings toReadOnly() {
        return new ReadOnlyGameSettings(this);
    }
}
