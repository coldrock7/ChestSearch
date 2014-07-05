package com.chestsearch.core.client;

import com.chestsearch.core.CommonProxy;
import com.chestsearch.core.event.Tick;

import cpw.mods.fml.common.FMLCommonHandler;


public class ClientProxy extends CommonProxy {
        
        @Override
        public void registerRenderers() {
              
        }
        @Override
        public void initialize() {
        	//set tick handler for finding items
        	FMLCommonHandler.instance().bus().register(new Tick());
        	
        	
        }
}