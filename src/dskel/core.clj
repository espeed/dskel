(ns dskel.core
  (:use [datomic.api :only [db q] :as d]))

;; store database uri
(def uri "datomic:mem://seattle")

;; create database
(d/create-database uri)

;; connect to database
(def conn (d/connect uri))

;; parse schema dtm file
(def schema-tx (read-string (slurp "samples/seattle/seattle-schema.dtm")))

(defn -main
  "I don't do a whole lot."
  [& args]

  (println "It works! Here's the first statement of the sample schema...")
  (println (first schema-tx)))
