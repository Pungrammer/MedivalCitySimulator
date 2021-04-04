package org.pungrammer.medivalcitysim.entity.tiles;

import lombok.EqualsAndHashCode;
import org.pungrammer.medivalcitysim.entity.faction.Faction;

@EqualsAndHashCode(callSuper = true)
public class CommerceDistrict extends SettlementDistrict {
    public CommerceDistrict(final String name,
                            final long wealth,
                            final Faction officialFaction,
                            final Faction unofficialFaction,
                            final int unofficialFactionStealth) {
        super(name, wealth, officialFaction, unofficialFaction, unofficialFactionStealth);
    }
}
