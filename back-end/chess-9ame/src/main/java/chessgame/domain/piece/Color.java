package chessgame.domain.piece;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Color {

    @Id
    @GeneratedValue
    private Long id;
    private String value;

    public Color() {
    }

    public Color(String value) {
        this.value = value;
    }

    public static Color black() {
        return new Color("black");
    }

    public static Color white() {
        return new Color("white");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Color color = (Color) o;
        return Objects.equals(value, color.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
