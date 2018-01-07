(defproject thheller/shadow-cljs-deps "1.0.1"
  :dependencies
  [[org.clojure/clojure "1.9.0"]
   [com.cemerick/pomegranate "1.0.0"]
   [org.slf4j/slf4j-nop "1.7.25"]]

  :aot :all
  :main shadow.cljs.npm.deps)
