package bench;

import gaussin.Gaussian;
import org.openjdk.jmh.annotations.Benchmark;

public class Test {
    @Benchmark
    public void testCdf() {
        Gaussian.cdf(0, 0, 1);
    }

    @Benchmark
    public void testInverseCdf() {
        Gaussian.inverseCDF(0.1);
    }
}
