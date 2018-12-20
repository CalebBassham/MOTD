package me.calebbassham.motd;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class MOTD extends JavaPlugin {

    private String line1;
    private String line2;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        loadConfig();
        MOTDListener.register(this);
    }

    public String getLine1() {
        return this.line1;
    }

    public String getLine2() {
        return this.line2;
    }

    public void loadConfig() {
        var config = getConfig();
        this.line1 = ChatColor.translateAlternateColorCodes('&', config.getString("line 1"));
        this.line2 = ChatColor.translateAlternateColorCodes('&', config.getString("line 2"));
    }
}
