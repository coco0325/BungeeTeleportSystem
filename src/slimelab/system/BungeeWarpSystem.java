package slimelab.system;

import java.io.File;
import java.io.IOException;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.config.ConfigurationProvider;
import net.md_5.bungee.config.YamlConfiguration;
import net.md_5.bungee.config.Configuration;

public class BungeeWarpSystem extends Plugin {
	
	private File config, data;
	private Configuration configuration, datac;
	
	
	@Override
	public void onEnable() {
		config = new File(getDataFolder(), "config.yml");
		data = new File(getDataFolder(), "data.yml");
		try {
			if(!config.exists()) {
				config.createNewFile();
				getLogger().info("Config file doesn's exists. Created Sucessfully!");
			}
			configuration = ConfigurationProvider.getProvider(YamlConfiguration.class).load(config);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			if(!data.exists()) {
				data.createNewFile();
				getLogger().info("Data file doesn's exists. Created Sucessfully!");
			}
			configuration = ConfigurationProvider.getProvider(YamlConfiguration.class).load(data);
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}
	
	@Override
	public void onDisable() {
		
	}
}
