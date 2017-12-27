package de.android.wordpressconnect;


public class Config {
    //The Config.json file that defines your app's content.
    //Point url to JSON or leave empty to use config.json from assets.
    public static String CONFIG_URL = "";

    //To open links in the WebView or outside the WebView.
    public static final boolean OPEN_EXPLICIT_EXTERNAL = true;
    public static final boolean OPEN_INLINE_EXTERNAL = false;

    //To open videos in our Local player or outside the local player
    public static final boolean PLAY_EXTERNAL = false;

    //Wordpress perma-friendly API requests (JSON API)
    public static final boolean USE_WP_FRIENDLY = true;

    //If the drawer should be disabled
    public static final boolean HIDE_DRAWER = false;

    //The frequency in which interstitial ads are shown
    //('0' to never show, '1' to always show, '2' to show 1 out of 2, etc)
    public static final int INTERSTITIAL_INTERVAL = 5;
}