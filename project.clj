(defproject dskel "0.1.0-SNAPSHOT"
  :description "Datomic Skeleton Project"
  :url "https://github.com/espeed/dskel"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0-beta3"]
                 [com.datomic/datomic "0.1.2753"]
                 [ring/ring-jetty-adapter "1.0.1"]
                 [stencil "0.2.0"]]
  :main dskel.core)


