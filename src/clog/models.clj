(comment "Entity definitions for Clog using Korma.
          To get the list of users from the database run the following code in REPL:
          (use 'korma.db 'korma.core 'clog.models)
          (select users)
          ")

(ns clog.models
  (:use korma.db
        korma.core))

;;; Defines the database for lobos migrations
(defdb clogdb
  {:classname "org.postgresql.Driver"
   :subprotocol "postgresql"
   :subname "clogdb"
   :user "clog"
   :password "clog"})

(defentity users)
(defentity posts)