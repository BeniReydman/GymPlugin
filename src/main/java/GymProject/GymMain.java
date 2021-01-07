package GymProject;

import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameInitializationEvent;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;

// Imports for logger
import com.google.inject.Inject;
import org.slf4j.Logger;

@Plugin(id = "GymPlugin", name = "Gym Leader Plugin", version = "1.0", description = "Gym Leader Plugin for Pixelmon")
public class GymMain {

    @Inject
    private Logger logger;

    public static void main(String[] args) {
    	// TODO 
    }
    
    @Listener
    public void onServerStart(GameStartedServerEvent event) {
        logger.info("Successfully running GymPlugin!");
    }
    
    @Listener
    public void onInitialization(GameInitializationEvent event) {
    	// TODO
    }

}
