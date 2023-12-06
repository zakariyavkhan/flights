package com.zakariyakhan.flights;

import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "flights")
public class Flight {

    @Id
    private String id;

    private String gate;
    private String airline;
    @Field("src_dest")
    private String srcDest;
    @Field("flight_num")
    private String flightNum;
    @Field("scheduled_timestamp")
    private LocalDateTime scheduledTimestamp;
    @Field("actual_timestamp")
    private LocalDateTime actualTimestamp;
    private String type;

    public Flight() {
    }

    public Flight(String gate, String airline, String srcDest, String flightNum, LocalDateTime scheduledTimestamp,
            LocalDateTime actualTimestamp, String type) {
        this.gate = gate;
        this.airline = airline;
        this.srcDest = srcDest;
        this.flightNum = flightNum;
        this.scheduledTimestamp = scheduledTimestamp;
        this.actualTimestamp = actualTimestamp;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getGate() {
        return gate;
    }

    public String getAirline() {
        return airline;
    }

    public String getSrcDest() {
        return srcDest;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public LocalDateTime getScheduledTimestamp() {
        return scheduledTimestamp;
    }

    public LocalDateTime getActualTimestamp() {
        return actualTimestamp;
    }

    public String getType() {
        return type;
    }

}
