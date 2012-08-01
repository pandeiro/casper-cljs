(ns leiningen.new.casper-cljs
  (:use [leiningen.new.templates :only [renderer name-to-path ->files]]))

(def render (renderer "clasp"))

(defn casper-cljs
  "Renders a new project for using CasperJS from ClojureScript"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (println "Generating a new CasperJS project in" name)
    (->files data
             ["project.clj" (render "project.clj" data)]
             ["src-cljs/{{sanitized}}/core.cljs" (render "core.cljs" data)])))
