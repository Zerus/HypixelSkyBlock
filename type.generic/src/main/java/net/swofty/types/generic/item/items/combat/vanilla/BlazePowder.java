package net.swofty.types.generic.item.items.combat.vanilla;

import net.swofty.types.generic.item.ItemTypeLinker;
import net.swofty.types.generic.item.ItemQuantifiable;
import net.swofty.types.generic.item.SkyBlockItem;
import net.swofty.types.generic.item.impl.CustomSkyBlockItem;
import net.swofty.types.generic.item.impl.DefaultCraftable;
import net.swofty.types.generic.item.impl.Sellable;
import net.swofty.types.generic.item.impl.SkyBlockRecipe;
import net.swofty.types.generic.item.impl.recipes.ShapedRecipe;
import net.swofty.commons.statistics.ItemStatistics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BlazePowder implements CustomSkyBlockItem, DefaultCraftable, Sellable {
    @Override
    public ItemStatistics getStatistics(SkyBlockItem instance) {
        return ItemStatistics.empty();
    }

    @Override
    public SkyBlockRecipe<?> getRecipe() {
        Map<Character, ItemQuantifiable> ingredientMap = new HashMap<>();
        ingredientMap.put('A', new ItemQuantifiable(ItemTypeLinker.BLAZE_ROD, 1));
        List<String> pattern = List.of(
                "A");

        return new ShapedRecipe(SkyBlockRecipe.RecipeType.NONE, new SkyBlockItem(ItemTypeLinker.BLAZE_POWDER, 2), ingredientMap, pattern);
    }

    @Override
    public double getSellValue() {
        return 4;
    }
}
