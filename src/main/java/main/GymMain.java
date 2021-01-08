package main;

import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameInitializationEvent;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.javalite.activejdbc.Base;

// Imports for logger
import com.google.inject.Inject;
import org.slf4j.Logger;

// Import packages
import commands.CommandBuilder;
import db_entities.*;

@Plugin(id = "gymplugin", name = "GymPlugin", version = "1.0", description = "Gym Leader Plugin for Pixelmon")
public class GymMain {

    @Inject
    private Logger logger;

    public static void main(String[] args) {
    		// Open up DB
    		Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/test", "user1", "xxxxx");
    	}

    
    @Listener
    public void onServerStart(GameStartedServerEvent event) {
        logger.info("GymPlugin is running.");
    }
    
    @Listener
    public void onInitialization(GameInitializationEvent event) {
    	// Random insertion *delete*
    	new GymLeader().set("id", "123").saveIt();
    	
    	CommandBuilder.buildCommands(this);
    }

}
