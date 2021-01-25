package br.com.Belezaman.Plugin;

import org.bukkit.entity.Pig;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class PluginEventHandler implements Listener {
	
	@EventHandler
	void onClick(PlayerInteractEntityEvent event)
	{
		if(event.getRightClicked() instanceof Pig) 
		{
			Pig pig = (Pig) event.getRightClicked();
			pig.getWorld().createExplosion(pig.getLocation(), 4f, true);
		}
		return;
	}
}
