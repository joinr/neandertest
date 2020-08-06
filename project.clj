(defproject neandertest "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [uncomplicate/neanderthal "0.35.0"]
                 [org.bytedeco/mkl-platform-redist "2020.1-1.5.3"]
                 ]
  :profiles {:uberjar {:aot :all}})
