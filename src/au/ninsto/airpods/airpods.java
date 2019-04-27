package au.ninsto.airpods;
import org.bukkit.plugin.java.JavaPlugin;

public final class airpods extends JavaPlugin {

    @Override
    public void onEnable(){
        System.out.println("AirPods 0.1 mounted and ready!");
        this.getCommand("aircreate").setExecutor(new CommandAirCreate());
        this.getCommand("airplay").setExecutor(new CommandAirPlay());
        this.getCommand("airstop").setExecutor(new CommandAirStop());
    }

    @Override
    public void onDisable(){
        //Fired when the server stops and disables all plugins
    }

}

