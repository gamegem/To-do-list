package com.todolist;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import javax.inject.Inject;
import com.todolist.TodolistPlugin;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.ComponentConstants;

public class TodolistOverlay extends OverlayPanel{

    public static final Color TITLED_CONTENT_COLOR = new Color(190,190,190);

    private final TodolistPlugin plugin;

    @Inject
    public TodolistOverlay(TodolistPlugin plugin){
        this.plugin = plugin;
        setPriority(OverlayPriority.LOW);
    }

}
