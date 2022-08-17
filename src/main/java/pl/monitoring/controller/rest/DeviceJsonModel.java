package pl.monitoring.controller.rest;

import com.fasterxml.jackson.annotation.JsonProperty;
import pl.monitoring.model.Device;


public class DeviceJsonModel {
    @JsonProperty("device_id")
    public String deviceId;
    @JsonProperty("device_name")
    public String deviceName;
    @JsonProperty("address_ip")
    public String addressIp;
    @JsonProperty("port")
    public String port;

    public Device toDevice() {
        return new Device(this.deviceId, this.deviceName, this.addressIp, this.port);
    }
}
