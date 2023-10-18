package org.icycream.foliaplugins;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class CustomRecipes {

    public static void registerRecipes() {
        // Register recipes here
        Bukkit.getServer().getLogger().info("Recipes registered!");
        ShapedRecipe bundler_Recipe = new ShapedRecipe(
                new NamespacedKey(IcyCreamFoliaPlugins.getInstance(), "bundler_recipe"),
                new ItemStack(Material.BUNDLE));

        bundler_Recipe.shape("SLS", "L L", "LLL");
        bundler_Recipe.setIngredient('L', Material.LEATHER);
        bundler_Recipe.setIngredient('S', Material.STRING);
        Bukkit.addRecipe(bundler_Recipe, true);
    }
}
