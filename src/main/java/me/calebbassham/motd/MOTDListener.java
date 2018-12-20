package me.calebbassham.motd;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class MOTDListener implements Listener {

    private MOTD plugin;

    private MOTDListener(MOTD plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onServerInfo(ServerListPingEvent e) {
        e.setMotd(plugin.getLine1() + "\n" + plugin.getLine2());
    }

    public static MOTDListener register(MOTD plugin) {
        var instance = new MOTDListener(plugin);
        Bukkit.getPluginManager().registerEvents(instance, plugin);
        return instance;
    }

}
