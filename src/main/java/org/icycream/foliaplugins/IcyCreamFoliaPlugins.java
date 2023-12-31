package org.icycream.foliaplugins;

import org.bukkit.plugin.java.JavaPlugin;

public final class IcyCreamFoliaPlugins extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("IcyCreamFoliaPlugins has been enabled!");
        CustomRecipes.registerRecipes();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("IcyCreamFoliaPlugins has been disabled!");
    }

    public static IcyCreamFoliaPlugins getInstance() {
        return getPlugin(IcyCreamFoliaPlugins.class);
    }
}
