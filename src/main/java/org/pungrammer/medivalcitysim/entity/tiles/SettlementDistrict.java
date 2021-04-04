package org.pungrammer.medivalcitysim.entity.tiles;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.pungrammer.medivalcitysim.entity.faction.Faction;

@Data
@AllArgsConstructor
public abstract class SettlementDistrict {
    private String name;
    private long wealth;

    private Faction officialFaction;
    private Faction unofficialFaction;

    // The higher this is, the harder it is for the official faction to know they are not really the ones in charge.
    // If this value is high, the official faction will only gain a tiny percentage of the resources produced in this
    //  district
    private int unofficialFactionStealth;

    // TODO: "Landmarks" like rivers, coast, main roads, etc
    // TODO: "Installations" like walls, inn, mines, smithies, etc
}
