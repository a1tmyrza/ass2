class FahrenheitToCelsiusAdapter implements CelsiusTemperature {
    private FahrenheitTemperature fahrenheitTemperature;

    public FahrenheitToCelsiusAdapter(FahrenheitTemperature fahrenheitTemperature) {
        this.fahrenheitTemperature = fahrenheitTemperature;
    }

    @Override
    public double getCelsius() {
        // Conversion formula: (°F - 32) * 5/9
        return (fahrenheitTemperature.getFahrenheit() - 32) * 5.0 / 9.0;
    }
}
