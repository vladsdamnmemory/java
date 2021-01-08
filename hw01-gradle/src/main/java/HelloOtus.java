import com.google.common.net.HostAndPort;

public class HelloOtus {
    void testGradle() {
        HostAndPort hp = HostAndPort.fromString("[2001:db8::1]")
                .withDefaultPort(80)
                .requireBracketsForIPv6();
    }
}
