import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
@Data
@AllArgsConstructor
public class Repair {

    private String name;
    private double coast;
    private LocalDate repairDate;
}
