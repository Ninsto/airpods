package au.ninsto.airpods;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandAirStop implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        ItemStack item = player.getItemInHand();
        if(item.getType() == Material.IRON_BOOTS && item.getItemMeta().getLore().contains("Airpods by Apple")) {
        if (sender instanceof Player) {
            player.stopSound(Sound.MUSIC_DISC_CAT);
            player.stopSound(Sound.MUSIC_DISC_11);
            player.stopSound(Sound.MUSIC_DISC_13);
            player.stopSound(Sound.MUSIC_DISC_MALL);
            player.stopSound(Sound.MUSIC_DISC_STAL);
            player.stopSound(Sound.MUSIC_DISC_STRAD);
            player.stopSound(Sound.MUSIC_DISC_MELLOHI);
            player.stopSound(Sound.MUSIC_DISC_WAIT);
            player.stopSound(Sound.MUSIC_DISC_WARD);
            player.stopSound(Sound.MUSIC_DISC_CHIRP);
            player.stopSound(Sound.MUSIC_DISC_FAR);
            player.stopSound(Sound.MUSIC_DISC_BLOCKS);
            return true;
    }
        } else {
            player.sendMessage("§cYou do not have AirPods.");
            return true;
        }
            return false;
    }
}