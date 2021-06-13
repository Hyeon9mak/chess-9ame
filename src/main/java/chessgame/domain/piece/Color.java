package chessgame.domain.piece;

import java.util.Objects;

public class Color {

    private final String value;

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
