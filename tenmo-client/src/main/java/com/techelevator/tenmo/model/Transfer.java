package com.techelevator.tenmo.model;

import java.math.BigDecimal;

/**
 * Represents a transfer of funds in the TEnmo application.
 */
public class Transfer {
    private int transferId;
    private int fromUserId;
    private int toUserId;
    private BigDecimal amount;
    private String status;
    private int transferStatusId;
    private int transferTypeId;
    private int accountFrom;
    private int accountTo;

    public Transfer() {}

    public Transfer(int transferId, int fromUserId, int toUserId, BigDecimal amount, String status, int transferStatusId, int transferTypeId, int accountFrom, int accountTo) {
        this.transferId = transferId;
        this.fromUserId = fromUserId;
        this.toUserId = toUserId;
        this.amount = amount;
        this.status = status;
        this.transferStatusId = transferStatusId;
        this.transferTypeId = transferTypeId;
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
    }

    public int getTransferId() { return transferId; }
    public void setTransferId(int transferId) { this.transferId = transferId; }

    public int getFromUserId() { return fromUserId; }
    public void setFromUserId(int fromUserId) { this.fromUserId = fromUserId; }

    public int getToUserId() { return toUserId; }
    public void setToUserId(int toUserId) { this.toUserId = toUserId; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public int getTransferStatusId() { return transferStatusId; }
    public void setTransferStatusId(int transferStatusId) { this.transferStatusId = transferStatusId; }

    public int getTransferTypeId() { return transferTypeId; }
    public void setTransferTypeId(int transferTypeId) { this.transferTypeId = transferTypeId; }

    public int getAccountFrom() { return accountFrom; }
    public void setAccountFrom(int accountFrom) { this.accountFrom = accountFrom; }

    public int getAccountTo() { return accountTo; }
    public void setAccountTo(int accountTo) { this.accountTo = accountTo; }

    @Override
    public String toString() {
        return "Transfer{" +
                "transferId=" + transferId +
                ", fromUserId=" + fromUserId +
                ", toUserId=" + toUserId +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                ", transferStatusId=" + transferStatusId +
                ", transferTypeId=" + transferTypeId +
                ", accountFrom=" + accountFrom +
                ", accountTo=" + accountTo +
                '}';
    }
}
