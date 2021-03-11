
package net.mcreator.daweedmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.daweedmod.item.HempItem;
import net.mcreator.daweedmod.DaWeedModModElements;

@DaWeedModModElements.ModElement.Tag
public class DaWeedModItemGroup extends DaWeedModModElements.ModElement {
	public DaWeedModItemGroup(DaWeedModModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabda_weed_mod") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(HempItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
