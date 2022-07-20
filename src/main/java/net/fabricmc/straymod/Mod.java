package net.fabricmc.straymod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;

public class Mod implements ModInitializer
{
    public static final Logger DEBUG = LoggerFactory.getLogger("straymod");

    @Override
    public void onInitialize()
    {
        DEBUG.info("[STRY]: Hello World from Mod Init!");
    }
}