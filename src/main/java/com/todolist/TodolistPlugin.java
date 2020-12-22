package com.todolist;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

@Slf4j
@PluginDescriptor(
	name = "To-do List",
	description = "Create your own To-do Lists"
)
public class TodolistPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private TodolistConfig config;

	@Override
	protected void startUp() throws Exception
	{
		log.info("To-do Plugin Initiated and  WORKS !!");
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.info("To-do Plugin NO WORK :'( ");
	}
	int tickcount = 0;

	@Subscribe
	public void onGameStateChanged(GameStateChanged gameStateChanged)
	{
		if (gameStateChanged.getGameState() == GameState.LOGGED_IN)
		{
			client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "Example says " + config.greeting(), null);
		}
	}
	@Subscribe
	public void onGameTick(GameTick event){

		if(config.MyBool()){

			client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "Current Tick: " + tickcount , null);
			tickcount++;
		}

		if(config.bankNPCtag()){
			
		}


	}

	@Provides
	TodolistConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(TodolistConfig.class);
	}
}
