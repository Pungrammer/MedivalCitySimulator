package org.pungrammer.medivalcitysim.entity.faction;

import lombok.Data;
import org.pungrammer.medivalcitysim.entity.resource.Resource;
import org.pungrammer.medivalcitysim.entity.tiles.SettlementDistrict;

import java.util.Set;

@Data
public class Faction {
    private String name;

    private Resource resource;

    private Leader leader;

    private FactionType type;

    private Set<SettlementDistrict> controlledDistricts;

}
