package au.ninsto.airpods;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class CommandAirCreate implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        Player player = (Player) sender;
        ItemStack item = player.getItemInHand();
        if (sender instanceof Player) {
                if (item.getType() == Material.IRON_BOOTS && item.getItemMeta().getDisplayName().contains("AirPods")) {
                    ItemStack ironboot = player.getItemInHand();
                    ItemStack AirPods = new ItemStack(Material.IRON_BOOTS, 1);
                    ItemMeta AirPodsMeta = AirPods.getItemMeta();
                    ArrayList<String> lore = new ArrayList<String>();
                    lore.add("Airpods by Apple");
                    AirPodsMeta.setLore(lore);
                    AirPodsMeta.setDisplayName("§9§lAirPods");
                    AirPods.setItemMeta(AirPodsMeta);
                    player.getInventory().remove(ironboot);
                    player.getInventory().addItem(new ItemStack(AirPods));
                    return true;
                }else{
                    player.sendMessage("§cThey have to be named AirPods in an Anvil!");
                    return true;
                }
            }
return false;
}
}