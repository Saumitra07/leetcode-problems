package com.company;

import java.util.*;

public class Twitter {

    HashMap<Integer,List<Integer>> tweets;
    HashMap<Integer,List<Integer>> followers;
    List<Integer> followers_of_user;
    List<Integer> tweets_of_user;
    HashMap<Integer,List<Integer>> newsfeed;
    List<Integer> feed;

    public Twitter() {
        tweets_of_user=new ArrayList<>();
        followers_of_user=new ArrayList<>();
        feed=new ArrayList<>();
        tweets=new HashMap<>();
        followers=new HashMap<>();
        newsfeed=new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {

//      tweets_of_user=tweets.get(userId);
//        if(tweets_of_user==null)
//        {
//            tweets_of_user=new ArrayList<>();
//        }
//        tweets_of_user.add(tweetId);
//        tweets.put(userId,tweets_of_user);
//        System.out.println(tweets);
        feed=newsfeed.get(userId);
        if(feed==null)
        {
           feed=new ArrayList<>();
        }
        feed.add(tweetId);
        newsfeed.put(userId,feed);

//        for (Map.Entry mapElement : followers.entrySet()) {
//            int key = (int)mapElement.getKey();
//
//           // Add some bonus marks
//            // to all the students and print it
//            List<Integer> f=followers.get(key);
//
//            if(f.contains(userId))
//            {
//                  tweets_of_user=newsfeed.get(key);
//                if(tweets_of_user==null)
//                 {
//                  tweets_of_user=new ArrayList<>();
//                  }
//                  tweets_of_user.add(0,tweetId);
//                  //  feed.add(0,tweetId);
//                newsfeed.put(key,tweets_of_user);
//            }
//           // System.out.println(key + " : " + value);
//        }
        System.out.println("new post"+newsfeed);
    }

    public List<Integer> getNewsFeed(int userId) {

        List<Integer> final_res=new ArrayList<>();

        List<Integer> f=followers.get(userId);
        if(f!=null) {
            for (int i = 0; i < f.size(); i++) {
                if (newsfeed.get(f.get(i)) != null) {
                    final_res.addAll(newsfeed.get(f.get(i)));
                }
            }
        }
        final_res.addAll(newsfeed.get(userId));
        return final_res;
    }

    public void follow(int followerId, int followeeId) {
       followers_of_user=followers.get(followerId);
        if(followers_of_user==null)
        {
            followers_of_user=new ArrayList<>();
        }
        followers_of_user.add(0,followeeId);
        followers.put(followerId,followers_of_user);
        System.out.println("followers are:"+followers);

    }

    public void unfollow(int followerId, int followeeId) {
      //  System.out.println(followers);
        followers_of_user=followers.get(followerId);
        for(int i=0;i<followers_of_user.size();i++)

        {
            if(followers_of_user.get(i)==followeeId)
            {
                followers_of_user.remove(i);


            }
        }
        //followers_of_user.remove(followerId);
        followers.put(followerId,followers_of_user);
        System.out.println("followers are:"+followers);

    }
    public static void main(String[] args) {
        Twitter twitter = new Twitter();
        twitter.postTweet(1, 5); // User 1 posts a new tweet (id = 5).
        System.out.println("first news feed"+twitter.getNewsFeed(1));  // User 1's news feed should return a list with 1 tweet id -> [5]. return [5]
        twitter.follow(1, 2);    // User 1 follows user 2.
        twitter.postTweet(2, 6); // User 2 posts a new tweet (id = 6).
        System.out.println("second news feed"+twitter.getNewsFeed(1));  // User 1's news feed should return a list with 2 tweet ids -> [6, 5]. Tweet id 6 should precede tweet id 5 because it is posted after tweet id 5.

        twitter.unfollow(1, 2);  // User 1 unfollows user 2.
        twitter.getNewsFeed(1);  // User 1's news feed should return a list with 1 tweet id -> [5], since user 1 is no longer following user 2.

    }
}
