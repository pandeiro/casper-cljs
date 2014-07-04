(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "A CasperJS project"
  :url "http://notyet.com"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2261"]
                 [ghost "0.1.0-alpha1"]]
  :plugins [[lein-cljsbuild "1.0.3"]]
  :cljsbuild
  {:builds [{:source-paths ["src-cljs"]
             :compiler {:output-to "target/{{sanitized}}.js"
                        :optimizations :whitespace, :pretty-print true}}]}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"})



