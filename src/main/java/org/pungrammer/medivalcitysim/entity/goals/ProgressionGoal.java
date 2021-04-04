package org.pungrammer.medivalcitysim.entity.goals;

import lombok.Data;
import org.pungrammer.medivalcitysim.entity.faction.Faction;

@Data
public abstract class ProgressionGoal {

    private Faction source;
    private Faction target;

    public abstract void success();
    public abstract void fail();
}
