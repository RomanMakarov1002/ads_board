(ns ads-board.feadback
  (:require [clojure.java.jdbc :as jdbc]
            [clojure.java.jdbc.sql :as sql]))

(def mysql-db {:subprotocol "mysql"
               :subname "//localhost:3306/ad_db"
               :user "root"
               :password ""
               :zeroDateTimeBehavior "convertToNull"})

(defn read-all []
  (jdbc/query mysql-db
    (sql/select * :feadback)))