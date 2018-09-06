# shadow-clj-lein

Example how to use shadow-cljs within lein repl

## Installation

Clone project and start repl either via `lein repl` or in your IDE

## Usage

First you'd need to start shadow-cljs server

```clojure
(shadow/start!)
; You can stop it later using
(shadow/stop!)
```
  
Then to start built-in http server with hot-reload

```clojure
(cljs/watch :app)
; And if you'd like to stop it
(cljs/stop-worker :app)
```

## License

Copyright © 2018 EPL

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
