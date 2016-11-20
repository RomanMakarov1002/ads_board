(ns ads-board.views
	(:use hiccup.page
		  hiccup.element
     :require [ads-board.layout :as layout]))

(defn index-page [] 
	(layout/render
    "home.html" {:docs "document"}))

;;users

(defn all-users-page [users deleted added param]
	(layout/render
		"users/all_users.html" {:users users :deleted deleted :added added :param param}))

(defn add-user-page []
	(layout/render
		"users/add_user.html"))

(defn user-page [user updated]
	(layout/render
		"users/user.html" {:user user :updated updated}))

(defn login []
	(layout/render
		"users/login.html"))
;;posts

(defn all-posts-page [posts deleted added param]
	(layout/render
		"posts/all_posts.html" {:posts posts :deleted deleted :added added :param param}))

(defn add-post-page []
	(layout/render
		"posts/add_post.html"))

(defn post-page [post updated]
	(layout/render
		"posts/post.html" {:post post :updated updated}))

;;feadback

(defn all-feadback-page [feadback deleted added param]
	(layout/render
		"comments/all_comments.html" {:feadback feadback :deleted deleted :added added :param param}))