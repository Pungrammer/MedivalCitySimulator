package org.pungrammer.medivalcitysim.entity.tiles;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.pungrammer.medivalcitysim.entity.faction.Faction;

@EqualsAndHashCode(callSuper = true)
public class GoverningDistrict extends SettlementDistrict {
    public GoverningDistrict(String name, long wealth, Faction officialFaction, Faction unofficialFaction, int unofficialFactionStealth) {
        super(name, wealth, officialFaction, unofficialFaction, unofficialFactionStealth);
    }
}
