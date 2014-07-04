(ns {{name}}.core
  (:require [ghost.core :as casper]))

;;
;; For complete wrapper API, see:
;; https://github.com/pandeiro/ghost/blob/master/src/ghost/core.cljs#L28
;;
(def ua (str "Mozilla/5.0 (X11; Linux x86_64) "
             "AppleWebKit/536.11 (KHTML, like Gecko) "
             "Lambdarat/23.0.1062.57"))

(casper/set-casper-options!
 {:verbose      true
  :viewportSize {:width 1024 :height 768}
  :pageSetting  {:loadImages false
                     :userAgent  ua}})

(casper/start
 "http://www.google.com"
 (fn [] (casper/echo "Loaded Google!")))

(casper/then
 (fn [] (casper/echo "Still at Google!")))

(casper/run)
