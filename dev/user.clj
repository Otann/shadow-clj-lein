(ns user
  (:require [shadow.cljs.devtools.api :as cljs]
            [shadow.cljs.devtools.server :as shadow]))


(comment

  (shadow/start!)
  (shadow/stop!)

  (cljs/watch :app)
  (cljs/stop-worker :app)

  )