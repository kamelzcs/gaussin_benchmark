package gaussin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GaussianTest {

    @Test
    void inverseCDF() {
        double mean = 1;
        double standardDeviation = 1;
        double p = 0.1;
        double point = Gaussian.inverseCDF(p) * standardDeviation + mean;
        assertEquals(Gaussian.cdf(point, mean, standardDeviation), p, 1e-5);
    }
}