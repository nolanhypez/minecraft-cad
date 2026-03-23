// Dispatch.java

package com.nolanhypez.cad.model;

import java.time.LocalDateTime;
import java.util.List;

public class Dispatch {
    private String dispatchId;
    private LocalDateTime timestamp;
    private String status;
    private List<String> recipients;

    public Dispatch(String dispatchId, LocalDateTime timestamp, String status, List<String> recipients) {
        this.dispatchId = dispatchId;
        this.timestamp = timestamp;
        this.status = status;
        this.recipients = recipients;
    }

    public String getDispatchId() {
        return dispatchId;
    }

    public void setDispatchId(String dispatchId) {
        this.dispatchId = dispatchId;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getRecipients() {
        return recipients;
    }

    public void setRecipients(List<String> recipients) {
        this.recipients = recipients;
    }
}