package be4rjp.sclat;

import java.io.File;
import static org.bukkit.Bukkit.getLogger;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

/**
 *
 * @author Be4rJP
 */
public class Config {
    private FileConfiguration ps;
    private FileConfiguration conf;
    private FileConfiguration weapon;
    private FileConfiguration map;
    private FileConfiguration playersettings;
    private File psf = new File("plugins/Sclat", "class.yml");
    private File weaponf = new File("plugins/Sclat", "mainnweapon.yml");
    private File mapf = new File("plugins/Sclat", "maps.yml");
    private File conff = new File("plugins/Sclat", "config.yml");
    private File playersettings_f = new File("plugins/Sclat", "settings.yml");
    
    public synchronized void LoadConfig(){
        ps = YamlConfiguration.loadConfiguration(psf);
        conf = YamlConfiguration.loadConfiguration(conff);
        weapon = YamlConfiguration.loadConfiguration(weaponf);
        map = YamlConfiguration.loadConfiguration(mapf);
        playersettings = YamlConfiguration.loadConfiguration(playersettings_f);
    }
    
    public synchronized void SaveConfig(){
        try{
            playersettings.save(playersettings_f);
        }catch(Exception e){
            getLogger().warning("Failed to save config files!");
        }
    }
    
    public FileConfiguration getConfig(){
        return conf;
    }
    
    public FileConfiguration getClassConfig(){
        return ps;
    }
    
    public FileConfiguration getWeaponConfig(){
        return weapon;
    }
    
    public FileConfiguration getMapConfig(){
        return map;
    }
    
    public FileConfiguration getPlayerSetiings(){
        return playersettings;
    }
}
