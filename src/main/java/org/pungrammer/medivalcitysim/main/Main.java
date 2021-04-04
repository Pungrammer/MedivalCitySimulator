package org.pungrammer.medivalcitysim.main;

import org.pungrammer.medivalcitysim.entity.city.City;
import org.pungrammer.medivalcitysim.entity.faction.Faction;
import org.pungrammer.medivalcitysim.entity.faction.FactionType;
import org.pungrammer.medivalcitysim.entity.faction.Leader;
import org.pungrammer.medivalcitysim.entity.resource.Resource;
import org.pungrammer.medivalcitysim.entity.tiles.DocksDistrict;
import org.pungrammer.medivalcitysim.entity.tiles.GoverningDistrict;
import org.pungrammer.medivalcitysim.entity.tiles.HousingDistrict;
import org.pungrammer.medivalcitysim.entity.tiles.ReligiousDistrict;

public class Main {

    public static void main(final String[] args) {
        City city = init();


    }

    private static City init() {
        Faction empire = new Faction();
        empire.setName("Empire");
        empire.setType(FactionType.GOVERNMENT);
        empire.setResource(new Resource(1000, 1000, 1000));
        empire.setLeader(new Leader("Theodore Everglade"));

        Faction syndicate = new Faction();
        syndicate.setName("Syndicate");
        syndicate.setType(FactionType.CRIMINAL);
        syndicate.setResource(new Resource(200, 200, 500));

        Faction church = new Faction();
        church.setName("Church");
        church.setType(FactionType.RELIGIOUS);
        church.setResource(new Resource(100, 1000, 200));

        DocksDistrict docksDistrict = new DocksDistrict("Peaceful Harbor", 500, empire, syndicate, 700);
        HousingDistrict poorHousingDistrict = new HousingDistrict("Workers District", 200, empire, syndicate, 500);
        GoverningDistrict governingDistrict = new GoverningDistrict("Palace", 10_000, empire, syndicate, 0);
        HousingDistrict richHousingDistrict = new HousingDistrict("Noble District", 8_000, empire, empire, 0);
        ReligiousDistrict religiousDistrict = new ReligiousDistrict("Church", 2_000, church, church, 0);

        City city = new City();
        city.addNeighbours(docksDistrict, poorHousingDistrict);
        city.addNeighbours(poorHousingDistrict, religiousDistrict);
        city.addNeighbours(religiousDistrict, richHousingDistrict);
        city.addNeighbours(richHousingDistrict, governingDistrict);

        city.printNeighbours();

        return city;
    }
}
