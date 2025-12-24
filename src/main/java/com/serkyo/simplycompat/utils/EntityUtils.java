package com.serkyo.simplycompat.utils;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;

import java.util.UUID;

public class EntityUtils {
    public static Entity getEntityFromUUID(UUID entityUUID, ServerLevel firstLevelToCheck) {
        Entity entity = firstLevelToCheck.getEntity(entityUUID);

        if (entity == null) {
            for (ServerLevel world : firstLevelToCheck.getServer().getAllLevels()) {
                entity = world.getEntity(entityUUID);

                if (entity != null) {
                    break;
                }
            }
        }
        return entity;
    }
}
