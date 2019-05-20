package me.iclan.builders.items;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public interface ItemSpecification<T> {

    public T setDisplayName(String name);

    public T setLore(List<String> lore);

    public T unbreakable();

    public T addEnchantment(Enchantment enchantment, int strength);

    public T hideEnchants();

    public T hideFlags();

    public ItemStack build();
}
