package au.ninsto.airpods;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandAirPlay implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            ItemStack item = player.getItemInHand();
            if (item.getType() == Material.IRON_BOOTS && item.getItemMeta() != null && item.getItemMeta().getLore() != null && item.getItemMeta().getLore().contains("Airpods by Apple")) {
                if (cmd.getName().equalsIgnoreCase("airplay")) {
                    if (args.length == 0) {
                        sender.sendMessage("You need to type a music disc!");
                        return true;
                    }

                    if (args[0].equalsIgnoreCase("cat")) {
                        player.playSound(player.getLocation(), Sound.MUSIC_DISC_CAT, Float.MAX_VALUE, 1);
                        player.sendMessage("§aNow Playing - cat");
                    } else if (args[0].equalsIgnoreCase("blocks")) {
                        player.playSound(player.getLocation(), Sound.MUSIC_DISC_BLOCKS, Float.MAX_VALUE, 1);
                        player.sendMessage("§aNow Playing - blocks");
                    } else if (args[0].equalsIgnoreCase("chirp")) {
                        player.playSound(player.getLocation(), Sound.MUSIC_DISC_CHIRP, Float.MAX_VALUE, 1);
                        player.sendMessage("§aNow Playing - chirp");
                    } else if (args[0].equalsIgnoreCase("far")) {
                        player.playSound(player.getLocation(), Sound.MUSIC_DISC_FAR, Float.MAX_VALUE, 1);
                        player.sendMessage("§aNow Playing - far");
                    } else if (args[0].equalsIgnoreCase("mall")) {
                        player.playSound(player.getLocation(), Sound.MUSIC_DISC_MALL, Float.MAX_VALUE, 1);
                        player.sendMessage("§aNow Playing - mall");
                    } else if (args[0].equalsIgnoreCase("mellohi")) {
                        player.playSound(player.getLocation(), Sound.MUSIC_DISC_MELLOHI, Float.MAX_VALUE, 1);
                        player.sendMessage("§aNow Playing - mellohi");
                    } else if (args[0].equalsIgnoreCase("stal")) {
                        player.playSound(player.getLocation(), Sound.MUSIC_DISC_STAL, Float.MAX_VALUE, 1);
                        player.sendMessage("§aNow Playing - stal");
                    } else if (args[0].equalsIgnoreCase("strad")) {
                        player.playSound(player.getLocation(), Sound.MUSIC_DISC_STRAD, Float.MAX_VALUE, 1);
                        player.sendMessage("§aNow Playing - strad");
                    } else if (args[0].equalsIgnoreCase("ward")) {
                        player.playSound(player.getLocation(), Sound.MUSIC_DISC_WARD, Float.MAX_VALUE, 1);
                        player.sendMessage("§aNow Playing - ward");
                    } else if (args[0].equalsIgnoreCase("11")) {
                        player.playSound(player.getLocation(), Sound.MUSIC_DISC_11, Float.MAX_VALUE, 1);
                        player.sendMessage("§aNow Playing - 11");
                    } else if (args[0].equalsIgnoreCase("13")) {
                        player.playSound(player.getLocation(), Sound.MUSIC_DISC_13, Float.MAX_VALUE, 1);
                        player.sendMessage("§aNow Playing - 13");
                    } else if (args[0].equalsIgnoreCase("wait")) {
                        player.playSound(player.getLocation(), Sound.MUSIC_DISC_WAIT, Float.MAX_VALUE, 1);
                        player.sendMessage("§aNow Playing - wait");
                    } else if (args[0].equalsIgnoreCase("music")) {
                        player.sendMessage("§aMusic Discs:");
                        player.sendMessage("§a- 13");
                        player.sendMessage("§a- cat");
                        player.sendMessage("§a- blocks");
                        player.sendMessage("§a- chirp");
                        player.sendMessage("§a- far");
                        player.sendMessage("§a- mall");
                        player.sendMessage("§a- mellohi");
                        player.sendMessage("§a- stal");
                        player.sendMessage("§a- strad");
                        player.sendMessage("§a- ward");
                        player.sendMessage("§a- 11");
                        player.sendMessage("§a- wait");
                    }
                }
            } else {
                player.sendMessage("§cYou do not have AirPods.");
            }
        }

        return true;
    }
}


