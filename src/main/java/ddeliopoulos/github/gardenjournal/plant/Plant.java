package ddeliopoulos.github.gardenjournal.plant;

import lombok.*;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
class Plant {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Convert(converter = PlantColorConverter.class)
    private PlantColor color;
    private Integer heightInInches;

}