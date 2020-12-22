package com.todolist;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemComposition;
import net.runelite.api.ItemContainer;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.infobox.InfoBoxManager;
import net.runelite.client.game.ItemManager;

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

	@Inject
	private InfoBoxManager infoBoxManager;

	@Inject
	private ItemManager itemManager;

	private int tickcount = 0;

	@Override
	protected void startUp() throws Exception
	{


	}

	@Override
	protected void shutDown() throws Exception
	{

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
