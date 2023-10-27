package hu.codehunters.messages.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class outputMessage {

    @JsonProperty("posted_messages")
    private int postedMessages;

    @JsonProperty("average_length")
    private double averageLength;

    @JsonProperty("occurences")
    private Occurences occurences;
}
