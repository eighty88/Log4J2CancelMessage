package com.github.eighty88.log4j2;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.regex.Pattern;

public final class CancelMessage extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new Listener() {
            final Pattern pattern = Pattern.compile("\\$\\{.*}");

            @EventHandler
            public void onPlayerChat(AsyncPlayerChatEvent e) {
                if (pattern.matcher(e.getMessage()).find()) {
                    e.setMessage("<" + e.getPlayer().getName() + "> ***********************");
                }
            }
        }, this);
    }
}
