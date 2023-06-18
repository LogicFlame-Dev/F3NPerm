package de.redgames.f3nperm.provider;

import de.redgames.f3nperm.reflection.ReflectionException;
import de.redgames.f3nperm.reflection.Reflections;

public class ReflectionProvider_v1_20_R1 extends ReflectionProvider_v1_19_R3 {
    @Override
    public Object getPlayerConnection(Object entityPlayer) throws ReflectionException {
        return Reflections.get(entityPlayer, "c");
    }
}
