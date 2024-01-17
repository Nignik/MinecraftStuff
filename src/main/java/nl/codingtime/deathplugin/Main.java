package nl.codingtime.deathplugin;

import nl.codingtime.deathplugin.listeners.DeathListener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getLogger().info("Plugin has been enabled");
        new DeathListener(this);
    }
}
