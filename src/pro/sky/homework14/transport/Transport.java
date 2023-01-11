package pro.sky.homework14.transport;

public abstract class Transport {
    private String mark;
    private String model;
    private final int year;
    private final String country;
    private String bodyColor;
    private int maxSpeed;

    protected static final String DEFAULT_VALUE = "default value";
    private static final String DEFAULT_COLOR = "white";
    private static final int DEFAULT_SPEED = 120;
    private static final int DEFAULT_YEAR = 2000;

    public Transport(String mark, String model, int year, String country, String bodyColor, int maxSpeed) {
        if (mark == null || mark.isBlank()) {
            this.mark = DEFAULT_VALUE;
        } else {
            this.mark = mark;
        }
        if (model == null || model.isBlank()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = model;
        }
        if (year <= 0) {
            this.year = DEFAULT_YEAR;
        } else {
            this.year = year;
        }
        if (country == null || country.isBlank()) {
            this.country = DEFAULT_VALUE;
        } else {
            this.country = country;
        }
        setBodyColor(bodyColor);
        setMaxSpeed(maxSpeed);
    }

    public void setBodyColor(String bodyColor) {
        if (bodyColor == null || bodyColor.isBlank()) {
            this.bodyColor = DEFAULT_COLOR;
        } else {
            this.bodyColor = bodyColor;
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed == 0) {
            this.maxSpeed = DEFAULT_SPEED;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Transport " +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", bodyColor='" + bodyColor + '\'' +
                ", maxSpeed=" + maxSpeed;
    }
}
