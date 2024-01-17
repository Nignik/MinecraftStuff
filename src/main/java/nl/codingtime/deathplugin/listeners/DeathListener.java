package nl.codingtime.deathplugin.listeners;
import nl.codingtime.deathplugin.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import nl.codingtime.deathplugin.Main;
import nl.codingtime.deathplugin.discordwebhook.DiscordWebhook;

public class DeathListener implements Listener {
    private static Main plugin;

    public DeathListener (Main plugin) {
        this.plugin = plugin;

        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) throws Exception {
        Player player = event.getEntity();
        DiscordWebhook.hook(player.getDisplayName() + " died");
    }
}
