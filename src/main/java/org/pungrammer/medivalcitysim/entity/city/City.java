package org.pungrammer.medivalcitysim.entity.city;

import lombok.Data;
import org.pungrammer.medivalcitysim.entity.tiles.SettlementDistrict;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Data
public class City {
    private Set<SettlementDistrict> districts;
    private Map<SettlementDistrict, Set<SettlementDistrict>> neighbours;

    public City() {
        districts = new HashSet<>();
        neighbours = new HashMap<>();
    }

    /**
     * Adds the two districts as neighbouring districts. If the districts are not yet known, they will be added to the city.
     *
     * @param first  The first district to link
     * @param second The second district to link
     */
    public void addNeighbours(final SettlementDistrict first, final SettlementDistrict second) {
        districts.add(first);
        districts.add(second);

        addNeighbour(first, second);
        addNeighbour(second, first);
    }

    private void addNeighbour(SettlementDistrict source, SettlementDistrict destination) {
        Set<SettlementDistrict> districts = neighbours.get(source);
        if (districts == null) {
            districts = new HashSet<>();
        }
        districts.add(destination);
        neighbours.put(source, districts);
    }

    public void printNeighbours(){
        this.getNeighbours().forEach((sourceDistrict, destinationDistricts) -> {
            String neighbours = destinationDistricts.stream()
                    .map(SettlementDistrict::getName).collect(Collectors.joining(" and the "));

            System.out.printf("The %s is next to the %s.%n", sourceDistrict.getName(), neighbours);
        });
    }
}
