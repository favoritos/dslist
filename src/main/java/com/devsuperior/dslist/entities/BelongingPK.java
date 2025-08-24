package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelongingPK {
    
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne
    @JoinColumn(name = "game_list_id")
    private GameList gameList;

    public BelongingPK(){}

    public BelongingPK(Game game, GameList gameList){
        this.game = game;
        this.gameList = gameList;
    }
    public Game getGame() {
        return game;
    }

    public GameList getGameList() {
        return gameList;
    }

    public void setGame(Game game) {
        this.game = game;
    }
    public void setList(GameList gameList) {
        this.gameList = gameList;
    }

    @Override
    public int hashCode() {
        return Objects.hash(game, gameList);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;
        BelongingPK other = (BelongingPK) obj;
        return game != null && game.equals(other.game) &&
               gameList != null && gameList.equals(other.gameList);
    }
}
