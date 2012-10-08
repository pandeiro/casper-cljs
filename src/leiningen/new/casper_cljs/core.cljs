(ns {{name}}.core
  (:require [ghost.core :as casper]))

;;
;; For complete wrapper API, see:
;; https://github.com/pandeiro/ghost/blob/master/src/ghost/core.cljs#L28
;;
(casper/start
 "http://..."
 (fn [] ))

(casper/then
 (fn [] ))

(casper/run)
