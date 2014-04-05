package net.kingdomsofarden.andrew2060.invasion.dimensions;

import java.io.File;

import net.kingdomsofarden.andrew2060.invasion.InvasionPlugin;

import org.bukkit.Bukkit;
import org.bukkit.World;

import com.onarandombox.MultiverseCore.api.MVWorldManager;
import com.onarandombox.MultiverseCore.api.MultiversePlugin;

public class DimensionManager {
    
    public enum DimensionType {
        UNDERWORLD("UnderWorld"),
        HELL("Hell"),
        END("End");
        
        private String baseWorldName;
        
        DimensionType(String name) {
            this.baseWorldName = name;
        }
        
        public String getName() {
            return this.baseWorldName;
        }
        
    }
    
    private MVWorldManager worldMan;
    
    public DimensionManager() {
        MultiversePlugin plugin = ((MultiversePlugin)Bukkit.getServer().getPluginManager().getPlugin("Multiverse-Core"));
        this.worldMan = plugin.getCore().getMVWorldManager();
    }
    
    public World generateNewDimension(DimensionType type) {
        String baseName = type.getName();
        File file = new File(InvasionPlugin.instance.getDataFolder().getPath() + "Dimensions" + File.pathSeparator + baseName);
        
        return null;
        
    }
}
