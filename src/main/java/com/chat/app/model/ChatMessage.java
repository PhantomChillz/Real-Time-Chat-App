package com.chat.app.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ChatMessage {
    private long id;

    @JsonProperty("sender")  // Ensures proper JSON mapping
    private String sender;

    @JsonProperty("content")
    private String content;
}
