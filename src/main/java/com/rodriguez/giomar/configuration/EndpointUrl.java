package com.rodriguez.giomar.configuration;

public final class EndpointUrl {
    public static final String PLAYERS = "/api/players";
    public static final String PLAYERS_BY_PLAYER_ID = "/api/players/{playerID}";
    public static final String PLAYERS_SEARCH = "/api/players/search";

    public static final String BATTINGS_BY_PLAYER_ID = "/api/{playerID}/battings";
    public static final String BATTINGS_SEARCH_TOP = "/api/battings/search/top";
    public static final String BATTINGS = "/api/battings";
    public static final String BATTINGS_SEARCH = "/api/battings/search";

    public static final String PITCHINGS = "/api/pitchings";
    public static final String PITCHINGS_BY_PLAYER_ID = "/api/{playerId}/pitchings";
    public static final String PITCHINGS_SEARCH_TOP = "/api/pitchings/search/top";
}
