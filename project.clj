(defproject structured-data "1.0.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [iloveponies.tests/structured-data "0.1.0-SNAPSHOT"]]
  :profiles {:dev {:plugins [[lein-midje "3.1.1"]]}}
  :mirrors {"central" {:name "Maven med http"
                       :url "http://repo1.maven.org/maven2"}
            #"clojars" {:name "Internal nexus"
                        :url "http://clojars.org/repo"
                        :repo-manager true}})

