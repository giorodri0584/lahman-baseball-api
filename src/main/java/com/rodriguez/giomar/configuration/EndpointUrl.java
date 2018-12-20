package com.rodriguez.giomar.configuration;

public final class EndpointUrl {
    public static final String PLAYERS = "/players";
    public static final String PLAYERS_PLAYERID = "/players/{playerID}";
    public static final String PLAYER_SEARCH = "/players/search";

    public static final String BATTINGS_PLAYER = "/{playerID}/battings";
    public static final String BATTINGS_SEARCH_TOP = "battings/search/top";

    public static final String PITCHINGS = "/pitchings";
    public static final String PITCHINGS_PLAYER = "/{playerId}/pitchings";
    public static final String PITCHINGS_SEARCH_TOP = "/pitchings/search/top";
}
