(defproject shadow-clj-lein "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [thheller/shadow-cljs "2.6.3"]]

  :main ^:skip-aot shadow-clj-lein.main

  :source-paths ["src/clj" "src/cljs" "src/cljc"]
  :test-paths ["test/src/clj" "test/src/cljc"]
  :target-path "target/%s"

  :aliases {"js-watch" ["run" "-m" "shadow.cljs.devtools.cli" "watch" "app"]
            "js-build" ["run" "-m" "shadow.cljs.devtools.cli" "release" "app"]}

  :profiles {:dev     {:repl-options {:init-ns user}
                       :source-paths ["dev"]}
             :uberjar {:aot :all
                       :prep-tasks ["compile" "js-build"]}})
