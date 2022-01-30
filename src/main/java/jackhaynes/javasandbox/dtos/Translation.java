package jackhaynes.javasandbox.dtos;

import java.util.Objects;

public class Translation {
    private String languageFrom;
    private String languageTo;
    private String translationFrom;
    private String translationTo;

    public Translation() {
    }

    public Translation(String languageFrom, String languageTo,
                       String translationFrom, String translationTo) {
        this.languageFrom = languageFrom;
        this.languageTo = languageTo;
        this.translationFrom = translationFrom;
        this.translationTo = translationTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Translation that = (Translation) o;

        return Objects.equals(languageFrom, that.languageFrom) &&
                Objects.equals(languageTo, that.languageTo) &&
                Objects.equals(translationFrom, that.translationFrom) &&
                Objects.equals(translationTo, that.translationTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(languageFrom, languageTo, translationFrom, translationTo);
    }
}
