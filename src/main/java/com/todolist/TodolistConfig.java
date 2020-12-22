package com.todolist;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("To-do List")
public interface TodolistConfig extends Config
{
	@ConfigItem(
		keyName = "greeting",
		name = "Welcome Greeting",
		description = "The message to show to the user when they login"
	)
	default String greeting()
	{
		return "Hello";
	}

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
