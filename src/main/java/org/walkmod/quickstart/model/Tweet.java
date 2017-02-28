package org.walkmod.quickstart.model;

import java.util.Date;

import javax.annotation.Nullable;

public class Tweet {

   @Nullable private User user;

   public String text;

   private Date date;

       public Tweet() {}

   public Tweet(User user, String text) {
      this.user = user;
      this.text = text;
      date = new Date();
   }
}
