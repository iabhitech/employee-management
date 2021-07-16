/*
 * Employee Management System
 * Designed By Abhineet Verma  * 
 */
package com.iabhitech.empmgmt.gui;

import java.awt.Color;
import java.awt.Component;

/**
 * Theme class to hold the current theme color and provide easy way to switch between different color theme.
 * The default supported theme: Dark Theme, Light Theme
 * @author Abhineet Verma
 */
public class Theme {

    /**
     * Component's Primary Foreground Color
     */
    public static Color textPrimary;

    /**
     * Component's Secondary Foreground Color
     */
    public static Color textSecondary;

    /**
     * Component's Primary Background Color
     */
    public static Color bgPrimary;

    /**
     * Component's Secondary Background Color
     */
    public static Color bgSecondary;

    /**
     * Dark Theme
     */
    public static final int DARK_THEME = 0;

    /**
     * Light Theme
     */
    public static final int LIGHT_THEME = 1;

    /**
     * Points to Current Selected Theme.
     * By Default It is Light Theme.
     */
    public static int CURRENT_THEME = 1;
    
    /**
     * Set the theme to DARK THEME or LIGHT THEME
     *
     * @param theme DARK THEME or LIGHT THEME
     * @see #DARK_THEME
     * @see #LIGHT_THEME
     */
    public static void setTheme(int theme) {
        if (theme == DARK_THEME) {
            textPrimary = Color.WHITE;
            textSecondary = Color.GRAY;
            bgPrimary = Color.BLACK;
            bgSecondary = Color.DARK_GRAY;
            CURRENT_THEME = DARK_THEME;
        } else {
            textPrimary = Color.BLACK;
            textSecondary = Color.DARK_GRAY;
            bgPrimary = Color.WHITE;
            bgSecondary = new Color(240, 240, 240);
            CURRENT_THEME = LIGHT_THEME;

        }
    }

    /**
     *
     * @param components An Array of components on which foreground color has to
     * be set.
     * @param color The color which has to be set on the components.
     */
    public static void setForeground(Component[] components, Color color) {
        for (Component c : components) {
            c.setForeground(color);
        }
    }

    /**
     *
     * @param components An Array of components on which background color has to
     * be set.
     * @param color The color which has to be set on the components.
     */
    public static void setBackground(Component[] components, Color color) {
        for (Component c : components) {
            c.setBackground(color);
        }
    }
}
