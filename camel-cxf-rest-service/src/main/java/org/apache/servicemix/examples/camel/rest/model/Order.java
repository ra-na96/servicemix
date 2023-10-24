package org.apache.servicemix.examples.camel.rest.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
public class Order implements Serializable {
    private int id;
    private String item;
    private int amount;
    private String description;
    private boolean processed;
    private boolean consumed;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isProcessed() {
        return processed;
    }

    public void setProcessed(boolean processed) {
        this.processed = processed;
    }

    public boolean isConsumed() {
        return consumed;
    }

    public void setConsumed(boolean consumed) {
        this.consumed = consumed;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", item='" + item + '\'' +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", processed=" + processed +
                ", consumed=" + consumed +
                '}';
    }
}