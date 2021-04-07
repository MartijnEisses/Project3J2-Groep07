package root.server;
import root.Connection;
import root.controller.configSenderController;


import java.util.concurrent.BlockingDeque;// FIFO principe voor het versturen van commands
import java.util.concurrent.LinkedBlockingQueue;

public class ServerCommands {
    private LinkedBlockingQueue commandQueue;
    private Connection newConnection;

    public ServerCommands(){
        commandQueue = new LinkedBlockingQueue<>();


    }

    public boolean connection(String ip, int port){


        newConnection = new Connection();

        return false;
    }


    public void login(String name){
        commandQueue.add("login " + name);
    }

    public void logout(){
        commandQueue.add("logout");
    }

    public void getPlayerlist(){
        commandQueue.add("get playerlist");
    }

    public void getGamelist(){
        commandQueue.add("get gamelist");
    }

    public void acceptGameChallenge(int gameID){
        commandQueue.add("challenge accept"+  gameID);
    }

    public void challengePlayer(String opponent, String gamemode){
        commandQueue.add("challenge " + opponent + gamemode);
    }

    public void setMove(int position){
        commandQueue.add("move " + position);
    }

    public void forfeit(){
        commandQueue.add("forfeit");
    }

    public void getHelp(){
        commandQueue.add("help");
    }

    public void addObserver(Observers observer){

    }



}