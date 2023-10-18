package org.icycream.foliaplugins;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class CustomRecipes {
    public static void registerRecipes() {
        ShapedRecipe bundler_Recipe = new ShapedRecipe(
                new NamespacedKey(IcyCreamFoliaPlugins.getInstance(), "bundler_recipe"),
                new ItemStack(Material.BUNDLE));

        bundler_Recipe.setIngredient('L', Material.LEATHER);
        bundler_Recipe.setIngredient('S', Material.STRING);
        bundler_Recipe.shape("SLS", "L L", "LLL");
    }
}
