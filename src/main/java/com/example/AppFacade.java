package com.example;

public class AppFacade {
  private Client client;
  private ClientServer clientServer;
  private RecipientServer recipientServer;
  private Recipient recipient;

  public AppFacade() {
    this.client = new Client();
    this.clientServer = new ClientServer();
    this.recipient = new Recipient();
    this.recipientServer = new RecipientServer();
  }

  public void sendMessage() {
    client.connectToServer();
    clientServer.authenticateClient();
    clientServer.routeToRecipient();
    recipientServer.authenticateRecipient();
    recipientServer.sendMessage();
    recipient.receiveMessage();
  }

}
