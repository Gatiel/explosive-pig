package br.com.Belezaman.Plugin;

import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;

public class PorcosExplosivos extends JavaPlugin {

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new PluginEventHandler(), this);
	}
	
	@Override
	public void onDisable() {
		HandlerList.unregisterAll(this);
	}
}

	 