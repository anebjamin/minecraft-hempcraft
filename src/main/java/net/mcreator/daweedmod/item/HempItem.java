
package net.mcreator.daweedmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.daweedmod.itemgroup.DaWeedModItemGroup;
import net.mcreator.daweedmod.DaWeedModModElements;

@DaWeedModModElements.ModElement.Tag
public class HempItem extends DaWeedModModElements.ModElement {
	@ObjectHolder("da_weed_mod:hemp")
	public static final Item block = null;
	public HempItem(DaWeedModModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(DaWeedModItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("hemp");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
