package fr.azmog.chill;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public String prefix = "§d§lChill §7>> ";

    public static Main instance;

    @Override
    public void onEnable() {
        instance = this;
    }

    public static Main getInstance() {
        return instance;
    }
}