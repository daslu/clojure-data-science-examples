(defproject clojure-data-science-examples "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories [["clojars" {:url "https://clojars.org/repo/"}]
                 ["betadriven public repo" {:url "https://nexus.bedatadriven.com/content/groups/public/"}]]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.rpl/specter "1.0.4"]
                 [net.mikera/core.matrix "0.61.0"]
                 [hiccup "2.0.0-alpha1"]
                 [rojure "0.2.0"]
                 [gg4clj "0.1.0"]
                 [huri "0.5.0-SNAPSHOT"] ; last pre- clojure 1.9.0 version of huri
                 [json-html "0.4.4"]
                 [plotly-clj "0.1.1"]
                 [hswick/jutsu "0.1.1"]
                 [gorilla-repl "0.4.0"]
                 [com.lemondronor.leaflet-gorilla "0.1.2"]
                 [org.renjin/renjin-script-engine "0.8.2539"]]
  :plugins [[lein-jupyter "0.1.8"]])


