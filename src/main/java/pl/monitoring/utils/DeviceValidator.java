package pl.monitoring.utils;

import com.google.common.net.InetAddresses;
import lombok.NoArgsConstructor;
import pl.monitoring.exception.ValidationException;
import pl.monitoring.model.Device;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public final class DeviceValidator {
    public static void validateDevice(Device device) throws ValidationException {
        validateIpAddress(device.addressIp());
    }

    private static void validateIpAddress(String ipAddress) throws ValidationException {
        if (!InetAddresses.isInetAddress(ipAddress)) {
            throw new ValidationException("IP address is not correct");
        }
    }
}
