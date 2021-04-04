package org.pungrammer.medivalcitysim.entity.resource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resource {
    private int militaryPower;
    private int politicalPower;
    private int economicalPower;
}
