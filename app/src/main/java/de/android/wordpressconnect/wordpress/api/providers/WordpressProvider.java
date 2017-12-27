package de.android.wordpressconnect.wordpress.api.providers;


import java.util.ArrayList;

import de.android.wordpressconnect.wordpress.PostItem;
import de.android.wordpressconnect.wordpress.api.WordpressGetTaskInfo;

public interface WordpressProvider {

    String getRecentPosts(WordpressGetTaskInfo info);

    String getTagPosts(WordpressGetTaskInfo info, String tag);

    String getCategoryPosts(WordpressGetTaskInfo info, String category);

    String getSearchPosts(WordpressGetTaskInfo info, String query);

    ArrayList<PostItem> parsePostsFromUrl(WordpressGetTaskInfo info, String url);

}
