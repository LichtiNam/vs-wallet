package de.berlin.fu.vs;

import akka.actor.ActorRef;
import akka.actor.UntypedActor;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.actor.Inbox;

import java.io.Serializable;

public class Wallet extends AbstractWallet {
    
    public static void main(String[] args) {
        // Create the 'helloakka' actor system
        final ActorSystem system = ActorSystem.create("FuCoin");

        // Create the 'greeter' actor
        final ActorRef greeter = system.actorOf(Props.create(Wallet.class, "walletname"), "wallet");

        // Create the "actor-in-a-box"
        final Inbox inbox = Inbox.create(system);
    }
    
    public Wallet(String name)
    {
        super(name);
    }

    public void onReceive(Object message) {
        // TODO implement
        
        /*
        if (message instanceof ActionReceiveTransaction)
        {
            System.out.println("hello, " + ((ActionReceiveTransaction) message).amount;
        }
        else if (message instanceof ActionReceiveTransaction) {
            // Send the current greeting back to the sender
            getSender().tell(new ActionReceiveTransaction(0.01), getSelf());
        }
        else {
            unhandled(message);
        }
        */
        
    }
    
    public String getAddress() {
        // TODO implement
        return "";
    }
    
    public void leave() {
        // TODO implement
    }
    
}