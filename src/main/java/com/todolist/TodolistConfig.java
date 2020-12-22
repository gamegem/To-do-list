package com.todolist;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("To-do List")
public interface TodolistConfig extends Config
{

	@ConfigItem(
			keyName = "MyBool",
			name = "Count Ticks",
			description = "Enable this to print a message of ticks"
	)
	default boolean MyBool(){return false;}

	@ConfigItem(
			keyName = "bankNPCtag",
			name = "Bank NPC Overlay",
			description = "Marks aree bank NPCs"
	)
	default boolean bankNPCtag(){return false;}

}
