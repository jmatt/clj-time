(defproject clj-time "0.3.2"
  :description "A date and time library for Clojure, wrapping Joda Time."
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [joda-time "1.6"]]
  :dev-dependencies [[swank-clojure "1.4.0-SNAPSHOT"]
                     [lein-multi "1.1.0-SNAPSHOT"]]
  :multi-deps {"1.2" [[org.clojure/clojure "1.2.0"]
                      [joda-time "1.6"]]})
