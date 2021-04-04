package org.pungrammer.medivalcitysim.entity.tiles;

import lombok.EqualsAndHashCode;
import org.pungrammer.medivalcitysim.entity.faction.Faction;

@EqualsAndHashCode(callSuper = true)
public class ReligiousDistrict extends SettlementDistrict {
    public ReligiousDistrict(String name, long wealth, Faction officialFaction, Faction unofficialFaction, int unofficialFactionStealth) {
        super(name, wealth, officialFaction, unofficialFaction, unofficialFactionStealth);
    }
}
