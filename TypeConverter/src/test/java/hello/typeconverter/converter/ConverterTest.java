package hello.typeconverter.converter;

import hello.typeconverter.type.IpPort;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.Test;

public class ConverterTest {

    @Test
    void stringToInteger() {
        StringToIntegerConverter converter = new StringToIntegerConverter();
        Integer result = converter.convert("10");
        Assertions.assertThat(result).isEqualTo(10);
    }

    @Test
    void IntegerToString() {
        IntegerToStringConverter converter = new IntegerToStringConverter();
        String result = converter.convert(10);
        Assertions.assertThat(result).isEqualTo("10");
    }

    @Test
    void StringToPort() {
        IpPortToStringConverter converter = new IpPortToStringConverter();
        IpPort source = new IpPort("127.0.0.1", 8090);
        String result = converter.convert(source);
        Assertions.assertThat(result).isEqualTo("127.0.0.1:8090");
    }

    @Test
    void ipPortToString() {
        StringIpPortConverter converter = new StringIpPortConverter();
        String source = "127.0.0.1:8090";
        IpPort result = converter.convert(source);
        AssertionsForClassTypes.assertThat(result).isEqualTo(new IpPort("127.0.0.1", 8090));
    }
}
