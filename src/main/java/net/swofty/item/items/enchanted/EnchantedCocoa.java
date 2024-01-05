package net.swofty.item.items.enchanted;


import net.swofty.item.ItemType;
import net.swofty.item.impl.Enchanted;
import net.swofty.item.impl.SkyBlockRecipe;

public class EnchantedCocoa implements Enchanted {
    @Override
    public ItemType getCraftingMaterial() {
        return ItemType.COCOA;
    }

    @Override
    public SkyBlockRecipe.RecipeType getRecipeType() {
        return SkyBlockRecipe.RecipeType.FORAGING;
    }
}