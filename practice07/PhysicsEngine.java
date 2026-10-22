package semester1.practice07;

public class PhysicsEngine {
    private PhysicsEngine() {
    }

    public static final double G = 9.80665;
    public static final double SPEED_OF_LIGHT = 299792458.0;

    public static double freeFallDistance(double seconds) {
        if (seconds < 0) {
            return 0.0;
        }
        return (G * seconds * seconds) / 2.0;
    }

    public static double kineticEnergy(double massKg, double velocityMs) {
        if (massKg < 0 || velocityMs < 0) {
            return 0.0;
        }
        return (massKg * velocityMs * velocityMs) / 2.0;
    }

    public static double restEnergy(double massKg) {
        if (massKg < 0) {
            return 0.0;
        }
        return massKg * SPEED_OF_LIGHT * SPEED_OF_LIGHT;
    }
}

