package pl.monitoring.model;

public class Device {
    private final String deviceId;
    private final String deviceName;
    private String addressIp;
    private String port;

    public Device(String deviceId, String deviceName, String addressIp, String port) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.addressIp = addressIp;
        this.port = port;
    }

    public String addressIp() {
        return this.addressIp;
    }

    @Override
    public String toString() {
        return "Device{" +
                "deviceId='" + deviceId + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", addressIp='" + addressIp + '\'' +
                ", port='" + port + '\'' +
                '}';
    }
}
